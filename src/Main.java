public class Main {
	public static void main(String[] args) {

		// ***************************************** ECCEZIONI UNCHECKED ***********************************************

		int[] numbers = {1, 2, 3, 4, 5, 6};
		// System.out.println(numbers[8]); // ArrayIndexOutOfBoundsException

		String input = "2jasdlsjal";
		// System.out.println(Integer.parseInt(input)); // NumberFormatException

		String stringa = "Qualcosa";
		stringa = null;
		// System.out.println(stringa.length()); // NullPointerException

		int num1 = 2;
		int num2 = 0;
		// System.out.println(num1 / num2); // ArithmeticException

		// ***************************************** ECCEZIONI CHECKED ***********************************************

/*		try {
			Thread.sleep(2); // Esempio di CHECKED EXCEPTION (sono costretto a mettere un try catch altrimenti il programma non compila)
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/


		// throw new NumberLessThanZeroException(-100); // <-- esempio di unchecked custom

	}

/*	public static void print(String stringa) {
		System.out.println(stringa);
		// print(stringa);
		// Esempio di Error: se chiamo all'infinito la stessa funzione mi ritroverò ad avere uno StackoverflowError
	}*/
}