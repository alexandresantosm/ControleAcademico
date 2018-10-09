package controlLer;

import java.util.Scanner;

import services.PopularService;

public class MenuPrincipal {

	static int op = 0;
	private static Scanner ler;

	public static void menuPrincipal() {

		System.out.println("\n*************** Sistema de Gerenciamento de cadastros ***************\n");
		System.out.println("\nEscolha uma das opcções");

		do {

			System.out.println("(1) Aluno");
			System.out.println("(2) Professor");
			System.out.println("(3) Disciplina");
			System.out.println("(4) Curso");
			System.out.println("(5) Sair");
			System.out.println("(99) Popular o programa");

			ler = new Scanner(System.in);


			op = ler.nextInt();
			switch (op) {
			case 1:
				MenuAluno.menuAluno();
				break;
			case 2:
				MenuProfessor.menuProfessor();
				break;
			case 3:
				MenuCurso.menuCurso();
				break;
			case 4:
				MenuDisciplina.menuDisciplina();
				break;
			case 5:
				System.out.println("Fechando o Programa!!!");
				break;
			case 99:
				System.out.println("Popular o programa com dados");
				PopularService ps = new PopularService();
				System.out.println("Populando curso...");
				ps.popularCurso();
				System.out.println("Populando disciplina...");
				ps.popularDisciplina();
				System.out.println("Populando professor...");
				ps.popularProfessor();
				System.out.println("Populando aluno...");
				ps.popularAluno();
				
				System.out.println("Programa populado com sucesso!!!");
			default:
				System.out.println("\nEscolha uma opcao valida");
				break;
			}

		} while (op <1  || op > 5);
	}
}