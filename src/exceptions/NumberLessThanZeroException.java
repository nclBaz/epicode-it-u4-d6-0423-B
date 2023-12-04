package exceptions;

public class NumberLessThanZeroException extends RuntimeException {
	// Se estendo RuntimeException sto definendo una UNCHECKED EXCEPTION
	public NumberLessThanZeroException(int number) {
		super("Il numero " + number + " è minore di zero!");
	}
}
