package mvc.composite;

import java.util.ArrayList;

public class Favoritos implements VerFilme{
	private ArrayList<VerFilme> verFilmes = new ArrayList<>();
	
	public void addFilme(VerFilme verFilme) {
		verFilmes.add(verFilme);
	}
	
	public void rodar() {
		for(VerFilme filme: verFilmes) {
			filme.rodar();
		}
	}

}
