package objetos;

public class Teste {

	public static void main(String[] args) {
		
		Produto[] produtos = new Produto[3];
		produtos[0] = new Produto("Iphone", 10000);
		produtos[1] = new Produto("Phone", 500);
		produtos[2] = new Produto("Teclado", 100);
		
		System.out.println("###### IMPRESSAO POSICIONAL ######");
		for(int i = 0; i < produtos.length; i++) {
			
			produtos[i].imprimir();
		}
		
		System.out.println("###### IMPRESSAO DINAMICA ######");
		for(Produto produto : produtos) {
			produto.imprimir();
		}
		
		
		
	}

}
