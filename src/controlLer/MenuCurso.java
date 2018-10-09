package controlLer;

import java.util.Scanner;

import services.CursoService;

public class MenuCurso {

	static Scanner ler = new Scanner(System.in);

	public static void menuCurso() {

		CursoService cs = new CursoService();

		int op = -1;
		while (op != 6) {
			MenuCrud.menuCrud();
			op = ler.nextInt();

			switch (op) {
			case 1:
				cs.addCurso();
				break;
			case 2:
				cs.readCurso();
				break;
			case 3:
				cs.updateCurso();
				break;
			case 4:
				cs.deleteCurso();
				break;
			case 5:
				cs.listCurso();
				break;
			case 6:
				MenuPrincipal.menuPrincipal();
				break;
			default:
				System.out.println("Escolha uma opcao valida");
				break;
			}
		}
	}
}