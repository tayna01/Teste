package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.LeituraDeDados;
import br.edu.ifpr.trabalho.poo.implementacao.BuscarDados;
import br.edu.ifpr.trabalho.poo.implementacao.InserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {

		ILeituraDeDados leitura = new LeituraDeDados();
		IBuscaDeDados busca = new BuscarDados();
		IInserirDados insercao = new InserirDados();

		Aluno aluno = new Aluno();

		aluno = leitura.lerDadosAluno();
		insercao.salvarAluno(aluno);
		ArrayList<Aluno> listaAluno = busca.buscarAlunos();
		for (Aluno c : listaAluno) {
			c.imprimirDados();
		}

	}

}
