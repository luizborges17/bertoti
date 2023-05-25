package observer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Observado
		Lista lista = new Lista();
		
		
		//Observador
		Estatistica e = new Estatistica();
		lista.addObserver(e);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("Digite um numero para add");
			int n = scanner.nextInt();
			lista.addNumeros(n);
		}
	}

}
