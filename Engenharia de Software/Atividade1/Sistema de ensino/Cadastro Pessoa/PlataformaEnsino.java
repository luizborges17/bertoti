
	import java.util.LinkedList;
	import java.util.List;

	public class PlataformaEnsino {
		
		
		private List<Pessoa> pessoas = new LinkedList<Pessoa>();
		

		public void cadastrarPessoa(Pessoa pessoa) {
			pessoas.add(pessoa);
		}
		
		public List<Pessoa> getPessoas(){
			return pessoas;
		}
		
	}

