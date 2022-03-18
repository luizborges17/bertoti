import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste_Disciplina {

	@Test
	void test() {
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Disciplina matematica = new Disciplina("Matemática", "João", "Equipe 3");
		
		fatec.cadastrarDisciplina(matematica);

		assertEquals(fatec.getDisciplina().size(), 1);
		
		assertEquals(fatec.getDisciplina().get(0).getNome(), "Matemática");
	}

}
