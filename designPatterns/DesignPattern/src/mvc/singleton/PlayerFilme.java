package mvc.singleton;

import mvc.strategy.FilmeStrategy;

public class PlayerFilme {

	private static PlayerFilme instancia;
	
	private FilmeStrategy estrategia;

	public PlayerFilme() {
	}
	
	public static PlayerFilme getInstance() {
		if(instancia == null) {
			instancia = new PlayerFilme();
		}
		return instancia;
	}
	
	public void definirEstrategia(FilmeStrategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public void rodar() {
		estrategia.rodarFilme();
	}
}
