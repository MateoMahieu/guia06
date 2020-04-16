package died.guia06;

public class NoTieneCreditosRequeridosException extends Exception{
	
	public NoTieneCreditosRequeridosException() {
		
	}
	
	
	public NoTieneCreditosRequeridosException(String msj) {
		super(msj);
	}
}
