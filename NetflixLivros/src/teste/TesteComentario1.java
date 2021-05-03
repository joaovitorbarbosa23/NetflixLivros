package teste;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import livro.Comentario;

class TesteComentario {
	Comentario coment = new Comentario(123, "�timo");

	@Test
	void TestCodleitor() {
		//verifica se esse � o resultado esperado
		assertEquals(123,coment.getCodLeitor());
		//verifica se esse n�o � o resultado esperado
		assertNotEquals(124,coment.getCodLeitor());
	}
	
	@Test
	void TestComentario() {
		//verifica se esse � o resultado esperado
		assertEquals("�timo",coment.getComentario());
		//verifica se esse n�o � o resultado esperado
		assertNotEquals("ruim",coment.getComentario());
		
	}

}
