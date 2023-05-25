package mvc.facade;

import mvc.observer.Observer;
import mvc.observer.Pinoquio;
import mvc.singleton.PlayerFilme;
import mvc.strategy.FilmeStrategy;

public class FacadeFilme {
	Pinoquio pinoquio = new Pinoquio();
	PlayerFilme playerFilme = PlayerFilme.getInstance();

	public void addEspectador(Observer espec) {
		pinoquio.addEspec(espec);
	}
	
	public void notificarEspec(String mensagem) {
		pinoquio.notifyEspec(mensagem);
	}
	
	public void definirEstrategy(FilmeStrategy filmeStrategy) {
		playerFilme.definirEstrategia(filmeStrategy);
	}
	
	public void tocar() {
		playerFilme.rodar();
	}
}
