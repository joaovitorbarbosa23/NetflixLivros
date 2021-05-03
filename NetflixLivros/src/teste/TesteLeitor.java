package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import leitor.Leitor;
import pacotes.Pacotes;

public class TesteLeitor {
	Leitor leitor = new Leitor(null, 0, null, null);

	@Test
	public void TesteNome() {
		leitor.setNome("Sidney Gomes");
		assertEquals("Sidney Gomes", leitor.getNome());
		assertNotEquals("Adrielly", leitor.getNome());
	}

	@Test
	public void TesteCodigo() {
		leitor.setCodigo(123);
		assertEquals(123, leitor.getCodigo());
		assertNotEquals(453, leitor.getCodigo());
	}

	@Test
	public void TesteDataNascimento() {
		leitor.setDataNascimento("22/03/1999");
		assertEquals("22/03/1999", leitor.getDataNascimento());
		assertNotEquals("25/04/2000", leitor.getDataNascimento());
	}

	@Test
	public void TesteEmail() {
		leitor.setEmail("jvbr_22@hotmail.com");
		assertEquals("jvbr_22@hotmail.com", leitor.getEmail());
		assertNotEquals("jvbr_25@hotmail.com", leitor.getEmail());
	}

	@Test
	public void TestePacote() {
		Pacotes pacote = null;
		leitor.setPacote(pacote);
		assertEquals(pacote, leitor.getPacote());
	}
}
