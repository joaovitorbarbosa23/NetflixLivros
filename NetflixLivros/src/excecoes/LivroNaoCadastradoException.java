package excecoes;


/**
 * Classe que trata a excecao de livros nao cadastrados extende Exception
 * 
 * @see Exception
 * @author J. Vitor, Adrielly e Sidney
 */

public class LivroNaoCadastradoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Metodo construtor que passa  a mensagem para classe que herda exception a mensagem de excecao
	 * 
	 */

	public LivroNaoCadastradoException() {
		super("Nao existe livro cadastrado com o codigo fornecido");
	}
}
