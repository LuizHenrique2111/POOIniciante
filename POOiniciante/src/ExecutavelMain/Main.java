package ExecutavelMain;

import javax.swing.JOptionPane;
import ClassesObjetos.*;

public class Main {

	public static void main(String[] args) {
		
		// Inserindo vari�veis e solicitando valores do usu�rio
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		String idade = JOptionPane.showInputDialog("Digte a idade do aluno");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String numeroMatricula = JOptionPane.showInputDialog("Digite o n�mero da matr�cula");
		String serieMatricula = JOptionPane.showInputDialog("Qual a s�rie matr�culada?");
		String numeroCpf = JOptionPane.showInputDialog("Digite o CPF");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");

		// Instanciando o Objeto(Classe) Aluno
		Aluno aluno1 = new Aluno();
		
		// Colocando valores das vari�veis anteriormente criadas dentro dos atributos da instancia Aluno
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroMatricula(Integer.valueOf(numeroMatricula));
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setSerieMatriculada(serieMatricula);
		aluno1.setNomeEscola(nomeEscola);
		
		// Usando o for para percorrer o n�mero de disciplinas que eu quiser inserir na lista de Disciplina
		for (int pos = 1; pos < 5; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Digite a " + pos + " disciplina");
			String notaDisciplina = JOptionPane.showInputDialog("Digita a nota da " + pos + " disciplina");
			
			// Instanciando o objeto Disciplina e colocando valores nos seus atributos	
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(notaDisciplina));
			
			// Inserindo as Disciplinas criadas anteriormente dentro da mem�ria da Classe Aluno
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja retirar aguma disciplna?");
		
		if(escolha == 0) {
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja removar?(1,2,3 ou 4)");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continar a remover?");
			}	
		}
		
		System.out.println("O nome do Aluno 1 � " + aluno1.getNome());
		System.out.println("A idade do Aluno 1 � " + aluno1.getIdade());
		System.out.println("A data de nascimento do Aluno 1 � " + aluno1.getDataNascimento());
		System.out.println("O n� da matr�cula do Aluno 1 � " + aluno1.getNumeroMatricula());
		System.out.println("O CPF do aluno 1 � " + aluno1.getNumeroCpf());
		System.out.println("A m�dia do aluno � " + aluno1.getMedia());
		System.out.println(aluno1.alunoAprovado());
		
		System.out.println("Aluno 1: " + aluno1.toString());
		

	}

}
