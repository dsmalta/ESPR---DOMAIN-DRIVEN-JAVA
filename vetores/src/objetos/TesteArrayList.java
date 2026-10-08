package objetos;

import java.util.List;
import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Mochila", 100));
		produtos.add(new Produto("Mouse", 50));
		produtos.add(new Produto("Webcam", 200));
		produtos.add(new Produto("PenDrive", 10));
		produtos.add(new Produto("Caneta", 5	));
		
		for(Produto produto : produtos) {
			produto.imprimir();
		}
		
		produtos.remove(1);
		
		System.out.println("Apos a exclusao: ");
		
		for(Produto produto : produtos) {
			produto.imprimir();
		}
		System.out.println("Tamanho do array: " + produtos.size());
		
		System.out.println("O nome do produto do indice 1 " + produtos.get(1).getNome());
		
		System.out.println("Array utilizando o for normal");
		for(int i = 0; i < produtos.size(); i++) {
			produtos.get(i).imprimir();
		}
		
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(1);
		inteiros.add(3);
		
		for (Integer inteiro : inteiros) {
			System.out.println(inteiro);
		}
		
	}

}
