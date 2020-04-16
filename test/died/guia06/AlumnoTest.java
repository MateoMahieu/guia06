package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testCreditosObtenidos() {
		Alumno a1 = new Alumno("Juan",1000);
		int creditos = a1.creditosObtenidos();
		assertEquals(0, creditos);	
	}

	@Test
	void testAprobar() {
		Curso c1 = new Curso(1,"Died",2020,30,5,5);
		Alumno a1 = new Alumno("Juan",1000);
		a1.inscripcionAceptada(c1);
		a1.aprobar(c1);
		assertEquals(1,a1.getAprobados().size());	
	}
	
	@Test
	void testNoAprobar() {
		Curso c1 = new Curso(1,"Died",2020,30,5,5);
		Alumno a1 = new Alumno("Juan",1000);
		a1.aprobar(c1);
		assertEquals(0,a1.getAprobados().size());	
	}

	@Test
	void testInscripcionAceptada() {
		Curso c1 = new Curso(2,"AmII",2020,50,5,10);
		Alumno a1 = new Alumno("Luis",1000);
		a1.inscripcionAceptada(c1);
		assertEquals(1,a1.getCursando().size());
	}

}
