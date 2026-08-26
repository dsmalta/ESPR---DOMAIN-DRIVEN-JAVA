package fundamentals;

public class Teste {

	public static void main(String[] args) {
		
		Aluno davi = new Aluno();
		davi.nome = "Davi";
		davi.idade = 20;
		davi.altura = 1.78;
		davi.peso = 75;
		davi.sexo = "Masculino";
		davi.chorar();
		davi.estudar();
		davi.reclamar();
		davi.imprimir();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Jefferson";
		aluno1.idade = 50;
		aluno1.altura = 1.65;
		aluno1.peso = 90;
		aluno1.sexo = "Masculino";
		aluno1.chorar();
		aluno1.estudar();
		aluno1.reclamar();
		aluno1.imprimir();
	}

}
