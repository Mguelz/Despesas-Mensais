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
		double despesaTotal = 0;
		int qtdContas; // quantidade vezes que gerará sysout para entrada de dados

		// entrada de dados
		System.out.println("Digite a quantidade de contas a pagar: ");
		qtdContas = teclado.nextInt();

		for (x = 0; x < qtdContas; x++) {
			System.out.println("Digite sua despesa:");
			despesaTotal = teclado.nextDouble();
		}

		// processamento de dados
		despesaTotal = despesaTotal * qtdContas;

		// saida de dados
		System.out.println("Sua despesa no total foi " + despesaTotal + ":");

		teclado.close();
	}

}
