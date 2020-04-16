package died.guia06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import died.guia06.util.Registro;


/**
 * Clase que representa un curso. Un curso se identifica por su ID y por su nombre y ciclo lectivo.
 * Un curso guarda una lista de los inscriptos actuales que tienen.
 * Un curso, al aprobarlo, otorga una cantidad de creditos definidas en el curso.
 * Un curso requiere que para inscribirnos tengamos al menos la cantidad de creditos requeridas, y que haya cupo disponible
 * @author marti
 *
 */
public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
	}
	
	
	public Curso(Integer id, String nombre, Integer cicloLectivo, Integer cupo,
			Integer creditos, Integer creditosRequeridos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cicloLectivo = cicloLectivo;
		this.cupo = cupo;
		this.inscriptos = new ArrayList<Alumno>();
		this.creditos = creditos;
		this.creditosRequeridos = creditosRequeridos;
	}
	
	//getters and setters
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCupo() {
		return cupo;
	}


	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}


	public List<Alumno> getInscriptos() {
		return inscriptos;
	}


	public void setInscriptos(List<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}


	public Integer getCreditosRequeridos() {
		return creditosRequeridos;
	}


	public void setCreditosRequeridos(Integer creditosRequeridos) {
		this.creditosRequeridos = creditosRequeridos;
	}


	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}


	public Integer getCicloLectivo() {
		return cicloLectivo;
	}


	public void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Integer getCreditos() {
		return creditos;
	}
	

	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	public Boolean inscribir(Alumno a) throws IOException{
		
		try {
				log.registrar(this, "inscribir ",a.toString());
				this.cupo -= 1;
				this.inscriptos.add(a);
				a.inscripcionAceptada(this);
				return true;
			} 
		
		catch (IOException e) 
		{
		}
		return false;
	}
	
	
	
	/**
	 * imprime los inscriptos en orden alfabetico o nro de libreta
	 */
	
	public void imprimirInscriptos(String orden) throws RegistroAuditoriaException{
		try {
			
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
			
			switch (orden.toLowerCase()) {
			
			case ("nrolibreta"):
				Collections.sort(this.inscriptos,new CompararAlumnoPorNumeroLibreta());
				break;
				
			case ("alfabeticamente"):
				
				Collections.sort(this.inscriptos,new CompararAlumnoPorNumeroLibreta());
				break;
				
			default:
				Collections.sort(this.inscriptos,new CompararAlumnoAlfabeticamente());
				break;
			}
		
			for(Alumno a: this.inscriptos) {
				System.out.println("" + a.getNombre() + " Nro de libreta: " + a.getNroLibreta());
			}
			
			}
		
		catch(IOException i){
			
			throw new RegistroAuditoriaException("Error de regitro");
		}
		
	}
	
	
	
	public void inscribirAlumno(Alumno a) throws NoTieneCreditosRequeridosException,CupoCubiertoException,TodasMateriasRegularException, RegistroAuditoriaException{
			
		if(a.creditosObtenidos() < this.creditosRequeridos) {
			throw new NoTieneCreditosRequeridosException("No tiene los creditos suficientes para inscribirse en el curso");
		}
		
		if(this.cupo == 0) {
			throw new CupoCubiertoException("Cupo del curso cubierto");
		}
		
		if(a.cantidadDeMateriaCursandoDelMismoCicloLectivo(this.cicloLectivo) > 3){
			throw new TodasMateriasRegularException("Todas las materias del curso regular");
		}
		try {
			inscribir(a);
	}
		catch (IOException i) {
			
			new RegistroAuditoriaException("Error de registro");
			
		}	
			
	}

	

}
