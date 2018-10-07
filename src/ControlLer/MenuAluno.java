package ControlLer;

import java.util.Scanner;

import services.AlunoService;

public class MenuAluno {

	static Scanner ler = new Scanner(System.in);

	public static void menuAluno() {

		System.out.println("######## Menu Aluno ########");
		MenuCrud.menuCrud();
		AlunoService as = new AlunoService();

		int op = ler.nextInt();

		switch (op) {
		case 1:
			as.addAluno();
			break;
		case 2:
			as.readAluno();
			break;
		case 3:
			as.updateAluno();
			break;
		case 4:
			as.deleteAluno();
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
