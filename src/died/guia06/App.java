package died.guia06;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws TodasMateriasRegularException, NoTieneCreditosRequeridosException , CupoCubiertoException, RegistroAuditoriaException{
		
		Alumno a1 = new Alumno("Maria",100);
		Alumno a2 = new Alumno("Juan",101);
		Alumno a3 = new Alumno("Carlos",102);
		
		Curso c1 = new Curso(1,"Died",2020,0,5,0);
		Curso c2 = new Curso(1,"Algebra",2020,40,5,10);
		

			try {
				c2.inscribirAlumno(a3);
				}
			
			catch (TodasMateriasRegularException | NoTieneCreditosRequeridosException | CupoCubiertoException | RegistroAuditoriaException e) {
				e.printStackTrace();
			}
			
			try {
				c1.inscribirAlumno(a2);
				}
			
			catch (TodasMateriasRegularException | NoTieneCreditosRequeridosException | CupoCubiertoException | RegistroAuditoriaException e) {
				e.printStackTrace();
			}
			
			try {
				c1.imprimirInscriptos("alfabeticamente");
				}
			
			catch (RegistroAuditoriaException e) {
				e.printStackTrace();
			}
	
	
//		
//		a1.aprobar(c2);
//		a3.aprobar(c2);
//		
//		
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