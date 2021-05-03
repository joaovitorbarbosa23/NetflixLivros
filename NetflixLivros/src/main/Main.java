package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import arquivos.SalvarInformacoes;
import cadastros.CadastroLivros;
import livro.Livro;

public class Main {
	
	static SalvarInformacoes salvar = new SalvarInformacoes();
	static CadastroLivros cadLivros = new CadastroLivros();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		cadLivros = salvar.lerArquivoLivros();
		menuCadastroLivros();
		
	}
	
	
	public static void menuCadastroLivros() {
		
		int esc;
		
		do {
			System.out.println("\tCADASTRO DE LIVROS\n");
			System.out.println("1 - Criar livro");
			System.out.println("2 - Editar/Atualizar livro");
			System.out.println("3 - Remover livro");
			System.out.println("4 - Vizualizar todos os livros");
			System.out.println("5 - Buscar livros");
			System.out.println("6 - Sair");
			
			System.out.print("\nDigite escolha: ");
			
			try {
				
				esc = sc.nextInt();
				
			} catch(InputMismatchException ex) {
				
				System.out.print("\n\nA entrada deve ser um numero inteiro!");
				esc = 0;
				sc.nextLine();
			}
		
		} while(escolhaInvalida(esc, 1, 6));

		escolhaMenuCadastroLivros(esc);
	}
	
	private static void escolhaMenuCadastroLivros(int esc) {
		
		switch(esc) {
			
			case 1: System.out.println("\n\n============================================\n");
					criarLivro();
					break;
					
			case 2: System.out.println("\n\n============================================\n");
					editarLivro();
					break;
					
			case 3: System.out.println("\n\n============================================\n");
					removerLivro();
					break;
					
			case 4: System.out.println("\n\n============================================\n");
					menuVizualizarLivros();
					break;
					
			case 5: System.out.println("\n\n============================================\n");
					menuBuscarLivros();
					break;
			
		}
		
	}
	
	public static void criarLivro() {
		
		Livro livro;
		int codigo, ano, edicao;
		String titulo, autor, editora, idioma, assunto, descricao;
		
		System.out.println("\tINFORME OS DADOS DO LIVRO:\n");
		
		try {
			
			System.out.print("Codigo: ");
			codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("Autor : ");
			autor = sc.nextLine();
			System.out.print("Editora: ");
			editora = sc.nextLine();
			System.out.print("Ano de lancamento: ");
			ano = sc.nextInt();
			sc.nextLine();
			System.out.print("Numero da edicao: ");
			edicao = sc.nextInt();
			sc.nextLine();
			System.out.print("Idioma: ");
			idioma = sc.nextLine();
			System.out.print("Assunto: ");
			assunto = sc.nextLine();
			System.out.print("Descricao: ");
			descricao = sc.nextLine();
			
			livro = new Livro(codigo, titulo, autor, editora, ano, edicao, idioma, assunto, descricao);
			
			if(cadLivros.create(livro) == true) {
				System.out.println("\n\tLivro criado!");
			}
			
		} catch(InputMismatchException a) {
			
			System.out.print("\n\nEntrada invalida!");
			sc.nextLine();
		}
		
		salvar.salvarArquivo(cadLivros);
		System.out.println("\n\n============================================\n");
		menuCadastroLivros();
	}
	
	
	public static void editarLivro() {
		
		Livro novoLivro;
		int codigo, ano, edicao, codAntigo;
		String titulo, autor, editora, idioma, assunto, descricao;
		
		
		try {
			
			System.out.print("Digite codigo do livro que deseja editar: ");
			codAntigo = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n\n\tINFORME OS NOVOS DADOS DO LIVRO:\n");
			
			System.out.print("Codigo: ");
			codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("Autor : ");
			autor = sc.nextLine();
			System.out.print("Editora: ");
			editora = sc.nextLine();
			System.out.print("Ano de lancamento: ");
			ano = sc.nextInt();
			sc.nextLine();
			System.out.print("Numero da edicao: ");
			edicao = sc.nextInt();
			sc.nextLine();
			System.out.print("Idioma: ");
			idioma = sc.nextLine();
			System.out.print("Assunto: ");
			assunto = sc.nextLine();
			System.out.print("Descricao: ");
			descricao = sc.nextLine();
			
			novoLivro = new Livro(codigo, titulo, autor, editora, ano, edicao, idioma, assunto, descricao);
			
			if(cadLivros.edit(codAntigo, novoLivro) == true) {
				System.out.println("\n\tLivro editado!");
			}
			
		} catch(InputMismatchException a) {
			
			System.out.print("\n\nEntrada invalida!");
			sc.nextLine();
		}
		
		salvar.salvarArquivo(cadLivros);
		System.out.println("\n\n============================================\n");
		menuCadastroLivros();
	}
	
	
	public static void removerLivro() {
		
		int codigo;
		
		System.out.print("Digite codigo do livro que deseja remover: ");
		codigo = sc.nextInt();
		
		if(cadLivros.delete(codigo) == true){
			System.out.println("\n\tLivro removido!");
		}
		
		salvar.salvarArquivo(cadLivros);
		System.out.println("\n\n============================================\n");
		menuCadastroLivros();
	}
	
	
	
	public static void menuVizualizarLivros() {
		
		int esc;
		
		do {
			System.out.println("\tVIZUALIZAR LIVROS\n");
			System.out.println("1 - por Assunto");
			System.out.println("2 - por Mais Lidos");
			System.out.println("3 - Voltar");
			
			System.out.print("\nDigite escolha: ");
			
			try {
				
				esc = sc.nextInt();
				
			} catch(InputMismatchException ex) {
				
				System.out.print("\n\nA entrada deve ser um numero inteiro!");
				esc = 0;
				sc.nextLine();
			}
		
		} while(escolhaInvalida(esc, 1, 3));

		escolhaMenuVizualizarLivros(esc);
	}
	
	
	private static void escolhaMenuVizualizarLivros(int esc) {
		
		switch(esc) {
			
			case 1: System.out.println("\n\n============================================\n");
					vizualizarPorAssunto();
					break;
					
			case 2: System.out.println("\n\n============================================\n");
					System.out.println("\n\n\tMAIS LIDOS:");
					cadLivros.listarPorMaisLidos();
					System.out.println("\n\n============================================\n");
					menuVizualizarLivros();
					break;
					
			case 3: System.out.println("\n\n============================================\n");
					menuCadastroLivros();
					break;
		}
		
	}
	
	
	public static void vizualizarPorAssunto() {
		
		String assunto;
		
		System.out.print("Digite assunto: ");
		sc.nextLine();
		assunto = sc.nextLine();
		
		System.out.println("\n\n\tASSUNTO: " + assunto);
		cadLivros.buscarLivroPorAssunto(assunto);
		
		System.out.println("\n\n============================================\n");
		menuVizualizarLivros();
	}
	
	
	public static void menuBuscarLivros() {
		
		int esc;
		
		do {
			System.out.println("\tBUSCAR LIVROS\n");
			System.out.println("1 - por Titulo");
			System.out.println("2 - por Autor");
			System.out.println("3 - por Palavra-chave");
			System.out.println("4 - Voltar");
			
			System.out.print("\nDigite escolha: ");
			
			try {
				
				esc = sc.nextInt();
				
			} catch(InputMismatchException ex) {
				
				System.out.print("\n\nA entrada deve ser um numero inteiro!");
				esc = 0;
				sc.nextLine();
			}
		
		} while(escolhaInvalida(esc, 1, 4));

		escolhaMenuBuscarLivros(esc);
	}
	
	private static void escolhaMenuBuscarLivros(int esc) {
		
		switch(esc) {
			
			case 1: System.out.println("\n\n============================================\n");
					buscarPorTitulo();
					break;
					
			case 2: System.out.println("\n\n============================================\n");
					buscarPorAutor();
					break;
					
			case 3: System.out.println("\n\n============================================\n");
					buscarPorPalavraChave();
					break;
					
			case 4: System.out.println("\n\n============================================\n");
					menuCadastroLivros();
					break;
		}
		
	}
	
	
	public static void buscarPorTitulo() {
		
		String titulo;
		
		System.out.print("Digite titulo do livro: ");
		sc.nextLine();
		titulo = sc.nextLine();
		
		System.out.println("\n\n\tTITULO: " + titulo);
		cadLivros.buscarLivroPorTitulo(titulo);
		
		System.out.println("\n\n============================================\n");
		menuBuscarLivros();
	}
	
	public static void buscarPorAutor() {
		
		String autor;
		
		System.out.print("Digite nome do autor: ");
		sc.nextLine();
		autor = sc.nextLine();
		
		System.out.println("\n\n\tAUTOR: " + autor);
		cadLivros.buscarLivroPorAutor(autor);
		
		System.out.println("\n\n============================================\n");
		menuBuscarLivros();
	}
	
	public static void buscarPorPalavraChave() {
		
		String palavraChave;
		
		System.out.print("Digite palavra-chave: ");
		sc.nextLine();
		palavraChave = sc.nextLine();
		
		System.out.println("\n\n\tPALAVRA-CHAVE: " + palavraChave);
		cadLivros.buscarLivroPorPalavraChave(palavraChave);
		
		System.out.println("\n\n============================================\n");
		menuBuscarLivros();
	}
	
	
	private static boolean escolhaInvalida(int esc, int menor, int maior) {
		
		if(esc > maior || esc < menor) {
			System.out.println("\n\nEscolha invalida!!");
			System.out.println("Digite novamente!\n\n");
			return true;
		}
		else {
			return false;
		}
	}
}
