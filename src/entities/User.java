package entities;

import exceptions.InvalidStringException;
import exceptions.NumberLessThanZeroException;

public class User {
	private String name;
	private String surname;
	private int age;

	public User(String name, String surname, int age) throws InvalidStringException {
		this.setName(name);
		this.surname = surname;
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidStringException {
		// Essendo InvalidStringException di tipo CHECKED, sono costretto a gestirla se voglio poter eseguire il codice.
		// Gestirla significa o inserire qua dentro un blocco TRY-CATCH
		// oppure specificare che il metodo potrebbe lancirare un'eccezione di questo tipo; utilizzando THROWS quindi
		// delego al chiamante la gestione
		if (name.length() <= 2) throw new InvalidStringException(name + " è troppo corto. Minimo 3 caratteri!");
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) throw new NumberLessThanZeroException(age);
		this.age = age;
	}
}
