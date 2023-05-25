package mvc.observer;

public class Espectador implements Observer{

	private String nome;
	
	public Espectador(String nome) {
		this.nome = nome;
	}

	public void update(String mensagem) {
		System.out.println(nome + "assistindo" + mensagem);
		
	}

}
