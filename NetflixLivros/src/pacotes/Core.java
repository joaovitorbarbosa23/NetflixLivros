package pacotes;


public class Core extends Pacotes {

	public Core(double preco) {
		super(preco);
	}
	
	@Override 
	public boolean verificarQuantidadeDeLivros(int qtd) {
		if(qtd > 5) {
			return false;
		}
		
		return true;
	}

}
