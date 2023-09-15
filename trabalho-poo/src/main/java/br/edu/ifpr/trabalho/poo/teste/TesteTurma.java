package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.BuscarDados;
import br.edu.ifpr.trabalho.poo.implementacao.InserirDados;
import br.edu.ifpr.trabalho.poo.implementacao.LeituraDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		ILeituraDeDados leitura = new LeituraDeDados();
		IBuscaDeDados busca = new BuscarDados();
		IInserirDados insercao = new InserirDados();



		Turma turma = leitura.lerDadosTurma();
	    insercao.salvarTurma(turma);
		ArrayList<Turma> listaDeTurmas = busca.buscarTurmas();

		for (Turma t : listaDeTurmas) {
			t.imprimirDados();

	}

}}
