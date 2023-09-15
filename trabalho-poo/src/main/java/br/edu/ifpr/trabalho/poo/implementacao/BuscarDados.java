package br.edu.ifpr.trabalho.poo.implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class BuscarDados implements IBuscaDeDados {

	public ArrayList<Campus> buscarCampi() {

		ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
		String SQL = "SELECT * FROM tb_campus";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Campus campus = new Campus();
				campus.setIdCampus(resultado.getInt("id_campus"));
				campus.setNome(resultado.getString("nome"));
				campus.setEndereco(resultado.getString("endereco"));
				campus.setCidade(resultado.getString("cidade"));
				listaDeCampus.add(campus);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeCampus;

	}

	public ArrayList<Professor> buscarProfessores() {
		ArrayList<Professor> listaDeProfessores = new ArrayList<Professor>();
		String SQL = "SELECT * FROM tb_professor";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Professor professor = new Professor();

				professor.setIdPessoa(resultado.getInt("id_pessoa"));
				professor.setNome(resultado.getString("nome"));
				professor.setCpf(resultado.getString("cpf"));
				professor.setTelefone(resultado.getString("telefone"));
				professor.setEndereco(resultado.getString("endereco"));
				professor.setDataNascimento(resultado.getString("data_nascimento"));
				professor.setSiape(resultado.getString("siape"));

				listaDeProfessores.add(professor);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeProfessores;
	}

	public ArrayList<Aluno> buscarAlunos() {
		ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
		String SQL = "SELECT * FROM tb_aluno";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setIdPessoa(resultado.getInt("id_pessoa"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getString("cpf"));
				aluno.setTelefone(resultado.getString("telefone"));
				aluno.setEndereco(resultado.getString("endereco"));
				aluno.setDataNascimento(resultado.getString("data_nascimento"));
				aluno.setAnoIngresso(resultado.getInt("ano_ingresso"));
				listaDeAluno.add(aluno);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeAluno;

	}

	public ArrayList<Curso> buscarCurso() {
		ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();
		String SQL = "SELECT * FROM tb_curso";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Curso curso = new Curso();
				curso.setIdCurso(resultado.getInt("id_curso"));
				curso.setNome(resultado.getString("nome"));
				curso.setDuracao(resultado.getString("duracao"));
				curso.setModalidade(resultado.getString("modalidade"));
				Campus campus = new Campus();
				campus.setIdCampus(resultado.getInt("fk_campus"));
				curso.setCampus(campus);
				listaDeCursos.add(curso);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeCursos;
	}

	public ArrayList<Turma> buscarTurmas() {

		ArrayList<Turma> listaDeTurma = new ArrayList<Turma>();
		String SQL = "SELECT * FROM tb_turma";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Turma turma = new Turma();
				turma.setNome(resultado.getString("nome"));
				turma.setNumeroMinimo(resultado.getInt("numero_minimo"));
				turma.setAnoIngresso(resultado.getInt("ano_ingresso"));

				Curso curso = new Curso();
				turma.setCurso(curso);
				curso.setIdCurso(resultado.getInt("fk_curso"));

				listaDeTurma.add(turma);

			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeTurma;
	}

	public ArrayList<Disciplina> buscarDisciplina() {
		ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<Disciplina>();
		String SQL = "SELECT * FROM tb_Disciplina";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Disciplina disciplina = new Disciplina();

				disciplina.setNome(resultado.getString("nome"));
				Turma turma = new Turma(); 
				disciplina.setTurma(turma);
				turma.setidTurma(resultado.getInt("fk_turma"));
				

				
				listaDeDisciplinas.add(disciplina);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeDisciplinas;

	}

	public ArrayList<Matricula> buscarMatriculasAtivas() {
		ArrayList<Matricula> listaDeMatriculas = new ArrayList<Matricula>();
		String SQL = "SELECT * FROM tb_matricula WHERE situacao = true";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Matricula matricula = new Matricula();
				Aluno aluno = new Aluno();
				Turma turma = new Turma();
				matricula.setRa(resultado.getString("ra"));
				matricula.setData(resultado.getString("data"));
				matricula.setSituacao(resultado.getBoolean("situacao"));
				aluno.setidAluno(resultado.getInt("fk_aluno"));
				turma.setidTurma(resultado.getInt("fk_turma"));

				listaDeMatriculas.add(matricula);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeMatriculas;
	}

	public ArrayList<Matricula> buscarTodasMatriculas() {
		String SQL = "SELECT * FROM tb_matricula";
		ArrayList<Matricula> listaDeMatriculas = new ArrayList<Matricula>();
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Matricula matricula = new Matricula();
				Aluno aluno = new Aluno();
				Turma turma = new Turma();
				matricula.setRa(resultado.getString("ra"));
				matricula.setData(resultado.getString("data"));
				matricula.setSituacao(resultado.getBoolean("situacao"));
				aluno.setidAluno(resultado.getInt("fk_aluno"));
				turma.setidTurma(resultado.getInt("fk_turma"));
				matricula.setAluno(aluno);
				matricula.setTurma(turma);
				
                   listaDeMatriculas.add(matricula);
				
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeMatriculas;
	}

	
	public ArrayList<Disciplina> buscarDisciplinas() {
		ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<Disciplina>();
		String SQL = "SELECT * FROM tb_disciplina";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Disciplina disciplina = new Disciplina();
				disciplina.setNome(resultado.getString("id_disciplina"));
				disciplina.setNome(resultado.getString("nome"));

				Turma turma = new Turma();
				turma.setidTurma(resultado.getInt("fk_turma"));
				disciplina.setTurma(turma);
				Professor professor = new Professor();
				professor.setIdProfessor(resultado.getInt("fk_professor"));
				disciplina.setProfessor(professor);
				listaDeDisciplinas.add(disciplina);

			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeDisciplinas;
	}

	public ArrayList<Curso> buscarCursos() {
		ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();
		String SQL = "SELECT * FROM tb_curso";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Curso curso = new Curso();
				curso.setIdCurso(resultado.getInt("id_curso"));
				curso.setNome(resultado.getString("nome"));
				curso.setDuracao(resultado.getString("duracao"));
				curso.setModalidade(resultado.getString("modalidade"));
				Campus campus = new Campus();
				campus.setIdCampus(resultado.getInt("fk_campus"));
				curso.setCampus(campus);
				listaDeCursos.add(curso);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeCursos;
	}

}
