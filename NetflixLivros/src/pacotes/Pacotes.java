package pacotes;



public abstract class Pacotes {
	private double preco;
	
	
	public Pacotes(double preco) {
		this.preco = preco;
	}
	
	
	public abstract boolean verificarQuantidadeDeLivros(int qtd);


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}



	
	
}
