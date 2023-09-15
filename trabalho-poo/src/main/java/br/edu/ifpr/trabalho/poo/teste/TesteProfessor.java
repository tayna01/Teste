package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.BuscarDados;

import br.edu.ifpr.trabalho.poo.implementacao.InserirDados;
import br.edu.ifpr.trabalho.poo.implementacao.LeituraDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {

		ILeituraDeDados leitura = new LeituraDeDados();
		IBuscaDeDados busca = new BuscarDados();
		IInserirDados insercao = new InserirDados();



		Professor professor = leitura.lerDadosProfessor();
	    insercao.salvarProfessor(professor);
		ArrayList<Professor> listaDeProfessores = busca.buscarProfessores();

		for (Professor t : listaDeProfessores) {
			t.imprimirDados();
		}

	}

}
