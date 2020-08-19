package controller;

public class OperacoesController {
	public OperacoesController() {
		// metodo construtor
		super();
	}
	// Concatena 32768 caracteres, 1 a 1, em uma var String
	public void concatenaString() {
		String cadeia ="";
		double tempoInicial = System.nanoTime();
		for (int i=0 ; i<32768; i++) {
			cadeia = cadeia + "l";
		}
		double tempoFinal=System.nanoTime();
		double tempoTotal= tempoFinal - tempoInicial;
		
		// converte de Nano segundos para segundos
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("String===> " + tempoTotal + "s.");
	}
	
	//Concatena 32768 caracteres, 1 a 1, em um buffer de Strings
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i=0 ; i<32768; i++) {
			buffer.append("l");
		}
		double tempoFinal=System.nanoTime();
		double tempoTotal= tempoFinal - tempoInicial;
		
		// converte de Nano segundos para segundos
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer===> " + tempoTotal + "s.");
	}
	
}
