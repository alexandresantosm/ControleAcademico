package services;

//IMPORTAÇÃO DAS CLASSES 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enumsModels.Turno;
import models.Aluno;
import models.Curso;
import models.Professor;

public class CursoService {

	Curso curso = new Curso();
	List<Curso> listaCursos = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	

	public void addCurso() {
		
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		
		int codigo = 0;
		String cod = "";
		System.out.println("Código (apenas 4 digitos): ");
		do {
			cod += ler.nextLine();
			if(validador(ler.nextLine())) {
				
			}
			codigo = ler.nextInt();
		} while (codigo < 0000 && codigo > 9999);
		
		int opturno = 0;
		
		Turno turno;
		do {
			System.out.println("Turno: ");
			System.out.println("1_ Manhã /t 2_Tarde /t 3_noite");
			opturno = ler.nextInt(); 
			switch (opturno) {
			case 1:{
				turno = Turno.MANHA;
				break;}
			case 2:{
				turno = Turno.TARDE;
				break;}
			case 3: {
				turno = Turno.NOITE;
				break;}
			default:
					System.out.println("\nEscolha uma opção válida");
				break;
			}
		
		} while (opturno <1  || opturno > 3);
		
		System.out.println("Professor: ");
		
		Curso curso = new Curso (nome, codigo, turno , );
		
	}

	private boolean validador(String nextLine) {
		try {
			Integer integer = new Integer(nextLine);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Curso listarTodosOsCursos() {
		for (Curso curso : listaCursos) {

		}
		return curso;

	}

	public Curso buscarCurso(int codigo) {
		System.out.println("informe o código so curso desejado: ");
		curso.setCodigo(ler.nextInt());
		for (Curso curso : listaCursos) {
			if (curso.getCodigo() == codigo) {
				curso.toString();
				return curso;
			}
			System.out.println("Curso nao encontrado");
		}

		return null;
	}

	public void atualizarCurso() {

	}

	public void removerCurso() {

	}

}
