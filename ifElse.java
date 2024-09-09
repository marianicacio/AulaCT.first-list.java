
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// Entrada
		int a, b, r;
		a = 2;
		b = 3;
		
		//Processamento
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite outro número: ");
		b = sc.nextInt();
		
		if (a >= b) {
			r = a - b;
		} else {
			r = b - a;
		}
		
		//Saída
		System.out.println("O resultado é: " + r);
	}

}
