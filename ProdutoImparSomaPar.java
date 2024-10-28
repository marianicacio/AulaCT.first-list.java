

import java.util.Scanner;

public class ProdutoImparSomaPar {

	public static void main(String[] args) {
		int num, cont, produto, soma, contImpar, contPar;
		num=0;
		produto=1;
		soma=0;
		contImpar=0;
		contPar=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Caso queira parar, digite [0]");
		do {
			System.out.println("\nDigite um número: ");
			num=input.nextInt();
			if (num>0) {
				if(num%2==1) {
					produto*=num;
					contImpar++;
				} else {
					soma+=num;
					contPar++;
				}
			}
		}while(num!=0);
		System.out.println("Total de ímpares: " + contImpar + " - Total do Produto" + ": " + produto );
		System.out.println("Total de pares: " + contPar + " - Total da Soma: " + soma );
		

	}

}

