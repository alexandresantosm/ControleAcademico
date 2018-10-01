package modelo;

public class Aluno extends Pessoa{
	// Declaração dos atributos
		private int matriculaDoAluno;
		private SituacaoDoAluno situacaoDoAluno;
		private Curso cursoDoAluno;
		private DisciplinaService listaDisciplinaDoAluno;

		// Declaração dos Construtores
		public Aluno() {

		}

		public Aluno(String nome, String cpf, int matriculaDoAluno) {
			super(nome, cpf);
			this.matriculaDoAluno = matriculaDoAluno;
		}

		public Aluno(String nome, String cpf, 
			int matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, Curso cursoDoAluno, DisciplinaService listaDisciplinaDoAluno) {
			super(nome, cpf);
			this.matriculaDoAluno       = matriculaDoAluno;
			this.situacaoDoAluno        = situacaoDoAluno;
			this.cursoDoAluno           = cursoDoAluno;
			this.listaDisciplinaDoAluno = listaDisciplinaDoAluno;
		}

		public Aluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			int matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, Curso cursoDoAluno, DisciplinaService listaDisciplinaDoAluno) {
			super(nome, cpf, endereco, eMail, telefone);
			this.matriculaDoAluno       = matriculaDoAluno;
			this.situacaoDoAluno        = situacaoDoAluno;
			this.cursoDoAluno           = cursoDoAluno;
			this.listaDisciplinaDoAluno = listaDisciplinaDoAluno;
		}

		// Declaração dos métodos getters
		public int getMatriculaDoAluno() {
			return this.matriculaDoAluno;
		}

		public SituacaoDoAluno getSituacaoDoAluno() {
			return this.situacaoDoAluno;
		}

		public Curso getCursoDoAluno() {
			return this.cursoDoAluno;
		}

		public DisciplinaService getListaDisciplinaDoAluno() {
			return this.listaDisciplinaDoAluno;
		}

		// Declaração dos métodos setters
		public void setMatriculaDoAluno(int matriculaDoAluno) {
	        this.matriculaDoAluno = matriculaDoAluno;
		}

		public void setSituacaoDoAluno(SituacaoDoAluno situacaoDoAluno) {
			this.situacaoDoAluno = situacaoDoAluno;
		}

		public void setCursoDoAluno(Curso cursoDoAluno) {
			this.cursoDoAluno = cursoDoAluno;
		}

		public void setListaDisciplinaDoAluno(DisciplinaService listaDisciplinaDoAluno) {
			this.listaDisciplinaDoAluno = listaDisciplinaDoAluno;
		}
		
		// Declaração do método que irá mostrar as informações do aluno
		// Chamo o método da superclasse 
		public String toString() {
			return  super.toString() + "Matricula: " +this.matriculaDoAluno + "\nSituacao: " + this.situacaoDoAluno +
				   "\nCurso: " + this.cursoDoAluno + "\nDisciplinas: " + this.listaDisciplinaDoAluno + "\n";
		}
}
