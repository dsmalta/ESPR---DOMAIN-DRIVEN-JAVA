package br.com.fiap.rh.model;

public class Professor {

	public static void main(String[] args) {
		
		String nomeProfessor;
		byte idadeProfessor;
		String sexoProfessor;
		String disciplinaProfessor;
		
	}

	public void exibeProfessor(String nome, byte idade, String sexo, String disciplina){
		System.out.printf("Nome: %s%nIdade: %d%nSexo: %s%nDisciplina: %s%n", nome, idade, sexo, disciplina);
		System.out.println();
	}
}
