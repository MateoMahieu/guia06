package died.guia06;


public class App {

	public static void main(String[] args) throws InscribirAlumnoException, RegistroAuditoriaException{
		
		
		Alumno a1 = new Alumno("Maria",1200);
		Alumno a2 = new Alumno("Juan",1015);
		Alumno a3 = new Alumno("Carlos",1119);
		
		Curso c1 = new Curso(1,"Died",2020,30,5,0);
		Curso c2 = new Curso(3,"Gestion de datos",2020,30,5,5);
		Curso c3 = new Curso(3,"Diseño de sistemas",2020,0,10,5);
		
	try {
			
			c1.inscribirAlumno(a1);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	try {
			
			c1.inscribirAlumno(a2);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	try {
			
			c1.inscribirAlumno(a3);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		System.out.println("Listado de inscriptos a " + c1.getNombre() + ":");
		c1.imprimirInscriptos("nroLibreta");//imprime segun nroLibreta
		
		a1.aprobar(c1);
		a3.aprobar(c1);
		
		System.out.println("Creditos obtenidos por "+ a2.getNombre() + " " + a2.creditosObtenidos());
		System.out.println("Creditos obtenidos por "+ a1.getNombre() + " " + a1.creditosObtenidos());
		System.out.println("Creditos obtenidos por "+ a3.getNombre() + " " + a3.creditosObtenidos());
		
		
	try {
			
		c2.inscribirAlumno(a1);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	try {
		
		c2.inscribirAlumno(a2);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	try {
		
		c2.inscribirAlumno(a3);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		System.out.println("Listado de inscriptos a " + c2.getNombre() + ":");
		c2.imprimirInscriptos("alfabeTicaMenTe");//imprime alfabeticamente
		
		a1.aprobar(c2); //aprueba gestion y recibe 5 creditos mas
		
		System.out.println("Creditos obtenidos por "+ a2.getNombre() + " " + a2.creditosObtenidos());
		System.out.println("Creditos obtenidos por "+ a1.getNombre() + " " + a1.creditosObtenidos());
		System.out.println("Creditos obtenidos por "+ a3.getNombre() + " " + a3.creditosObtenidos());
		
		try {
			
			c3.inscribirAlumno(a1);
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	
		}
	}