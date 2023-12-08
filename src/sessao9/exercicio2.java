package sessao9;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner leia = new Scanner(System.in);
		String produto;
		double preco;
		int quantidade;
		int cq = 10, xs = 15, xb = 18, bauru = 12, refri = 8, sl = 13;
		
		
		
		System.out.println("# ## ### #### Menu #### ### ## #");
		System.out.println("\nDigite 1 para Cahorro Quente");
		System.out.println("Digite 2 para X-Salada ");
		System.out.println("Digite 3 para X-Bacon");
		System.out.println("Digite 4 para Bauru");
		System.out.println("Digite 5 para Refrigerante");
		System.out.println("Digite 6 para Suco de Laranja");
		
		opcao = leia.nextInt();
		
		System.out.println("\nDigite a quantidade");
		quantidade = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("\nVocê escolheu Cachorro Quente\nValor Total: " + (cq*quantidade));
			break;
		case 2:
			System.out.println("\nVocê escolheu X-Salada\nValor Total: " + (xs*quantidade));
			break;
		case 3:
			System.out.println("\nVocê escolheu X-Bacon\nValor Total: " + (xb*quantidade));
			break;
		case 4:
			System.out.println("\nVocê escolheu Bauru\nValor Total: " + (bauru*quantidade));
			break;
		case 5:
			System.out.println("\nVocê escolheu Refrigerante\nValor Total: " + (refri*quantidade));
			break;
		case 6:
			System.out.println("\nVocê escolheu Suco de Laranja\nValor Total: " + (sl*quantidade));
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
			
		}
		
		
	}

}
