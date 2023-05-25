package mvc.composite;

public class Filme implements VerFilme{
	
	private String nome;
	
	public Filme(String nome) {
		this.nome = nome;
	}
	
	public void rodar() {
		System.out.println("Rodando o filme:" + nome);
	}
	

}
