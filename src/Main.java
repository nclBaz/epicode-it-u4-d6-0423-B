import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// ***************************************** ECCEZIONI UNCHECKED ***********************************************

/*		int[] numbers = {1, 2, 3, 4, 5, 6};
		// System.out.println(numbers[8]); // ArrayIndexOutOfBoundsException

		String input = "2jasdlsjal";
		// System.out.println(Integer.parseInt(input)); // NumberFormatException

		String stringa = "Qualcosa";
		stringa = null;
		// System.out.println(stringa.length()); // NullPointerException

		int num1 = 2;
		int num2 = 0;
		// System.out.println(num1 / num2); // ArithmeticException*/

		// ***************************************** ECCEZIONI CHECKED ***********************************************

/*		try {
			Thread.sleep(2); // Esempio di CHECKED EXCEPTION (sono costretto a mettere un try catch altrimenti il programma non compila)
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/

/*		String inputFromScanner = "asdas";

		if (inputFromScanner.length() > 3) {
			System.out.println(inputFromScanner);
		} else {
			throw new InvalidStringException("La stringa inserita non è valida");
		}*/


		// throw new NumberLessThanZeroException(-100); // <-- esempio di unchecked custom (NON sono costretto a mettere un try catch)

/*		try {

			User aldo = new User("Aldo", "Baglio", 20);
			aldo.setName("A");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}*/

		// ************************************* GESTIONE ERRORI **********************************

/*
		try {
			int[] numbers = {1, 2, 3, 4, 5, 6};
			System.out.println(numbers[8]); // ArrayIndexOutOfBoundsException

			String input = "2jasdlsjal";
			System.out.println(Integer.parseInt(input)); // NumberFormatException

			String stringa = "Qualcosa";
			stringa = null;
			System.out.println(stringa.length()); // NullPointerException

			int num1 = 2;
			int num2 = 0;
			System.out.println(num1 / num2); // ArithmeticException

		} catch (ArithmeticException ex) {

			System.err.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.err.println(ex.getMessage());
		} // Posso fare dei catch multipli, ma ciò ha senso solo se gestisco gli errori in maniera differente
		// Oppure posso anche eventualmente raccogliere tutti gli errori di vario genere in un un unico catch se
		// prevedo di gestirli tutti alla stessa maniera --> catch (ArithmeticException | ArrayIndexOutOfBoundsException ex)
		// Alternativamente col polimorfismo posso gestire TUTTE le eccezioni con un unico catch(Exception ex)

		System.out.println("CIAO");
*/

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Dammi il primo numero: ");
			int primo = Integer.parseInt(input.nextLine());

			System.out.println("Dammi il secondo numero: ");
			int secondo = Integer.parseInt(input.nextLine());

			System.out.println("Il risultato è: " + (primo / secondo));
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			input.close(); // Lo scanner verrà chiuso correttamente sia in caso di errore che no
		}

	}

/*	public static void print(String stringa) {
		System.out.println(stringa);
		// print(stringa);
		// Esempio di Error: se chiamo all'infinito la stessa funzione mi ritroverò ad avere uno StackoverflowError
	}*/
}