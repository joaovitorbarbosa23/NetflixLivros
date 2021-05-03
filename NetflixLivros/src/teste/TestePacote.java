package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import pacotes.Basic;
import pacotes.Core;
import pacotes.Premium;

public class TestePacote {
	Basic basico = new Basic(50.00);
	Core core = new Core(100.00);
	Premium premium=new Premium(500.00);

	@Test
	public void VerificaLidosBasic() {
		assertEquals(false, basico.verificarQuantidadeDeLivros(5));
		assertEquals(true, basico.verificarQuantidadeDeLivros(2));
	}

	public void VerificaLidosCore() {
		assertEquals(false, core.verificarQuantidadeDeLivros(6));
		assertEquals(true, core.verificarQuantidadeDeLivros(2));
	}
	
	public void VerificaLidosPremium() {
		assertEquals(false, premium.verificarQuantidadeDeLivros(6));
		assertEquals(true, premium.verificarQuantidadeDeLivros(4));
	}
	
}
