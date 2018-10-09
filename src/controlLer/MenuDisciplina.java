package controlLer;

import java.util.Scanner;

import services.DisciplinaService;

public class MenuDisciplina {

	static Scanner ler = new Scanner(System.in);

	public static void menuDisciplina() {

		DisciplinaService ds = new DisciplinaService();

		int op = -1;
		while (op != 6) {
			MenuCrud.menuCrud();
			op = ler.nextInt();

			switch (op) {
			case 1:
				ds.addDisciplina();
				break;
			case 2:
				ds.readDisciplina();
				break;
			case 3:
				ds.updateDisciplina();
				break;
			case 4:
				ds.deleteDisciplina();
				break;
			case 5:
				ds.listDisciplina();
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