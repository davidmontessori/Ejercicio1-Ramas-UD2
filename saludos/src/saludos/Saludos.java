package saludos;

import java.util.Scanner;

public class Saludos {
	final static int HORA = 4;

	public static void main(String[] args) {
		System.out.println("Hola Mundo");

		Scanner input = new Scanner(System.in);
		System.out.println("nombre y apellidos");
		String nombreapellidos = input.nextLine();
		System.out.println("Hola " + nombreapellidos);

		if (HORA >= 6 && HORA < 12) {
			System.out.println("¡Buenos días!");
		} else if (HORA >= 12 && HORA < 18) {
			System.out.println("¡Buenas tardes!");
		} else if (HORA >= 18 && HORA < 24) {
			System.out.println("¡Buenas noches!");
		} else {
			System.out.println("¡Hola, es madrugada!");
		}

		input.close();
	}

}
