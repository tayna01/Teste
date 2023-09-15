package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.implementacao.BuscarDados;
import br.edu.ifpr.trabalho.poo.implementacao.InserirDados;
import br.edu.ifpr.trabalho.poo.implementacao.LeituraDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TesteDisciplina {

	public static void main(String[] args) {

		ILeituraDeDados leitura = new LeituraDeDados();
		IBuscaDeDados busca = new BuscarDados();
		IInserirDados insercao = new InserirDados();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o id de turma: ");
		int codigoTurma = teclado.nextInt();
		Turma turma = new Turma();
		turma.setidTurma(codigoTurma);
		
		System.out.println("Informe o id de professor: ");
		int codigoProfessor = teclado.nextInt();
		Professor professor = new Professor();
		professor.setIdProfessor(codigoProfessor);
		

		Disciplina disciplina = leitura.lerDadosDisciplina(professor, turma);
		insercao.salvarDisciplina(disciplina);
		ArrayList<Disciplina> listaDisciplinas = busca.buscarDisciplinas();
		for (Disciplina c : listaDisciplinas) {
			c.imprimirDados();
		}
	}
}
