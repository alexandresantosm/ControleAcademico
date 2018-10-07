package ControlLer;

import java.util.Scanner;

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
				System.out.println("Fechando o Sistema!!!");
				break;
			default:
				System.out.println("\nEscolha uma opção válida");
				break;
			}

		} while (op <1  || op > 5);
	}

}
