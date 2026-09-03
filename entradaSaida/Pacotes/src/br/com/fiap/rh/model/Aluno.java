package br.com.fiap.rh.model;

public class Aluno {

	public static void main(String[] args) {
		
		String nomeAluno;
		byte idadeAluno;
		float alturaAluno; 
		float pesoAluno;
		String sexoAluno;
	}

	public void exibeAluno(String nome, byte idade, float altura, float peso, String sexo){
		System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f%nPeso: %.2f%n Sexo: %s%n", nome, idade, altura, peso, sexo);
		System.out.println();
	}
}
