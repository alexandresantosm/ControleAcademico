package controlLer;

import java.util.Scanner;

import services.AlunoService;

public class MenuAluno {

	static Scanner ler = new Scanner(System.in);

	public static void menuAluno() {

		AlunoService as = new AlunoService();

		int op = -1;
		while (op != 6) {
			MenuCrud.menuCrud();
			op = ler.nextInt();

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
				as.listAluno();
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