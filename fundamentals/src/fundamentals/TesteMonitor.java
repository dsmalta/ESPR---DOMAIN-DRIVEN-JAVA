package fundamentals;

public class TesteMonitor {

	public static void main(String[] args) {
		
		Monitor monitor1 = new Monitor();
		monitor1.marca = "Samsung";
		monitor1.entrada = "HDMI e DisplayPort";
		monitor1.cor = "Preto";
		monitor1.frequencia = 240;
		monitor1.tela = 19;
		monitor1.ligar();
		monitor1.exibir();
		
		Monitor monitor2 = new Monitor();
		monitor2.marca = "Husky";
		monitor2.entrada = "HDMI";
		monitor2.cor = "Btanco";
		monitor2.frequencia = 180;
		monitor2.tela = 17.5;
		monitor2.ligar();
		monitor2.exibir();
	}

}
