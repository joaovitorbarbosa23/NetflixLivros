package cadastros;

import java.util.ArrayList;

import leitor.Leitor;

public class CadastroLeitor implements OperacoesCadastrais {
	ArrayList<Leitor> leitores = new ArrayList<Leitor>();

	@Override
	public boolean create(Object obj) {
		leitores.add((Leitor) obj);

		return false;
	}

	@Override
	public boolean delete(int cod) {
		for (int i = 0; i < leitores.size(); i++) {
			if (leitores.get(i).getCodigo() == cod) {
				leitores.remove(i);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean edit(int codLivro, Object obj) {
		int index;

		index = leitores.indexOf(getLeitor(codLivro));
		leitores.set(index, (Leitor) obj);

		return false;
	}

	public Leitor getLeitor(int cod) {
		for (int i = 0; i < leitores.size(); i++) {
			if (leitores.get(i).getCodigo() == cod) {
				return leitores.get(i);
			}
		}

		// aqui consertar com a excecao
		return (Leitor) new Object();
	}
	
	

}
