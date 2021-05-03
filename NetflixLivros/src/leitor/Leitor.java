package leitor;

import java.util.ArrayList;

import livro.Livro;
import pacotes.Pacotes;

public class Leitor {
	private String nome;
	private int codigo;
	private String dataNascimento;
	private String email;
	Pacotes pacote;
	ArrayList<Livro> livrosLidos = new ArrayList<Livro>();
	ArrayList<Livro> livrosEmLeitura = new ArrayList<Livro>();
	ArrayList<Livro> livrosAbandonados = new ArrayList<Livro>();
	ArrayList<Livro> livrosParaLer = new ArrayList<Livro>();

	public Leitor(String nome, int codigo, String dataNascimento, String email) {
		this.nome = nome;
		this.codigo = codigo;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public void adicionarLivroLido(Livro livro) {
		livrosLidos.add(livro);
	}

	public void removerLivroLido(int codLivro) {
		for (int i = 0; i < livrosLidos.size(); i++) {
			if (codLivro == livrosLidos.get(i).getCodigo()) {
				livrosLidos.remove(i);
			}
		}
	}

	public void adicionarLivroEmLeitura(Livro livro) {
		if (pacote.verificarQuantidadeDeLivros(livrosEmLeitura.size() + livrosParaLer.size())) {
			livrosEmLeitura.add(livro);
		}

		else {
			System.out.println("Nao foi possivel adicionar, quantidade de livros excedida");
		}
	}

	public void removerLivroEmLeitura(int codLivro) {
		for (int i = 0; i < livrosEmLeitura.size(); i++) {
			if (codLivro == livrosEmLeitura.get(i).getCodigo()) {
				livrosEmLeitura.remove(i);
			}
		}
	}

	public void adicionarLivroAbandonado(Livro livro) {
		livrosAbandonados.add(livro);
	}

	public void removerLivroAbandonado(int codLivro) {
		for (int i = 0; i < livrosAbandonados.size(); i++) {
			if (codLivro == livrosAbandonados.get(i).getCodigo()) {
				livrosAbandonados.remove(i);
			}
		}
	}

	public void adicionarLivroParaLer(Livro livro) {
		if (pacote.verificarQuantidadeDeLivros(livrosEmLeitura.size() + livrosParaLer.size())) {
			livrosParaLer.add(livro);
		}

		else {
			System.out.println("Nao foi possivel adicionar, quantidade de livros excedida");
		}
	}

	public void removerLivroParaLer(int codLivro) {
		for (int i = 0; i < livrosParaLer.size(); i++) {
			if (codLivro == livrosParaLer.get(i).getCodigo()) {
				livrosParaLer.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		String saida;

		saida = "Leitor nome=" + nome + ", codigo=" + codigo + ", dataNascimento=" + dataNascimento + ", email="
				+ email;

		if (livrosLidos.size() == 0) {
			saida += "\n Livros lidos:" + "\n Nao existem livros lidos";
		}

		else {
			saida += "\n Livros lidos ";
			for (int i = 0; i < livrosLidos.size(); i++) {
				saida += "\n Nome livro : " + livrosLidos.get(i).getTitulo();
				for (int j = 0; j < livrosLidos.get(i).getComentario().size(); j++) {
					if (livrosLidos.get(i).getComentario().get(j).getCodLeitor() == this.codigo) {
						saida += "Meu comentario: " + livrosLidos.get(i).getComentario().get(j).getComentario();
					}
				}
			}

		}

		if (livrosEmLeitura.size() == 0) {
			saida += "\n Livros em Leitura:" + "\n Nao existem livros em leitura";
		}

		else {
			saida += "\n Livros em leitura: ";
			for (int i = 0; i < livrosEmLeitura.size(); i++) {
				saida += "\n Nome livro : " + livrosEmLeitura.get(i).getTitulo();
				for (int j = 0; j < livrosEmLeitura.get(i).getComentario().size(); j++) {
					if (livrosEmLeitura.get(i).getComentario().get(j).getCodLeitor() == this.codigo) {
						saida += "Meu comentario: " + livrosEmLeitura.get(i).getComentario().get(j).getComentario();
					}
				}
			}

		}

		if (livrosAbandonados.size() == 0) {
			saida += "\n Livros abandonados:" + "\n Nao existem livros abandonados";
		}

		else {
			saida += "\n Livros abandonados: ";
			for (int i = 0; i < livrosAbandonados.size(); i++) {
				saida += "\n Nome livro : " + livrosAbandonados.get(i).getTitulo();
				for (int j = 0; j < livrosAbandonados.get(i).getComentario().size(); j++) {
					if (livrosAbandonados.get(i).getComentario().get(j).getCodLeitor() == this.codigo) {
						saida += "Meu comentario: " + livrosAbandonados.get(i).getComentario().get(j).getComentario();
					}
				}
			}

		}

		if (livrosParaLer.size() == 0) {
			saida += "\n Livros para ler:" + "\n Nao existem livros para ler";
		}

		else {
			saida += "\n Livros para ler: ";
			for (int i = 0; i < livrosParaLer.size(); i++) {
				saida += "\n Nome livro : " + livrosParaLer.get(i).getTitulo();
				for (int j = 0; j < livrosParaLer.get(i).getComentario().size(); j++) {
					if (livrosParaLer.get(i).getComentario().get(j).getCodLeitor() == this.codigo) {
						saida += "Meu comentario: " + livrosParaLer.get(i).getComentario().get(j).getComentario();
					}
				}
			}

		}

		return saida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPacote(Pacotes pacote) {
		this.pacote = pacote;
	}

	public Pacotes getPacote() {
		return pacote;
	}

}
