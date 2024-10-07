import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		int i = 0;
		int quadrado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadrado: ");
		quadrado = sc.nextInt();
		while(i<2) {
			quadrado*=quadrado;
			i++;
			System.out.println(quadrado);
		}
	}
}
