package fundamentals;

public class Aluno {

	String nome;
	byte idade;
	float altura; 
	float peso;
	String sexo;
	
	void estudar() {
		System.out.println(nome + " esta estudando...");
	}
	
	void chorar() {
		System.out.println(nome + " BUA BUA BUA");
	}
	
	void reclamar() {
		System.out.println("O aluno " + nome + " Sou obrigado a falar, essa aula ta uma caramba");
	}
	
	void imprimir() {
		System.out.println("O aluno do nome " + nome + " do sexo " + sexo + " tem a altura " + altura + " e peso " + peso);
	}
}