package br.edu.ifpr.trabalho.poo.modelo;

public class Matricula {
	
	private int IdMatricula;
	private String ra;
	private String data;
	private boolean situacao;
	private Aluno aluno;
	private Turma turma;

	public Matricula() {

	}

	public Matricula(String ra, String data, boolean situacao, Aluno aluno, Turma turma) {
		super();
		this.ra = ra;
		this.data = data;
		this.situacao = situacao;
		this.aluno = aluno;
		this.turma = turma;
	}

	public int getIdMatricula() {
		return IdMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		IdMatricula = idMatricula;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}


	public void imprimirDados() {
		System.out.println(getIdMatricula());
		System.out.println(getRa());
		System.out.println(getData());
		System.out.println(getSituacao());
		System.out.println(getAluno().getIdPessoa());
		System.out.println(getTurma().getidTurma());
	}

}
