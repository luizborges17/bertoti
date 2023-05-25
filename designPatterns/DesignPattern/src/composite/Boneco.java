package composite;

import java.util.ArrayList;

public class Boneco implements Granadas {

	private ArrayList<Granadas> granadas = new ArrayList<>();

	public void comprarGranada(Granadas granada) {
		System.out.println("Comprou uma: ");
		granada.mostrar();
		System.out.println("");
		granadas.add(granada);
	}

	public void droparGranada(Granadas granada) {
		System.out.println("Dropou uma ");
		granada.mostrar();
		System.out.println("");
		granadas.remove(granada);
	}

	public void mostrar() {
		for (Granadas granada : granadas) {
			System.out.println("Suas granadas são:");
			granada.mostrar();
		}

	}
}
