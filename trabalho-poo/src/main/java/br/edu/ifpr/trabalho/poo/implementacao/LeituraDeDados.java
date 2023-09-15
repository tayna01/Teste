package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class LeituraDeDados implements ILeituraDeDados {

	public Campus lerDadosCampus() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);
		return campus;

	}

	public Aluno lerDadosAluno() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o CPF do aluno:");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do Aluno:");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do Aluno:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a data de nascimento do Aluno: ");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe o ano de ingresso do Aluno: ");
		int anoIngresso = teclado.nextInt();
		Aluno aluno = new Aluno(nome, cpf, telefone, endereco, dataNascimento, anoIngresso);
		return aluno;
	}

	public Professor lerDadosProfessor() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do Professor: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o CPF do Professor:");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do Professor:");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do Professor:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a data de nascimento do Professor: ");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe seu numero SIAPE: ");
		String siape = teclado.nextLine();
		Professor professor = new Professor(nome, cpf, telefone, endereco, dataNascimento, siape);
		return professor;
	}

	public Curso lerDadosCurso() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();
		System.out.println("Informe a duração do curso: ");
		String duracao = teclado.nextLine();
		System.out.println("Informe a modalidade do curso: ");
		String modalidade = teclado.nextLine();
		Campus campus = new Campus();
		System.out.println("Informe o código do campus pertencente ao curso: ");
		int codigoCampus = teclado.nextInt();
		campus.setIdCampus(codigoCampus);

		Curso curso = new Curso(nome, duracao, modalidade, campus);
		return curso;
	}

	public Turma lerDadosTurma() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o numero minimo de pessoas: ");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano de ingresso: ");
		int anoIngresso = teclado.nextInt();

		Turma turma = new Turma();
		System.out.println("Informe o código do curso pertencente a turma: ");
		int codCurso = teclado.nextInt();
		Curso curso = new Curso();
		curso.setIdCurso(codCurso);

		Turma turmaUm = new Turma(nome, numeroMinimo, anoIngresso, curso);
		return turmaUm;
	}

	public Turma lerDadosTurma(Curso curso) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o numero minimo de pessoas: ");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano de ingresso: ");
		int anoIngresso = teclado.nextInt();
		Turma turma = new Turma(nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome da disciplina:");
		String nome = teclado.nextLine();
		Disciplina disciplina = new Disciplina(nome, professor, turma);
		return disciplina;
	}

	public Matricula lerDadosMatricula() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o RA do aluno: ");
		String ra = teclado.nextLine();
		System.out.println("Informe a data: ");
		String data = teclado.nextLine();
		System.out.println("Informe a situacao: ");
		boolean situacao = teclado.nextBoolean();

		Matricula matricula3 = new Matricula();
		System.out.println("Informe o código de aluno pertencente a matricula: ");
		int codigoAluno = teclado.nextInt();
		Aluno aluno = new Aluno();
		aluno.setidAluno(codigoAluno);

		Matricula matricula = new Matricula();
		System.out.println("Informe o código de turma pertencente a matricula: ");
		int codigoTurma = teclado.nextInt();
		Turma turma = new Turma();
		turma.setidTurma(codigoTurma);

		Matricula matricula2 = new Matricula(ra, data, situacao, aluno, turma);
		return matricula;

	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o RA do aluno: ");
		String ra = teclado.nextLine();
		System.out.println("Informe a data: ");
		String data = teclado.nextLine();
		System.out.println("Informe a situacao: ");
		boolean situacao = teclado.nextBoolean();

		Matricula matricula3 = new Matricula();
		System.out.println("Informe o código de aluno pertencente a matricula: ");
		int codigoAluno = teclado.nextInt();
		Aluno aluno2 = new Aluno();
		aluno.setidAluno(codigoAluno);

		Matricula matricula = new Matricula();
		System.out.println("Informe o código de turma pertencente a matricula: ");
		int codigoTurma = teclado.nextInt();
		Turma turma2 = new Turma();
		turma.setidTurma(codigoTurma);

		Matricula matricula2 = new Matricula(ra, data, situacao, aluno2, turma2);
		return matricula;
	}

}