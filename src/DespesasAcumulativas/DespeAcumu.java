package DespesasAcumulativas;

import java.util.Scanner;

public class DespeAcumu {

	/*
	 * O usuario digitará a quantidade de contas que deseja somar
	 * Digitara o valor de cada conta
	 * O sitema somara, e exibira o valor total
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int qtdContas; // quantidade vezes que gerará sysout para entrada de dados
		int i = 0;
		double despesaSomando = 0, despesaTotal = 0;
		
		// entrada de dados
		System.out.println("Digite a quantidade de contas a pagar: ");
		qtdContas = scanner.nextInt();

		for (i = 0; i < qtdContas; i++) {
			System.out.println("\nDespesa Número " + i);
			System.out.println("Digite sua o valor da sua despesa:");
			despesaSomando = scanner.nextDouble();
			
			despesaTotal += despesaSomando;
		}

		// saida de dados
		System.out.println("------------------------------------------");
		System.out.println("\n    Sua despesa no total foi " + despesaTotal + ":");
		System.out.println("\n------------------------------------------");
		
		scanner.close();
	}

}
