package desafioCurso;

import java.util.Scanner;

public class Aula200220820 {
	/*
	 * qual a renda do mes qunantas despesas valor de cada despesa mostrar total de
	 * despesas mostrar se esta ok o mes ou nao
	 */
	public static void main(String[] args) {

		double rendaMes;
		double tudoEmDinheiro;
		double tudoEmCartao;
		double totalDespesas;

		Scanner teclado = new Scanner(System.in);

		// entrada de dados
		System.out.println("qual a sua renda neste mes: ");
		rendaMes = teclado.nextDouble();

		System.out.println("quantidade gasto em dinheiro: ");
		tudoEmDinheiro = teclado.nextDouble();
		System.out.println("");
		System.out.println("quantidade gasto em cartao: ");
		tudoEmCartao = teclado.nextDouble();
		System.out.println("");

		// processamento de dados
		totalDespesas = tudoEmDinheiro + tudoEmCartao;

		System.out.println("Total de despesas");
		System.out.println(totalDespesas);
		System.out.println("");

		// saida de dados
		double restante = rendaMes - totalDespesas;
		if (totalDespesas > rendaMes) {
			System.out.println("Pegar dinheiro com agiota");
			System.out.println("Voce ficou com " + restante);
		} else if (restante == 0) {
			System.out.println("Foi por pouco");
			System.out.println("Não restou nenhum dinheiro");
		} else {
			System.out.println("Deu bom");
			System.out.println("Restou em sua conta " + restante);
		}

		teclado.close();
	}
}
