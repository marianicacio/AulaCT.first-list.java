
import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		// Entrada
		int n;
		
		// Processamento
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		if (n<=0) {
			n *= -1;
		}
		
		//Saída
		System.out.println(n);
	}

}
