package br.edu.ifpr.trabalho.poo.implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Pessoa;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class InserirDados implements IInserirDados {

	public void salvarCampus(Campus campus) {
		String SQL = "INSERT INTO tb_campus (nome, endereco, cidade) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, campus.getNome());
			preparacaoDaInstrucao.setString(2, campus.getEndereco());
			preparacaoDaInstrucao.setString(3, campus.getCidade());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarAluno(Aluno aluno) {
		String SQL = "INSERT INTO tb_aluno (nome, cpf, telefone, endereco, data_nascimento, ano_ingresso) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, aluno.getNome());
			preparacaoDaInstrucao.setString(2, aluno.getCpf());
			preparacaoDaInstrucao.setString(3, aluno.getTelefone());
			preparacaoDaInstrucao.setString(4, aluno.getEndereco());
			preparacaoDaInstrucao.setString(5, aluno.getDataNascimento());
			preparacaoDaInstrucao.setInt(6, aluno.getAnoIngresso());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarProfessor(Professor professor) {

		String SQL = "INSERT INTO tb_Professor (nome, cpf, telefone, endereco, data_nascimento, siape) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, professor.getNome());
			preparacaoDaInstrucao.setString(2, professor.getCpf());
			preparacaoDaInstrucao.setString(3, professor.getTelefone());
			preparacaoDaInstrucao.setString(4, professor.getEndereco());
			preparacaoDaInstrucao.setString(5, professor.getDataNascimento());
			preparacaoDaInstrucao.setString(6, professor.getSiape());

			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarCurso(Curso curso) {

		String SQL = "INSERT INTO tb_curso (nome, duracao, modalidade, fk_campus) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, curso.getNome());
			preparacaoDaInstrucao.setString(2, curso.getDuracao());
			preparacaoDaInstrucao.setString(3, curso.getModalidade());
			preparacaoDaInstrucao.setInt(4, curso.getCampus().getIdCampus());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}

	}

	public void salvarTurma(Turma turma) {

		String SQL = "INSERT INTO tb_turma (nome, numero_minimo, ano_ingresso, fk_curso) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			
			preparacaoDaInstrucao.setString(1, turma.getNome());
			preparacaoDaInstrucao.setInt(2, turma.getNumeroMinimo());
			preparacaoDaInstrucao.setInt(3, turma.getAnoIngresso());
			preparacaoDaInstrucao.setInt(4, turma.getCurso().getIdCurso());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarDisciplina(Disciplina disciplina) {
		String SQL = "INSERT INTO tb_disciplina (nome, fk_turma, fk_professor) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			
			preparacaoDaInstrucao.setString(1, disciplina.getNome());
			preparacaoDaInstrucao.setInt(2, disciplina.getTurma().getidTurma());
			preparacaoDaInstrucao.setInt(3, disciplina.getProfessor().getidProfessor());
			preparacaoDaInstrucao.executeUpdate();
			
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarMatricula(Matricula matricula) {
		String SQL = "INSERT INTO tb_matricula (ra, data, situacao, fk_turma, f_aluno) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			
			preparacaoDaInstrucao.setString(1, matricula.getRa());
			preparacaoDaInstrucao.setString(2, matricula.getData());
			preparacaoDaInstrucao.setBoolean(3, matricula.getSituacao());
			preparacaoDaInstrucao.setInt(4, matricula.getTurma().getidTurma());
			preparacaoDaInstrucao.setInt(5, matricula.getAluno().getidAluno());
			preparacaoDaInstrucao.executeUpdate(); 
		
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}
	}



