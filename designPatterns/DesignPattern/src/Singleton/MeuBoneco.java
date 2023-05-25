package Singleton;

public class MeuBoneco {
	
	private static MeuBoneco instanciaUnica;
	
	private MeuBoneco() {
		
	}
	
	public static synchronized MeuBoneco getLugarMemoria() {

		if(instanciaUnica == null) {
			instanciaUnica = new MeuBoneco();
		}
		return instanciaUnica;
	}
	

}
