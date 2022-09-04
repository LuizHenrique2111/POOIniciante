package ClassesObjetos;

public class Disciplina {
	
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private String disciplina4;
	
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;
	
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public int getNota4() {
		return nota4;
	}
	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	
	@Override
	public String toString() {
		return "Disciplina [disciplina1=" + disciplina1 + ", nota1=" + nota1 + ", disciplina2=" + disciplina2 + ", nota2=" 
				+ nota2 + ", disciplina3=" + disciplina3 + ", nota 3=" + nota4 +", disciplina4=" + disciplina4 + ", nota4=" 
				+ nota4 + "]";
	}
	
	
	
}
