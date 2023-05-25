package Facade;

public class Boneco {
	
	private String nick;

	public Boneco(String nick) {
		super();
		this.nick = nick;
	}
	
	public String arma(Arma a) {
		return a.fazerAcao();
	}

	
    public static void main(String[] args) {
        Arma recarregarArma = new Arma("r");
        Arma inspecionarArma = new Arma("f");

        Boneco Boneco1 = new Boneco("Player 1");
        Boneco Boneco2 = new Boneco("Player 2");

        System.out.println(Boneco1.arma(recarregarArma));
        System.out.println(Boneco2.arma(inspecionarArma));
    }
}
