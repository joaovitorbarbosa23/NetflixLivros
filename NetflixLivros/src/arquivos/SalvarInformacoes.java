package arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cadastros.CadastroLeitor;
import cadastros.CadastroLivros;

/**
 * Classe utilizada para salvar em arquivos
 * 
 * @author J.Vitor, Adrielly e Sidney
 *
 */

public class SalvarInformacoes {

	/**
	 * Salva no arquivo livros.arq um objeto passado de CadastroLivros
	 * 
	 * 
	 * @see CadastroLivros
	 * @param CadatrosLivros Objeto de CadastrosLivros
	 */

	public void salvarArquivo(CadastroLivros livros) {

		try {
			FileOutputStream arq = new FileOutputStream("livros.arq");
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(livros);
			obj.flush();

			// System.out.println("salvou");
			obj.close();

		} catch (IOException erro) {
			System.out.println("Erro ao salvar");
		}
	}

	/**
	 * Ler do arquivo livros.arq os objetos salvos anteriormentes. Retorna Objeto
	 * CadastroLivros
	 * 
	 * @see CadastroLivros
	 * @return CadastrosLivros
	 */

	public CadastroLivros lerArquivoLivros() {

		try {
			FileInputStream arq = new FileInputStream("livros.arq");
			ObjectInputStream obj = new ObjectInputStream(arq);
			CadastroLivros cadastroLivros = (CadastroLivros) obj.readObject();

			obj.close();
			return cadastroLivros;

		} catch (IOException | ClassNotFoundException erro) {
			System.out.println("Erro ao ler");
			return new CadastroLivros();
		}
	}

	public void salvarArquivo(CadastroLeitor leitor) {

		try {
			FileOutputStream arq = new FileOutputStream("leitor.arq");
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(leitor);
			obj.flush();

			// System.out.println("salvou");
			obj.close();

		} catch (IOException erro) {
			System.out.println("Erro ao salvar");
		}
	}

	/**
	 * Ler do arquivo livros.arq os objetos salvos anteriormentes. Retorna Objeto
	 * CadastroLivros
	 * 
	 * @see CadastroLivros
	 * @return CadastrosLivros
	 */

	public CadastroLeitor lerArquivoLeitor() {

		try {
			FileInputStream arq = new FileInputStream("leitor.arq");
			ObjectInputStream obj = new ObjectInputStream(arq);
			CadastroLeitor cadastroLeitor = (CadastroLeitor) obj.readObject();

			obj.close();
			return cadastroLeitor;

		} catch (IOException | ClassNotFoundException erro) {
			System.out.println("Erro ao ler");
			return new CadastroLeitor();
		}
	}

}
