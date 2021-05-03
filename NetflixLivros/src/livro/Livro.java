package livro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que cria um livro, implementa Comparable e Serializable
 * 
 * 
 * @see Comparable
 * @see Serializable
 * @author @author J. Vitor, Adrielly e Sidney.
 *
 */



public class Livro implements Comparable<Livro>, Serializable{

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private int edicao;
	private String idioma;
	private String assunto;
	private String descricao;
	private int qtdVezesLidos;
	ArrayList<Comentario> comentarios = new ArrayList<Comentario>();


	
	/**
	 * Metodo contrutor que passa para a classe os atributos 
	 * 
	 * @param codigo int
	 * @param titulo String
	 * @param autor String
	 * @param editora String
	 * @param ano int
	 * @param idioma String
	 * @param assunto String
	 * @param descricao String
	 */
	
	
	public Livro(int codigo, String titulo, String autor, String editora, int ano, int edicao, String idioma, String assunto, String descricao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.edicao = edicao;
		this.idioma = idioma;
		this.assunto = assunto;
		this.descricao = descricao;	
	}
	

	/**
	 * Metodo que adiciona a quantidade do livro lido + 1 toda vez que é chamado
	 * 
	 */
	
	public void addQtdVezesLidos() {
		this.qtdVezesLidos += 1;
	}
	
	
	
	/**
	 * Metodo que retorna uma string com as informacoes do livro
	 * 
	 * @return String
	 */
	
	@Override
	public String toString() {
		return "Livro: \n\nCodigo = " + this.codigo + " \nTitulo = " + this.titulo + " \nAutor = " + this.autor + "\nEditora = " + this.editora + "\nAno = "
				+ this.ano + "\nEdicao = " + this.edicao + "\nIdioma = " + this.idioma + "\nAssunto = " + this.assunto + "\nDescricao = " + this.descricao
				+ "\nQuantidade de vezes lidos = " + this.qtdVezesLidos;
	}
	
	
	/**
	 * Metodo que ira comparar um livro passado em parametro com o livro da classe,  retornar de acordo de qual é maior, para ser usado no sort em outro classe
	 * afim de ordenamento
	 * 
	 * @param Livro
	 */
	
	@Override
	public int compareTo(Livro livro) {
		 if (this.qtdVezesLidos > livro.getQtdVezesLidos()) {
	          return -1;
	     }
	     if (this.qtdVezesLidos < livro.getQtdVezesLidos()) {
	          return 1;
	     }
	     
	     return 0;
	}
	
	public int getQtdVezesLidos() {
		return this.qtdVezesLidos;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getAssunto() {
		return this.assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ArrayList<Comentario> getComentario() {
		return this.comentarios;
	}
		
}
