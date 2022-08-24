package mes;

import java.util.Scanner;

public class Despesas {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// variaveis de despesas mensais
		double salarioMes, internet, luz, agua, faculdade, mercado, restou;

		// entrada de dados
		System.out.println("---------------------------------------------");
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
		double qtdGasto = (internet + luz + agua + faculdade + mercado);
		double restante = restou - salarioMes;

		// saida de dados
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Valor total do mês " + salarioMes);
		System.out.println("");
		System.out.format("Você gastou no total: %.2f", qtdGasto ); //restou - salarioMes
		System.out.println("");
		System.out.println("");
		System.out.println("Sobrou no total: " + (salarioMes - (restou - salarioMes)));
		
		if (restante > salarioMes) {
			System.out.println("Vish, você fico negativo neste mês: ");
			System.out.println("");
			System.out.println("Você esta devendo: "+ "-" + restante);
		} else if (restante == salarioMes) {
			System.out.println("Ufa, quase que você fica devendo");
			System.out.println("");
			System.out.println("Dinheiro restante: " + restante);
		}
		System.out.println("---------------------------------------------");
		teclado.close();

	}

}
