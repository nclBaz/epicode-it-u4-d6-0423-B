package exceptions;

public class InvalidStringException extends Exception {
	// Se estendo Exception sto definendo una CHECKED EXCEPTION

	public InvalidStringException(String message) {
		super(message); // richiamo il costruttore di Exception
	}
}
