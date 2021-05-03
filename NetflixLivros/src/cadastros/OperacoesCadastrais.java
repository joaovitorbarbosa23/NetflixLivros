package cadastros;

/**
 * Interface que cria contratos de para operacoesCadastrais
 * 
 * @author J.Vitor, Adrielly e Sidney
 *
 */

public interface OperacoesCadastrais {

	/**
	 * Pode ser usado para adicionar objetos
	 * 
	 * @param Object Objeto com parametro
	 */

	public boolean create(Object obj);

	/**
	 * Pode ser usado para deletar por um inteiro passado
	 * 
	 * @param int inteiro
	 */

	public boolean delete(int cod);

	/**
	 * Pode ser usado para editar por um inteiro passado
	 * 
	 * @param        int inteiro
	 * @param Object Novo objeto
	 */

	public boolean edit(int index, Object obj);

}
