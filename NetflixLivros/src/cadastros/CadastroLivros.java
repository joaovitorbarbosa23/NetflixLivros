package cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import excecoes.LivroNaoCadastradoException;
import livro.*;

/**
 * Classe que cadastra os livros e implementa OperacaoesCadastrais e
 * Serializable
 * 
 * @see OperacoesCadastrais
 * @see Serializable
 * @author J. Vitor, Adrielly e Sidney.
 */

public class CadastroLivros implements OperacoesCadastrais, Serializable {

	private static final long serialVersionUID = 1L;
	ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();

	/**
	 * Metodo adiciona um livro, subscreve de OperacoesCadastrais
	 * 
	 * @see OperacoesCadastrais
	 * @param - Object
	 * @return boolean true se cadastrado, false se nao
	 */

	@Override
	public boolean create(Object obj) {

		try {
			getLivro(((Livro) obj).getCodigo());
			return false;

		} catch (LivroNaoCadastradoException ex) {
			livrosCadastrados.add((Livro) obj);
			return true;
		}
	}

	/**
	 * Metodo que exclui um livro por seu codigo, subscreve de OperacoesCadastrais.
	 * 
	 * @param int Codigo do livro
	 * @return - true se deletado, false se nao encontrado
	 */

	@Override
	public boolean delete(int codLivro) {

		try {
			livrosCadastrados.remove(getLivro(codLivro));
			return true;

		} catch (LivroNaoCadastradoException ex) {
			System.out.println("\n" + ex.getMessage());
			return false;
		}
	}

	/**
	 * Metodo que edita um livro, pelo seu codigo e passando um novo livro,
	 * subscreve de OperacoesCadastrais
	 * 
	 * @param        int Codigo do livro
	 * @param Object Objeto tipo Livro
	 * @see Livro
	 * @return true se editado, false se nao
	 */

	public boolean edit(int codLivro, Object obj) {

		int index;

		try {
			index = livrosCadastrados.indexOf(getLivro(codLivro));
			livrosCadastrados.set(index, (Livro) obj);
			return true;

		} catch (LivroNaoCadastradoException ex) {
			System.out.println("\n" + ex.getMessage());
			return false;
		}
	}

	/**
	 * Metodo que retorna um objeto Livro, procurando por seu codigo
	 * 
	 * @see Livro
	 * @param cod int Codigo do livro
	 * @return Object Tipo livro
	 */

	public Livro getLivro(int cod) throws LivroNaoCadastradoException {

		for (int i = 0; i < livrosCadastrados.size(); i++) {
			if (livrosCadastrados.get(i).getCodigo() == cod) {
				return livrosCadastrados.get(i);
			}
		}

		throw new LivroNaoCadastradoException();
	}

	/**
	 * Metodo que printa os livros por sua classificacao: Mais Lidos
	 */

	public void listarPorMaisLidos() {
		ArrayList<Livro> arrayPorMaisLidos = new ArrayList<Livro>();

		arrayPorMaisLidos = livrosCadastrados;

		Collections.sort(arrayPorMaisLidos);

		for (int i = 0; i < arrayPorMaisLidos.size(); i++) {
			System.out.println("\n\n");
			System.out.println(arrayPorMaisLidos.get(i).toString());
		}
	}

	/**
	 * Busca todos os livros do mesmo assunto
	 * 
	 * @param assunto Nome do assunto
	 */

	public void buscarLivroPorAssunto(String assunto) {
		for (int i = 0; i < livrosCadastrados.size(); i++) {
			if (livrosCadastrados.get(i).getAssunto().equals(assunto)) {
				System.out.println("\n\n");
				System.out.println(livrosCadastrados.get(i).toString());
			}
		}
	}

	/**
	 * Busca todos os livros de um autor
	 * 
	 * @param autor Nome do autor
	 */

	public void buscarLivroPorAutor(String autor) {
		for (int i = 0; i < livrosCadastrados.size(); i++) {
			if (livrosCadastrados.get(i).getAutor().equals(autor)) {
				System.out.println("\n\n");
				System.out.println(livrosCadastrados.get(i).toString());
			}
		}
	}

	/**
	 * Busca um livro por seu titulo
	 * 
	 * @param titulo Nome do titulo
	 */

	public void buscarLivroPorTitulo(String titulo) {
		for (int i = 0; i < livrosCadastrados.size(); i++) {
			if (livrosCadastrados.get(i).getTitulo().equals(titulo)) {
				System.out.println("\n\n");
				System.out.println(livrosCadastrados.get(i).toString());
			}
		}
	}

	/**
	 * Busca todos os livros como a palavra chave em seu titulo
	 * 
	 * @param palavraChave A palavra chave especifica
	 */

	public void buscarLivroPorPalavraChave(String palavraChave) {
		Pattern pattern = Pattern.compile(palavraChave);
		for (int i = 0; i < livrosCadastrados.size(); i++) {
			Matcher matcher = pattern.matcher(livrosCadastrados.get(i).getTitulo());
			if (matcher.find()) {
				System.out.println("\n\n");
				System.out.println(livrosCadastrados.get(i).toString());
			}
		}
	}
}
