package died.guia06;

import java.util.ArrayList;
import java.util.List;


public class Alumno{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;
	
	
	public Integer getNroLibreta() {
		return nroLibreta;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public int creditosObtenidos() {
		return 1;
	}

	
	public Alumno() {
		super();
	}

	
	public Alumno(String nombre, Integer nroLibreta) {
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;
		this.cursando = new ArrayList<Curso>();
		this.aprobados = new ArrayList<Curso>();
	}

	
	public void aprobar(Curso c) {  
		
		if(this.cursando.contains(c)) {
			
			this.cursando.remove(c);
			this.aprobados.add(c);
	}
		else System.out.println("No esta inscripto al curso");
	}

	
	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
		System.out.println("Se ha inscripto al curso "+ ((Curso)c).getNombre() +" correctamente.");
	}
	

	public void setNroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}
	
	
	public Integer obtenerCreditosQuePosee() {
		Integer suma = 0;
		for(Curso c: aprobados) {
			suma += c.getCreditos(); 
		}
		return suma;
	}


	public boolean equals(Object o) {
		return (o instanceof Alumno && ((Alumno)o).getNroLibreta() == this.getNroLibreta());
	}
	
	
	public Integer cantidadDeMateriaCursandoDelMismoCicloLectivo(Integer ciclo) {
		Integer cantidad = 0;
		for(Curso c: cursando) {
			if(c.getCicloLectivo() == ciclo) cantidad++;
		}
		return cantidad;
	}

	
	
	
	
	
	
}
