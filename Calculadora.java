
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, r;
		int opc, resp;
		do {
			System.out.println("***Calculadora do técnico 1DT***");
			//Criação do menu
			System.out.printf("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Resto de divisão\nEscolha a sua opção: ");
			opc = sc.nextInt();
			switch(opc) {
		
				case 1: System.out.print("Qual o número? ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 + n2;
					System.out.printf("A soma é: %.2f", r);
					break;
				case 2: System.out.print("Qual o número? ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 - n2;
					System.out.printf("A subtração é: %.2f", r);
					break;
				case 3: System.out.print("Qual o número? ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 * n2;
					System.out.printf("A multiplicação é: %.2f", r);
					break;
				case 4: System.out.print("Qual o número? ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 / n2;
					System.out.printf("A divisão é: %.2f", r);
					break;
				case 5: System.out.print("Qual o número? ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 % n2;
					System.out.printf("O resto é: %.2f", r);
					break;
				
				}
				System.out.println("Digite 0 para sair ");
				resp = sc.nextInt();
				Runtime.getRuntime();
			}while(resp != 0);
	
	}
}

