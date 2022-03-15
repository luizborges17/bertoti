
public class Cadastro {

	public static void main(String[] args) {			
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Pessoa maria = new Pessoa("Maria", "12345", "maria@maria");
			
		fatec.cadastrarPessoa(maria);
			
		System.out.println(fatec.getPessoas());

		}

	}
