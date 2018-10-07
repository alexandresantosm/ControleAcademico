package services;

import java.util.List;
import java.util.Scanner;

import ControlLer.MenuPrincipal;
import ControlLer.MenuProfessor;
import Models.Disciplina;
import Models.Professor;
import dao.DisciplinaDAO;
import dao.ProfessorDAO;
import enumsModels.CategoriaProfessor;

public class ProfessorService {

	ProfessorDAO professorDao = new ProfessorDAO();
	DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	
	Scanner ler = new Scanner(System.in);

	public void addProfessor() {
		
		// Adiciona professor
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		
		String cpf = "";
		do {
			System.out.print("CPF(apenas 11 digitos): ");
			cpf = ler.nextLine();
		} while(cpf.length() != 11);
		
		System.out.print("Endereco: ");
		String endereco = ler.nextLine();
		System.out.print("e-mail: ");
		String email = ler.nextLine();
		
		String str = "";
		long telefone = 0;
		do {
			System.out.print("Telefone: ");
			telefone = ler.nextLong();
			str = Long.toString(telefone);
		} while (str.length() < 8 || str.length() > 9);
		
		CategoriaProfessor categoria = null;
		
		int opCategoria= 0;
		do {
			System.out.println("Categoria: ");
			System.out.println("1_ Epsecialista /t 2_Mestre /t 3_Doutor");
			opCategoria = ler.nextInt();
			
			switch (opCategoria) {
			case 1: {
				categoria = CategoriaProfessor.ESPECIALISTA;
				break;
			}
			case 2: {
				categoria = CategoriaProfessor.MESTRE;
				break;
			}
			case 3: {
				categoria = CategoriaProfessor.DOUTOR;
				break;
			}
			default:
				System.out.println("\nEscolha uma opção válida");
				break;
			}

		} while (opCategoria < 1 || opCategoria > 3);
		
		List<Disciplina> listaDisciplina = disciplinaDao.select();
		
		System.out.println("Escolha as disciplinas:");
		listaDisciplina.forEach(disciplina -> {
			System.out.println("Codigo: "+ disciplina.getCodigoDisciplina() + " Nome: " + disciplina.getNomeDisciplina());
		});
		
		String disciplina = "";
		Professor p = new Professor();
		do {
			System.out.println("Digite o codigo da disciplina:");
			System.out.println("Caso tenha inserido todas digite q");
			disciplina = ler.nextLine();
			Disciplina dis = disciplinaDao.select(disciplina);
			if(dis != null)
				p.getDisciplinaProfessor().add(dis);
		} while(!disciplina.equals("q"));
		
		p.setNome(nome);
		p.setCpf(cpf);
		p.setEndereco(endereco);
		p.setEmail(email);
		p.setTelefone(telefone);
		p.setCategoria(categoria);
		
		professorDao.insert(p);
		
		System.out.println("Professor Cadastrado!!!");
		System.out.println("\nContinuar em operações para Professor?");
		System.out.println("(1) SIM\n(2) NÂO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuProfessor.menuProfessor();
		}
		MenuPrincipal.menuPrincipal();
	}

	public void readProfessor() {
		String cpf = "";
		System.out.println("Digite o CPF para pesquisar um professor: ");
		cpf = ler.nextLine();
		
		Professor professor = professorDao.select(cpf);
		if(professor != null) {
			System.out.println("Nome: " + professor.getNome() + "\nCPF: " + professor.getCpf() + 
			"\nEndereco: " + professor.getEndereco() + "\nEmail: " + professor.getEmail() + 
			"\nTelefone: " + professor.getTelefone() + "\nCategoria: " + professor.getCategoria() +
			"\nDisciplina: " + professor.getDisciplinaProfessor());
		}
	}

	public void updateProfessor() {
		String cpf = "";
		System.out.println("Digite o CPF para editar um professor: ");
		cpf = ler.nextLine();
		Professor professor = professorDao.select(cpf);
		if(professor != null) {
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("CPF: ");
			cpf = ler.nextLine();
			System.out.print("Endereco: ");
			String endereco = ler.nextLine();
			System.out.print("e-mail: ");
			String email = ler.nextLine();
			System.out.print("Telefone: ");
			long telefone = ler.nextLong();
			
			CategoriaProfessor categoria = null;
			
			int opCategoria= 0;
			do {
				System.out.println("Categoria: ");
				System.out.println("1_ Epsecialista /t 2_Mestre /t 3_Doutor");
				opCategoria = ler.nextInt();
				
				switch (opCategoria) {
				case 1: {
					categoria = CategoriaProfessor.ESPECIALISTA;
					break;
				}
				case 2: {
					categoria = CategoriaProfessor.MESTRE;
					break;
				}
				case 3: {
					categoria = CategoriaProfessor.DOUTOR;
					break;
				}
				default:
					System.out.println("\nEscolha uma opção válida");
					break;
				}

			} while (opCategoria < 1 || opCategoria > 3);
			
			List<Disciplina> listaDisciplina = disciplinaDao.select();
			
			System.out.println("Escolha as disciplinas:");
			listaDisciplina.forEach(d -> {
				System.out.println("Codigo: "+ d.getCodigoDisciplina() + " nome: " + d.getNomeDisciplina());
			});
			
			String disciplina = "";
			Professor p = new Professor();
			do {
				System.out.println("Digite o codigo da disciplina:");
				System.out.println("Caso tenha inserido todas digite q");
				disciplina = ler.nextLine();
				Disciplina disciplinaProfessor = disciplinaDao.select(disciplina);
				if(disciplinaProfessor != null)
					p.getDisciplinaProfessor().add(disciplinaProfessor);
			} while(!disciplina.equals("q"));
			
			p.setNome(nome);
			p.setCpf(cpf);
			p.setEndereco(endereco);
			p.setEmail(email);
			p.setTelefone(telefone);
			p.setCategoria(categoria);
			
			professorDao.update(p);
		}
	}

	public void deleteProfessor() {
		Professor professor = new Professor();
		do {
			String cpf = "";
			System.out.println("Digite o CPF para deletar um professor: ");
			cpf = ler.nextLine();
			professor = professorDao.select(cpf);
			if(professor != null) {
				professorDao.delete(professor);
			}
		} while(professor == null);
	}
}
