package DespesasAcumulativas;

import java.util.Scanner;

public class DespeAcumu {

	/*
	 * O usuraio irá digitar as despesas conforme a demanda e quando a despesa for
	 * igual a 0 (despesa == 0) parar de rodar o código fazer a soma das despesas e
	 * imprimir para a visualização
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = 1;
		int despesa = 0;
		int qtd = 5; //quantidade de vezes que digitou

		for (x = 1; x < 10; x++) {
			System.out.println("Digite sua despesa" + x++ + ":");
			despesa = teclado.nextInt();
		}

		// soma
		despesa += x++;

		// saida
		System.out.println("Sua despesa no total foi " + despesa + ":");

		
		teclado.close();
	}

}
