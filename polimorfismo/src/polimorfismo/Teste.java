package polimorfismo;

import java.util.List;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		//animal.emitirSom();
		
		Animal gato = new Gato();
		//gato.emitirSom();
		
		Gato gato1 = new Gato();
		//gato1.emitirSom();
		
		Animal cachorro = new Cachorro();
		//cachorro.emitirSom();
		
		Cachorro cachorro1 = new Cachorro();
		//cachorro1.emitirSom();
		
		List<Animal> animais = new ArrayList<Animal>();
		animais.add(animal);
		animais.add(gato);
		animais.add(gato1);
		animais.add(cachorro);
		animais.add(cachorro1);
		
		for (Animal animal2 : animais) {
			animal2.emitirSom();
		}
		
		System.out.println("Poliformismo parametrico");
		
		Caixa<String> caixa = new Caixa();
		caixa.guardar("Teste String");
		System.out.println(caixa.abrir());
		
		Caixa<Integer> caixaInt = new Caixa<Integer>();
		caixaInt.guardar(12344);
		System.out.println(caixaInt.abrir());
		
		Caixa<Animal> caixa2 = new Caixa<Animal>();
		caixa2.guardar(gato);
		caixa2.abrir().emitirSom();
	}

}
