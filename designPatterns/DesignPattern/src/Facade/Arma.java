package Facade;

public class Arma {

	private String acao;

	public Arma(String acao) {
		this.acao = acao;
	}
	
	public String fazerAcao() {
        if (acao.equals("r")) {
            return "Arma Recarregada!";
        } else if (acao.equals("f")) {
            return "Arma inspecionada!";
        }
        else {
        	return "nenhuma ação feita";
        }
    }
}
