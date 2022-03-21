
public class CadastroDisciplina {

	public static void main(String[] args) {
		
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Disciplina matematica = new Disciplina("Matemática", "João", "Equipe 3");
		
		fatec.cadastrarDisciplina(matematica);
		
		System.out.println(fatec.getDisciplina());

	}

}
