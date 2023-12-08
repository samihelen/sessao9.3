package sessao9;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codOperacao;
		Scanner leia = new Scanner(System.in);
		String operacao;
		float saldo = 1000;
		double valor;  
		double n1 = 50, n2 = 100, n3 = 150;
		
		System.out.println("******** Menu Opções *******");
		System.out.println("\nDigite 1 para ver SALDO");
		System.out.println("Digite 2 para SAQUE ");
		System.out.println("Digite 3 para DEPÓSITO");
		
		codOperacao = leia.nextInt();
		
		System.out.println("Digite o valor desejo\nR$50,00\nR$100,00\nR$150,00");
		
		valor = leia.nextDouble();
		
		switch (codOperacao) {
		case 1:
			System.out.println("\nSaldo em conta: " + saldo);
			break;
		case 2:
			System.out.println("\nSaque autorizado " + (1000) + "\nNovo Saldo: R$" + (saldo - valor));
			break;
		case 3:
			System.out.println("\nNovo Saldo: " + (valor + saldo));
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
	}
	}
}
//Duvida 1: Como faço para não printar em tela "Digite o valor, quando é a opcao 1 ou 4?"