package br.edu.ifpr.trabalho.poo.modelo;

import java.util.Scanner;

public final class Aluno extends Pessoa {

	private int anoIngresso;
	private int IdAluno;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoingresso) {
		super(nome, cpf, telefone, endereco, dataNascimento);

	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getidAluno() {
		return IdAluno;
	}

	public void setidAluno(int idAluno) {
		IdAluno = IdAluno;
	}

	@Override
	public void imprimirDados() {

		System.out.println(getNome());
		System.out.println(getCpf());
		System.out.println(getTelefone());
		System.out.println(getEndereco());
		System.out.println(getDataNascimento());
		System.out.println(getAnoIngresso());
	}

}
