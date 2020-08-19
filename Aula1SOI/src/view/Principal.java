package view;
import controller.OperacoesController;

/*A aplicação mede o tempo de execução utilizando Buffer X String.
 * O teste mostra eficacia da utilização dos Buffers de memória em um exemplo simples de concatenação,
 * sendo String uma variavel imutavel.
 */


public class Principal {

	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
		op.concatenaString();
		op.concatenaBuffer();

	}

}
