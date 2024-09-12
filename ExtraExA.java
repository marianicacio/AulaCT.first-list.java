import java.util.Scanner;

public class ExtraExA {
    public static void main(String[] args) {
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor para B: ");
		b = sc.nextDouble();
		
		System.out.println("Depois da troca esse é o valor de A: " + b);
		System.out.println("Depois da troca esse é o valor de B: " + a);

	}
}
