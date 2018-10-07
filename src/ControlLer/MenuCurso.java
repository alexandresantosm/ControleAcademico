package ControlLer;

import java.util.Scanner;

import services.CursoService;

public class MenuCurso {

	static Scanner ler = new Scanner(System.in);

	public static void menuCurso() {

		MenuCrud.menuCrud();
		CursoService sCurso = new CursoService();

		int op = ler.nextInt();

		switch (op) {
		case 1:
			sCurso.addCurso();
			break;
		case 2:
			//sC.buscarCurso(null);
			break;
		case 3:
			//sCurso.atualizarCurso();
			break;
		case 4:
			//sCurso.removerCurso();
			break;
		case 5:
			MenuPrincipal.menuPrincipal();
			break;
		default:
			System.out.println("Escolha uma opção válida");
			break;
		}
		while (op > 5)
			;

	}

}
