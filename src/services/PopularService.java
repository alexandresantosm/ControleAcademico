package services;

import basemock.BancoDeDados;
import enumsModels.CategoriaProfessor;
import enumsModels.Situacao;
import enumsModels.Turno;
import models.Aluno;
import models.Curso;
import models.Disciplina;
import models.Professor;

public class PopularService {
	
	Curso c1, c2, c3, c4;
	Professor p1, p2, p3;
	Disciplina d1, d2, d3, d4, d5, d6;
	Aluno a1, a2, a3, a4;
	
	// Criacao de 4 cursos
	public void popularCurso() {
		
		c1 = new Curso();
		c1.setCodigo("1111");
		c1.setNome("SI");
		c1.setProfessor(p1);
		c1.setTurno(Turno.NOITE);
		c1.getDisciplinasCurso().add(d2);	
		c1.getDisciplinasCurso().add(d3);
		c1.getDisciplinasCurso().add(d4);
		c1.getDisciplinasCurso().add(d5);
		c1.getDisciplinasCurso().add(d6);
		
		c2 = new Curso();
		c2.setCodigo("1112");
		c2.setNome("Contabeis");
		c2.setProfessor(p2);
		c2.setTurno(Turno.TARDE);
		c2.getDisciplinasCurso().add(d1);
		
		c3 = new Curso();
		c3.setCodigo("1113");
		c3.setNome("Economia");
		c3.setProfessor(p3);
		c3.setTurno(Turno.MANHA);
		c3.getDisciplinasCurso().add(d2);	
		c3.getDisciplinasCurso().add(d3);
		c3.getDisciplinasCurso().add(d4);
		
		c4 = new Curso();
		c4.setCodigo("1114");
		c4.setNome("Redes");
		c4.setProfessor(p1);
		c4.setTurno(Turno.NOITE);
		c4.getDisciplinasCurso().add(d2);

		BancoDeDados.cursos.add(c1);
		BancoDeDados.cursos.add(c2);
		BancoDeDados.cursos.add(c3);
		BancoDeDados.cursos.add(c4);
	}
	
	// Criacao de 6 disciplinas
	public void popularDisciplina() {
		
		d1 = new Disciplina();
		d1.setCodigoDisciplina(1000);
		d1.setNomeDisciplina("Auditoria");
		d1.setProfessor(p2);
		d1.getChamada().add(a2);
		d1.setSala(123);
		d1.setCargaHoraria(2);
		d1.setHorario("13:00 a 14:00");
		d1.setCusto(2*45+1*30);
		
		d2 = new Disciplina();
		d2.setCodigoDisciplina(1001);
		d2.setNomeDisciplina("Calculo I");
		d2.setProfessor(p1);
		d2.getChamada().add(a1);
		d2.getChamada().add(a2);
		d2.setSala(395);
		d2.setCargaHoraria(4);
		d2.setHorario("18:30 a 20:00");
		d2.setCusto(4*25+1*30);
		
		d3 = new Disciplina();
		d3.setCodigoDisciplina(1002);
		d3.setNomeDisciplina("Calculo II");
		d3.setProfessor(p3);
		d3.getChamada().add(a2);
		d3.setSala(108);
		d3.setCargaHoraria(2);
		d3.setHorario("7:00 a 8:30");
		d3.setCusto(2*35+1*30);
		
		d4 = new Disciplina();
		d4.setCodigoDisciplina(1003);
		d4.setNomeDisciplina("Fund. Adm");
		d4.setProfessor(p2);
		d4.getChamada().add(a1);
		d4.getChamada().add(a2);
		d4.setSala(108);
		d4.setCargaHoraria(4);
		d4.setHorario("9:00 a 10:30");
		d4.setCusto(2*45+1*30);
		
		d5 = new Disciplina();
		d5.setCodigoDisciplina(1004);
		d5.setNomeDisciplina("POO");
		d5.setProfessor(p1);
		d5.getChamada().add(a1);
		d5.setSala(132);
		d5.setCargaHoraria(2);
		d5.setHorario("20:30 a 22:00");
		d2.setCusto(2*25+1*30);
		
		d6 = new Disciplina();
		d6.setCodigoDisciplina(1005);
		d6.setNomeDisciplina("Introd. a Inform");
		d6.setProfessor(p3);
		d6.getChamada().add(a4);
		d6.setSala(362);
		d6.setCargaHoraria(2);
		d6.setHorario("9:00 a 10:30");
		d6.setCusto(2*35+1*30);
		
		BancoDeDados.disciplinas.add(d1);
		BancoDeDados.disciplinas.add(d2);
		BancoDeDados.disciplinas.add(d3);
		BancoDeDados.disciplinas.add(d4);
		BancoDeDados.disciplinas.add(d5);
		BancoDeDados.disciplinas.add(d6);
	}
	
