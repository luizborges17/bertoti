import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {			
	
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
			System.out.println("deu certo");
		}
		else {
			System.out.println("não deu certo");
		}
		}
	}
