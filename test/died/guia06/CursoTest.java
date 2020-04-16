package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CursoTest {
	
//	@Test
//	void testImprimirInscriptosAlfabeticamente() throws IOException, InscribirAlumnoException, RegistroAuditoriaException {
//		Curso c1 = new Curso(1,"Paradigmas de programacion",2020,30,5,0);
//		Alumno a1 = new Alumno("Juan",1001);
//		Alumno a2 = new Alumno("Manuel",1004);
//		Alumno a3 = new Alumno("Maria",1408);
//		Alumno a4 = new Alumno("Juana",1019);
//		Alumno a5 = new Alumno("Carolina",1996);
//		Alumno a6 = new Alumno("Benjamin",99);
//		c1.inscribirAlumno(a1);
//		c1.inscribirAlumno(a2);
//		c1.inscribirAlumno(a3);
//		c1.inscribirAlumno(a4);
//		c1.inscribirAlumno(a5);
//		c1.inscribirAlumno(a6);
//		c1.imprimirInscriptos("ALfabetiCamEnte");
//	}
	
	@Test
	void testImprimirInscriptosNroLibreta() throws IOException, InscribirAlumnoException, RegistroAuditoriaException {
		Curso c1 = new Curso(1,"Paradigmas de programacion",2020,30,5,0);
		Alumno a1 = new Alumno("Juan",1001);
		Alumno a2 = new Alumno("Manuel",1004);
		Alumno a3 = new Alumno("Maria",1408);
		Alumno a4 = new Alumno("Juana",1019);
		Alumno a5 = new Alumno("Carolina",1996);
		Alumno a6 = new Alumno("Benjamin",99);
		c1.inscribirAlumno(a1);
		c1.inscribirAlumno(a2);
		c1.inscribirAlumno(a3);
		c1.inscribirAlumno(a4);
		c1.inscribirAlumno(a5);
		c1.inscribirAlumno(a6);
		c1.imprimirInscriptos("nroLibreTa");
	}

	@Test
	void testInscribir() throws IOException, InscribirAlumnoException, RegistroAuditoriaException {
		Curso c1 = new Curso(1,"Paradigmas de programacion",2020,30,5,0);
		Alumno a1 = new Alumno("Juan",1000);
		c1.inscribirAlumno(a1);
	}
	
	@Test
	void testInscribirAlumnoConCreditosInsuficientes() throws InscribirAlumnoException, RegistroAuditoriaException {
		Curso c1 = new Curso(1,"Died",2020,30,5,5);
		Alumno a1 = new Alumno("Juan",1000);
		try {
		c1.inscribirAlumno(a1);
		}
		catch (InscribirAlumnoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void testInscribirAlumnoCupoLLeno() throws InscribirAlumnoException, RegistroAuditoriaException {
		Curso c1 = new Curso(2,"Matematica discreta",2020,0,5,0);
		Alumno a1 = new Alumno("Juan",1000);
		try {
		c1.inscribirAlumno(a1);
		}
		catch (InscribirAlumnoException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	@Test
	void testInscribirALumnoTieneTodasLasMateriasRegular() throws InscribirAlumnoException, RegistroAuditoriaException {
		Curso c1 = new Curso(2,"Died",2020,30,5,0);
		Curso c2 = new Curso(3,"Matematica superior",2020,30,5,0);
		Curso c3 = new Curso(4,"Gestion de datos",2020,30,5,0);
		Curso c4 = new Curso(2,"Diseño de sistemas",2020,40,5,0);
		Alumno a1 = new Alumno("Juan",1000);
		
		try {
		c1.inscribirAlumno(a1);
		c2.inscribirAlumno(a1);
		c3.inscribirAlumno(a1);
		c4.inscribirAlumno(a1);
		}
		catch (InscribirAlumnoException e) {
			System.out.println(e.getMessage());
			
		}
	}
	



}
