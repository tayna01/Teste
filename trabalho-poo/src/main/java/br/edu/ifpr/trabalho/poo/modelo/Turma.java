package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {

	private String nome;
	private int numeroMinimo;
	private int anoIngresso;
	private Curso curso;
	private int idTurma;
	public Turma() {

	}

	public Turma(String nome, int numeroMinimo, int anoIngresso, Curso curso) {
		super();
		this.nome = nome;
		this.numeroMinimo = numeroMinimo;
		this.anoIngresso = anoIngresso;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getidTurma() {
		return idTurma;
	}

	public void setidTurma(int idTurma) {
		this.idTurma = idTurma;
	}
    public void imprimirDados() {
	System.out.println(this.nome);
	System.out.println(this.numeroMinimo);
	System.out.println(this.anoIngresso);
	System.out.println(this.curso.getIdCurso());
	
	
  }
    
}
