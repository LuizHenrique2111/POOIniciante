package ClassesObjetos;

import java.util.ArrayList;
import java.util.List;

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
	
	private List<Disciplina> disciplinas = new ArrayList();	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
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
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}
	
	public String alunoAprovado() {
		double media = this.getMedia();
		
		if (media >= 40) {
			if (media >= 70) {
				return "Aluno Aprovado";
			} else {
				return "Aluno em recuperação";
			}
		} else {
			return "Aluno Reprovado";
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNascimento=" + dataNascimento + ", numeroCpf=" + numeroCpf + ", nomeMae="
				+ nomeMae + ", numeroMaticula=" + numeroMaticula + ", idade=" + idade + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculada=" + serieMatriculada + ", numeroMatricula=" + numeroMatricula + "]";
	}
	
	
}
