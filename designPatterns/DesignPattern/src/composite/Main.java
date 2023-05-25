package composite;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Flash flash = new Flash();
		
		
		Boneco boneco = new Boneco();
		boneco.comprarGranada(flash);

		boneco.mostrar();

	}

}
