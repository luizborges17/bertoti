import java.util.LinkedList;
import java.util.List;

public class PlataformaEnsino {
	
	
	private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
	

	public void cadastrarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public List<Disciplina> getDisciplina(){
		return disciplinas;
	}
	
}
