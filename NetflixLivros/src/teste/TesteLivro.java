package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import livro.Livro;

public class TesteLivro {

	Livro livro = new Livro(0, null, null, null, 0, 0, null, null, null);
	@Test
	public void TestCodigo() {
		livro.setCodigo(123);
		assertEquals(123,livro.getCodigo());
		
	}

	@Test
	public void TestTitulo() {
		livro.setTitulo("A volta dos que nao foram");
		assertEquals("A volta dos que nao foram",livro.getTitulo());
	}
	@Test
	public void TestAutor() {
		livro.setAutor("Adrielly");
		assertEquals("Adrielly",livro.getAutor());
	}
	@Test
	public void TestEditora() {
		livro.setEditora("UEPB");
		assertEquals("UEPB",livro.getEditora());
	}
	@Test
	public void TestAno() {
		livro.setAno(2018);
		assertEquals(2018,livro.getAno());
	}
	@Test
	public void TestIdioma() {
		livro.setIdioma("Portugues");
		assertEquals("Portugues",livro.getIdioma());
	}
	@Test
	public void TestAssunto() {
		livro.setAssunto("nada");
		assertEquals("nada",livro.getAssunto());
	}
	@Test
	public void TestDescrição() {
		livro.setDescricao("Terror");
		assertEquals("Terror",livro.getDescricao());
	}
	
}
