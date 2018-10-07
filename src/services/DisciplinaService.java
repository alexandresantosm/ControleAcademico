package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Disciplina;
import models.Professor;

public class DisciplinaService {

	List<Disciplina> disciplinas = new ArrayList<>();
	Scanner ler = new Scanner(System.in);

	public void addDisciplina() {
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		System.out.println("Código da Disciplina: ");
		int codDisciplina = ler.nextInt();
		System.out.println("Coodenador: ");
		String professor = ler.nextLine();
		
		
		/*nome;
		private int codDisciplina;
		private Professor professsor;
		private int sala;
		private int cargahoraria;
		private float horario;
		private float custo;
*/
	}

}
