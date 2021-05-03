package pacotes;

public class Basic extends Pacotes {

	public Basic(double preco) {
		super(preco);

	}

	@Override
	public boolean verificarQuantidadeDeLivros(int qtd) {
		if (qtd > 3) {
			return false;
		}

		return true;
	}

}
