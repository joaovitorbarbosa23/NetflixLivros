package teste;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import livro.Comentario;

class TesteComentario {
	Comentario coment = new Comentario(123, "ótimo");

	@Test
	void TestCodleitor() {
		//verifica se esse é o resultado esperado
		assertEquals(123,coment.getCodLeitor());
		//verifica se esse não é o resultado esperado
		assertNotEquals(124,coment.getCodLeitor());
	}
	
	@Test
	void TestComentario() {
		//verifica se esse é o resultado esperado
		assertEquals("ótimo",coment.getComentario());
		//verifica se esse não é o resultado esperado
		assertNotEquals("ruim",coment.getComentario());
		
	}

}
