package died.guia06;

import java.io.IOException;

public class RegistroAuditoriaException extends IOException{
	
	public RegistroAuditoriaException() {
		
	}
	
	public RegistroAuditoriaException(String msj) {
		super(msj);
	}

}
