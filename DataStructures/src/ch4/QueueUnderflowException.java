package ch4;

public class QueueUnderflowException extends Exception {
	
	public QueueUnderflowException() {
		super();
	}
		
	public QueueUnderflowException(String message) {
		super(message);
	}

}
