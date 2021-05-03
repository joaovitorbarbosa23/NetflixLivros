package teste;


import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

import cadastros.CadastroLivros;
import livro.Livro;

public class TesteCadastroLivros {
	CadastroLivros cl=new CadastroLivros();
	ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();
	Livro livro= new Livro(123, null, null, null, 0, 0, null, null, null);
	

	@Test
	public void Delete() {
		livrosCadastrados.add(livro);
		livrosCadastrados.remove(livro);
		assertNotEquals(true, cl.delete(123));
	}
    
	public void Edit() {
		livrosCadastrados.add(livro);
		livrosCadastrados.set(124, livro);
		assertNotEquals(true,cl.delete(124));
		
	
	}

}
