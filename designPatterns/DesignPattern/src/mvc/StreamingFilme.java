package mvc;

import mvc.facade.FacadeFilme;
import mvc.observer.Espectador;
import mvc.strategy.FilmeCurtaMetragem;

public class StreamingFilme {

	public static void main(String[] args) {
		// Criando Espec
		Espectador espectador1 = new Espectador("Claudio ");
		Espectador espectador2 = new Espectador("Luiz ");

		// Add especs ao filme
		FacadeFilme fachadaFilme = new FacadeFilme();
		fachadaFilme.addEspectador(espectador1);
		fachadaFilme.addEspectador(espectador2);

		// Notificando especs
		fachadaFilme.notificarEspec("Filme do pinóquio ta on ");

		// Estrategy pra música
		fachadaFilme.definirEstrategy(new FilmeCurtaMetragem());
		
		//Vendo filme
		fachadaFilme.tocar();
	
	}

}