	// Criacao de 3 professores
	public void popularProfessor() {
		
		p1 = new Professor();
		p1.setNome("Jorge");
		p1.setCpf("795.026.175-83");
		p1.setEndereco("Rua São Goncalo, 478");
		p1.setEmail("jorge@email.com");
		p1.setTelefone(41178061);
		p1.setCategoria(CategoriaProfessor.ESPECIALISTA);
		p1.getDisciplinaProfessor().add(d2);
		p1.getDisciplinaProfessor().add(d4);
		p1.getDisciplinaProfessor().add(d5);
		
		p2 = new Professor();
		p2.setNome("Martha");
		p2.setCpf("122.807.274-16");
		p2.setEndereco("Rua B, 5");
		p2.setEmail("martha@email.com");
		p2.setTelefone(20811398);
		p2.setCategoria(CategoriaProfessor.DOUTOR);
		p2.getDisciplinaProfessor().add(d2);
		p2.getDisciplinaProfessor().add(d4);
		p2.getDisciplinaProfessor().add(d6);
		
		p3 = new Professor();
		p3.setNome("Samantha");
		p3.setCpf("156.043.411-29");
		p3.setEndereco("Rua G, 16");
		p3.setEmail("samantha@email.com");
		p3.setTelefone(407710047);
		p3.setCategoria(CategoriaProfessor.MESTRE);
		p3.getDisciplinaProfessor().add(d2);
		p3.getDisciplinaProfessor().add(d3);
		p3.getDisciplinaProfessor().add(d6);
		
		BancoDeDados.professores.add(p1);
		BancoDeDados.professores.add(p2);
		BancoDeDados.professores.add(p3);
	}
	
	// Criacao de 4 alunos
	public void popularAluno() {
		
		a1 = new Aluno();
		a1.setNome("Alex");
		a1.setCpf("287.643.412-16");
		a1.setEndereco("Rua A, 1");
		a1.setEmail("alex@email.com");
		a1.setTelefone(45933011);
		a1.setCurso(c1);
		a1.setMatricula("111112162018");
		a1.getDisciplinaAluno().add(d2);
		a1.getDisciplinaAluno().add(d4);
		a1.getDisciplinaAluno().add(d5);
		a1.setSituacao(Situacao.MATRICULADO);
		
		a2 = new Aluno();
		a2.setNome("Pedro");
		a2.setCpf("842.562.480-28");
		a2.setEndereco("Rua Dia, 48");
		a2.setEmail("pedro@email.com");
		a2.setTelefone(35418035);
		a2.setCurso(c2);
		a2.setMatricula("111280282018");
		a2.getDisciplinaAluno().add(d2);
		a2.getDisciplinaAluno().add(d4);
		a2.getDisciplinaAluno().add(d1);
		a2.setSituacao(Situacao.MATRICULADO);
		
		a3 = new Aluno();
		a3.setNome("Chico");
		a3.setCpf("415.983.745-53");
		a3.setEndereco("Rua por do Sol, 99");
		a3.setEmail("chico@email.com");
		a3.setTelefone(53638782);
		a3.setCurso(c2);
		a3.setMatricula("111245532018");
		a3.setSituacao(Situacao.PENDENTE);
		
		a4 = new Aluno();
		a4.setNome("Lucas");
		a4.setCpf("160.518.074-69");
		a4.setEndereco("Rua Amanhecer, 10");
		a4.setEmail("lucas@email.com");
		a4.setTelefone(43936411);
		a4.setCurso(c4);
		a4.setMatricula("111474692018");
		a4.getDisciplinaAluno().add(d6);
		a4.setSituacao(Situacao.MATRICULADO);
		
		BancoDeDados.alunos.add(a1);
		BancoDeDados.alunos.add(a2);
		BancoDeDados.alunos.add(a3);
		BancoDeDados.alunos.add(a4);
	}
}