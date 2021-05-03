package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cadastros.CadastroLeitor;
import leitor.Leitor;

public class TesteCadastroLeitor {
	ArrayList<Leitor> leitores = new ArrayList<Leitor>();
	CadastroLeitor cl = new CadastroLeitor();
	Leitor leitor = new Leitor(null, 125, null, null);

	@Test
	public void Delete() {
		leitores.add(leitor);
		leitores.remove(leitor);
		assertNotEquals(true, cl.delete(125));
	}
    public void Edit() {
    	leitores.add(leitor);
        leitores.set(123, leitor);
        assertNotEquals(true, cl.edit(125, leitor));
    	}
    

}
