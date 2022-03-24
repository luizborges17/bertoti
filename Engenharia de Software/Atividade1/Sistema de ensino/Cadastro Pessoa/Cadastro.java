import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {	
		

		
while (true) {
	Scanner in = new Scanner(System.in);
	System.out.println("Para cadastrar pessoa digite 1, para sair digite 2: ");
	Integer lup = in.nextInt();
	if(lup==1) {
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome:");
		String nome = sc.next();
		
		System.out.println("Digite a senha:");
		String senha = sc.next();
		
		System.out.println("Digite o email:");
		String email = sc.next();
		
		Pessoa pessoa = new Pessoa(nome, senha, email);
		
		fatec.cadastrarPessoa(pessoa);
		
		if (fatec.getPessoas().get(0).getNome() == nome) {
			System.out.println("\nCadastrado com sucesso");
		}
		else {
			System.out.println("\nNão cadastrado");
		}
}
	else if (lup==2){
		System.out.println("\nSistema fechado com sucesso!");
		break;
			
		}

}	
}
}
