
public class Patrickreidelas {

	public static void main(String[] args) {
		
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Disciplina matematica = new Disciplina("Matem�tica", "Jo�o", "Equipe 3");
		
		fatec.cadastrarDisciplina(matematica);
		
		System.out.println(fatec.getDisciplina());

	}

}
