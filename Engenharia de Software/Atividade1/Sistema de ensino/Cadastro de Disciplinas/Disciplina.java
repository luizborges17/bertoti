
public class Disciplina {
		
		private String nome;
		private String professor;
		private String equipe;
		
		public Disciplina(String nome, String professor, String equipe) {
			this.nome = nome;
			this.professor = professor;
			this.equipe = equipe;
		}
		public String getNome(){
			return nome;
		}
		public String getProfessor(){
			return professor;
		}
		public String getEquipe(){
			return equipe;
		}
		public void setNome(String novoNome){
			nome = novoNome;
		}
		public void setProfessor(String novoProfessor){
			professor = novoProfessor;
		}
		public void setEquipe(String novaEquipe){
			equipe = novaEquipe;
		}
		
	}
