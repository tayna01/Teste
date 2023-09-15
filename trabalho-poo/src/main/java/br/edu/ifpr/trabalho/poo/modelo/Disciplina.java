package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {
	
	private int idDisciplina;
	private String nome;
	private Turma turma;
	private Professor professor;
	

	public Disciplina() {

	}

	public Disciplina(String nome, Professor professor,Turma turma) {
		super();
	
		this.nome = nome;
		this.turma = turma;
		this.professor = professor;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

 public void imprimirDados() {
	 System.out.println(getIdDisciplina());
	 System.out.println(getNome());
	 System.out.println(getProfessor().getIdPessoa());
	 System.out.println(getTurma().getidTurma());
 }
	
}
