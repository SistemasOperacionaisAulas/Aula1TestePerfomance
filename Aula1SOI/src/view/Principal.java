package view;
import controller.OperacoesController;

/*A aplica��o mede o tempo de execu��o utilizando Buffer X String.
 * O teste mostra eficacia da utiliza��o dos Buffers de mem�ria em um exemplo simples de concatena��o,
 * sendo String uma variavel imutavel.
 */


public class Principal {

	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
		op.concatenaString();
		op.concatenaBuffer();

	}

}
