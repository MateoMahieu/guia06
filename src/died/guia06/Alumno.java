package died.guia06;

import java.util.List;


public class Alumno implements Comparable {

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

	public Alumno(String nombre, Integer nroLibreta, List<Curso> aprobados) {
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;
		this.cursando = null;
		this.aprobados = aprobados;
	}


	public void aprobar(Curso c) {
		//
	}

	public void inscripcionAceptada(Curso c) {
		//
	}

	public void setNroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}


	public boolean equals(Object o) {
		return (o instanceof Alumno && ((Alumno)o).getNroLibreta() == this.getNroLibreta());
	}
	
	public boolean comparar(Object o) {
		return (o instanceof Alumno && ((Alumno)o).getNombre() == this.getNombre());
	}
	
	
}
