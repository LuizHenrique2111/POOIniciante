package ClassesObjetos;

public class Aluno {

	private String nome;
	private String dataNascimento;
	private String numeroCpf;
	private String nomeMae;
	private int numeroMaticula;
	private int idade;
	private String nomeEscola;
	private String serieMatriculada;
	private int numeroMatricula;
	
	private Disciplina disciplina = new Disciplina();	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public int getNumeroMaticula() {
		return numeroMaticula;
	}
	public void setNumeroMaticula(int numeroMaticula) {
		this.numeroMaticula = numeroMaticula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculada() {
		return serieMatriculada;
	}
	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public double getMedia() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3()
		+ disciplina.getNota4()) / 4;
	}
	
	/*public String alunoAprovado() {
		double media = this.getMedia();
		if (media == 100) {
			return System.out.println("Você foi excepcional em todas as matérias. Continue brilhando assim!");
		} else if(media >= 90 && media < 100) {
			return System.out.println("Parabéns! Você passou com uma excelente nota, continue assim!");
		} else if (media >= 70 && media < 90) {
			return System.out.println("Você foi aprovado!");
		} else if (media >= 40 && media < 70) {
			return System.out.println("Você foi reprovado, mas pode fazer a recuperação.");
		} else {
			return System.out.println("Você foi reprovado!");
		}
	}*/
	
	public boolean alunoAprovado() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNascimento=" + dataNascimento + ", numeroCpf=" + numeroCpf + ", nomeMae="
				+ nomeMae + ", numeroMaticula=" + numeroMaticula + ", idade=" + idade + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculada=" + serieMatriculada + ", numeroMatricula=" + numeroMatricula + ", disciplina="
				+ disciplina + "]";
	}
	
	
}
