package died.guia06;

import static org.junit.jupiter.api.Assertions.*;



import java.io.IOException;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testInscribir() throws TodasMateriasRegularException, NoTieneCreditosRequeridosException, CupoCubiertoException, IOException  {
		Curso c1 = new Curso(1,"Died",2020,30,5,5);
		Alumno a1 = new Alumno("Juan",1000);
		c1.inscribirAlumno(a1);
	}
	
	@Test
	void testImprimirInscriptos() throws RegistroAuditoriaException, TodasMateriasRegularException, NoTieneCreditosRequeridosException, CupoCubiertoException {
		Curso c1 = new Curso(1,"Died",2020,30,5,0);
		Alumno a1 = new Alumno("Juan",10010);
		Alumno a2 = new Alumno("Carlos",573);
		Alumno a3 = new Alumno("Maria",2);
		c1.inscribirAlumno(a1);
		c1.inscribirAlumno(a2);
		c1.inscribirAlumno(a3);
		c1.imprimirInscriptos("nrolibreta");
		c1.imprimirInscriptos("AlfaBetiCamente");
	}

}
