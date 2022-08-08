package mes;

import java.util.Scanner;

public class Despesas {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// variaveis de despesas mensais
		double salarioMes, internet, luz, agua, faculdade, mercado, restou;

		restou = 3.000;

		// ira digitar o valor do salario e das despesas
		System.out.print("Digite o valor do seu salario neste Mês: ");
		salarioMes = teclado.nextDouble();

		System.out.print("Digite o valor da internet: ");
		internet = teclado.nextDouble();

		System.out.print("Digite o valor da conta de luz: ");
		luz = teclado.nextDouble();

		System.out.print("Digite o valor da conta de água: ");
		agua = teclado.nextDouble();

		System.out.print("Digite o valor da faculdade: ");
		faculdade = teclado.nextDouble();

		System.out.print("Digite o valor da mercado: ");
		mercado = teclado.nextDouble();

		// calculando as despesas
		restou = salarioMes + (internet + luz + agua + faculdade + mercado);

		System.out.format("sobrou para gastar: %.2f", restou - salarioMes);

		teclado.close();

	}

}
