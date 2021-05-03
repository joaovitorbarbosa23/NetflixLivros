package livro;

import java.io.Serializable;


/**
 * Classe que cria um comentario, implementa Serializable
 * 
 * @see Serializable
 * @author @author J.Vitor, Adrielly e Sidney
 *
 */

public class Comentario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int codLeitor;
	private String comentario;
	

	/**
	 * Metodo construtor que recebe as variaveis para passar na classe
	 * 
	 * @param int  Codigo
	 * @param String Comentario
	 *
	 */

	public Comentario(int codLeitor, String comentario) {
		this.codLeitor = codLeitor;
		this.comentario = comentario;
	}
	
	public int getCodLeitor() {
		return codLeitor;
	}
	
	public void setCodLeitor(int codLeitor) {
		this.codLeitor = codLeitor;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
