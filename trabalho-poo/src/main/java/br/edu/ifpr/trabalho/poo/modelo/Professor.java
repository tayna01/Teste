package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa {
	private String siape;
	private int idProfessor;

	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, String telefone, String endereco, String dataNascimento, String siape) {
		super(nome, cpf, telefone, endereco, dataNascimento);
		this.siape = siape;
		
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
	public int getidProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idTurma) {
		this.idProfessor = idProfessor;
	}
	@Override
	public void imprimirDados() {

		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.telefone);
		System.out.println(this.endereco);
		System.out.println(this.dataNascimento);
		System.out.println(this.siape);

	}

}
