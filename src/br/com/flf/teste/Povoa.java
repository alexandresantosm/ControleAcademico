package br.com.flf.teste;

import br.com.flf.model.Disciplina;
import br.com.flf.model.Turno;
import br.com.flf.service.AlunoService;
import br.com.flf.service.CursoService;
import br.com.flf.service.DisciplinaService;
import br.com.flf.service.ProfessorService;

public class Povoa {
	
	public void povoa() {
		CursoService cs1 = new CursoService();
		CursoService cs2 = new CursoService();
		CursoService cs3 = new CursoService();
		CursoService cs4 = new CursoService();
		cs1.addCurso("SI", 1111, Turno.NOITE);
		cs2.addCurso("Contabeis", 1112, Turno.TARDE);
		cs3.addCurso("Economia", 1113, Turno.MANHA);
		cs4.addCurso("Redes", 1114, Turno.NOITE);
		
		DisciplinaService ds1 = new DisciplinaService();
		DisciplinaService ds2 = new DisciplinaService();
		DisciplinaService ds3 = new DisciplinaService();
		DisciplinaService ds4 = new DisciplinaService();
		DisciplinaService ds5 = new DisciplinaService();
		DisciplinaService ds6 = new DisciplinaService();
		
		ds1.addDisciplina("Auditoria", 1000, 123, 22, "13:00 a 14:00", 75);
		ds2.addDisciplina("Calculo I", 1001, 395, 15, "18:30 a 20:00", 82.5);
		ds3.addDisciplina("Calculo II", 1002, 108, 30, "7:00 a 8:30", 97.5);
		ds4.addDisciplina("Fund. Adm.", 1003, 108, 18, "9:00 a 10:30", 112.5);
		ds5.addDisciplina("POO", 1004, 132, 30, "20:30 a 22:00", 82.5);
		ds6.addDisciplina("Introd. Inform", 1005, 362, 15, "18:30 a 20:00", 97.5);
	}
}
