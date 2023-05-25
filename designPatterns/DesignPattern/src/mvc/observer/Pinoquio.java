package mvc.observer;

import java.util.ArrayList;

public class Pinoquio {
	
	private ArrayList<Observer> especs = new ArrayList<>();

	public void addEspec(Observer espec) {
		especs.add(espec);
	}

	public void notifyEspec(String mensagem) {
		for(Observer espec: especs) {
			espec.update(mensagem);
		}
	}
}
