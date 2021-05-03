package pacotes;

public class Premium extends Pacotes{

	public Premium(double preco) {
		super(preco);
		
	}

	
	@Override
	public boolean verificarQuantidadeDeLivros(int qtd) {
		if(qtd > 10) {
			return false;
		}
		
		return true;
	}
}
