package fundamentals;

public class Teclado {

	String teclas;
	String cor;
	String norma;
	
	void teclar() {
		System.out.println("O teclado esta teclando...");
	}
	
	void exibirInformacoesTeclado() {
		System.out.println("O teclado tem a cor " + cor + " com a norma " + norma + " no padrao " + teclas );
	}
}
