package observer;

import java.util.ArrayList;

public class Estatistica implements Observer{

	public void execAcao(ArrayList<Integer> numeros) {
		System.out.println("Numeros recebidos" + numeros);
	}

}
