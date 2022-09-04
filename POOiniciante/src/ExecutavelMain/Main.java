package ExecutavelMain;

import javax.swing.JOptionPane;
import ClassesObjetos.Aluno;

public class Main {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		String idade = JOptionPane.showInputDialog("Digte a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String numeroMatricula = JOptionPane.showInputDialog("Digite o número da matrícula");
		String numeroCpf = JOptionPane.showInputDialog("Digite o CPF");
		String disciplina1 = JOptionPane.showInputDialog("Qual a discplina 1");
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
		String disciplina2 = JOptionPane.showInputDialog("Qual a discplina 2");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota");
		String disciplina3 = JOptionPane.showInputDialog("Qual a discplina 3");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota");
		String disciplina4 = JOptionPane.showInputDialog("Qual a discplina 4");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroMatricula(Integer.valueOf(numeroMatricula));
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae("Lucia");
		aluno1.setSerieMatriculada("6º Ano");
		aluno1.getDisciplina().setNota1((int)Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2((int)Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3((int)Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4((int)Double.parseDouble(nota4));
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println("O nome do Aluno 1 é " + aluno1.getNome());
		System.out.println("A idade do Aluno 1 é " + aluno1.getIdade());
		System.out.println("A data de nascimento do Aluno 1 é " + aluno1.getDataNascimento());
		System.out.println("O nº da matrícula do Aluno 1 é " + aluno1.getNumeroMatricula());
		System.out.println("O CPF do aluno 1 é " + aluno1.getNumeroCpf());
		System.out.println("Disciplina 1 " + aluno1.getDisciplina().getDisciplina1());
		System.out.println("A Nota foi de " + aluno1.getDisciplina().getNota1());
		System.out.println("Disciplina 2 " + aluno1.getDisciplina().getDisciplina2());
		System.out.println("A Nota foi de " + aluno1.getDisciplina().getNota2());
		System.out.println("Disciplina 3 " + aluno1.getDisciplina().getDisciplina3());
		System.out.println("A Nota foi de " + aluno1.getDisciplina().getNota3());
		System.out.println("Disciplina 4 " + aluno1.getDisciplina().getDisciplina4());
		System.out.println("A Nota foi de " + aluno1.getDisciplina().getNota4());
		System.out.println("A média do aluno é " + aluno1.getMedia());
		System.out.println("O Aluno foi " + (aluno1.alunoAprovado() ? "Aprovado" : "Reprovado"));
		
		System.out.println("Aluno 1: " + aluno1.toString());
		

	}

}
