package strategy;

import java.util.Scanner;

public class JogoFps {

	public static void main(String[] args) {

		Boneco terrorist = new Boneco();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tecla apertada");
		int tecla = scanner.nextInt();

		if (tecla == 1) {
			terrorist.setBombas(new Flashbang());
			System.out.println("Flash jogada");
			scanner.close();
			return;
		} else if (tecla == 2) {
			terrorist.setBombas(new GranadaFumaca());
			System.out.println("Granada de Fumaca jogada");
			scanner.close();
			return;
		} else if (tecla == 3) {
			terrorist.setBombas(new Molotov());
			System.out.println("Molotov jogada");
			scanner.close();
			return;
		} 
		terrorist.jogarBomba();

	}
}
