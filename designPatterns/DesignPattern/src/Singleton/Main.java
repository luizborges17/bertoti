package Singleton;

public class Main {

	public static void main(String[] args) {

		MeuBoneco meuBoneco = MeuBoneco.getLugarMemoria();
		
		
		System.out.println(meuBoneco);
		System.out.println(MeuBoneco.getLugarMemoria());
	}

}
