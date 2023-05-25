package observer;

import java.util.ArrayList;

public class Lista {
	
	public ArrayList<Integer> numeros = new ArrayList<>();
	
	public ArrayList<Observer> observers = new ArrayList<>();
	
	public void addNumeros(Integer n) {
		numeros.add(n);
		notificarObserver();
	}
	
	public void addObserver(Observer o) {
		if(!observers.contains(o)) {
		observers.add(o);		
		}
	}
	
	public void removerObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notificarObserver() {
		for(Observer o: observers) {
			o.execAcao(numeros);
		}
	}
	
	public String toString() {
		return "numeros atuais" + numeros;
	}

}
