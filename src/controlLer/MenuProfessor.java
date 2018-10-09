package controlLer;

import java.util.Scanner;

import services.ProfessorService;

public class MenuProfessor {

	static Scanner ler = new Scanner(System.in);

	public static void menuProfessor() {

		ProfessorService ps = new ProfessorService();

		int op = -1;
		while (op != 6) {
			MenuCrud.menuCrud();
			op = ler.nextInt();

			switch (op) {
			case 1:
				ps.addProfessor();
				break;
			case 2:
				ps.readProfessor();
				break;
			case 3:
				ps.updateProfessor();
				break;
			case 4:
				ps.deleteProfessor();
				break;
			case 5:
				ps.listProfessor();
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