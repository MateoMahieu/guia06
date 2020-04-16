package died.guia06;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws InscribirAlumnoException, RegistroAuditoriaException{
		
		
		
		Alumno a1 = new Alumno("Maria",100);
		Alumno a2 = new Alumno("Juan",101);
		Alumno a3 = new Alumno("Carlos",102);
		
		Curso c1 = new Curso(1,"Died",2020,30,5,0);
		Curso c2 = new Curso(2,"Algebra",2020,40,5,0);
		Curso c3 = new Curso(3,"Gestion de datos",2020,30,5,10);
		
		try {
			c2.inscribirAlumno(a3);
			c3.inscribirAlumno(a2);
			c1.inscribirAlumno(a3);
			
			a1.aprobar(c2);
			a3.aprobar(c2);
			
			
		}
		catch (InscribirAlumnoException | RegistroAuditoriaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
//		System.out.println("Creditos obtenidos por "+ a2.getNombre() + " " + a2.creditosObtenidos());
//		System.out.println("Creditos obtenidos por "+ a1.getNombre() + " " + a1.creditosObtenidos());
//		
//		c1.inscribir(a2);
//		c1.inscribir(a1);
//		c1.inscribir(a3);
//		
//		
//		System.out.println(a1.equals(a2));
//		
//		c1.imprimirInscriptos("nroLibreta");//imprime segun nroLibreta
//		
//		a1.aprobar(c1);
//		
//		System.out.println("Creditos obtenidos por "+ a2.getNombre() + " " + a2.creditosObtenidos());
//		System.out.println("Creditos obtenidos por "+ a1.getNombre() + " " + a1.creditosObtenidos());
//		System.out.println("Creditos obtenidos por "+ a3.getNombre() + " " + a3.creditosObtenidos());
	
		}
	}