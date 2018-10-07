package ControlLer;

import java.util.Scanner;

import services.ProfessorService;

public class MenuProfessor {

	static Scanner ler = new Scanner(System.in);

	public static void menuProfessor() {
		System.out.println("######## Menu Professor ########");
		MenuCrud.menuCrud();
		ProfessorService ps = new ProfessorService();

		int op = ler.nextInt();

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
			MenuPrincipal.menuPrincipal();
			break;
		default:
			System.out.println("Escolha uma opção válida");
			break;
		}
		while (op > 5);
	}
}
