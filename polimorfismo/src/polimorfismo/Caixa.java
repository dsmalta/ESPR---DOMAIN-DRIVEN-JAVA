package polimorfismo;

public class Caixa<T> {

	private T conteudo;
	
	public void guardar(T t) {
		this.conteudo = t;
	}
	
	public T abrir() {
		return this.conteudo;
	}
}
