import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartaExD {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] mA = new double[15];
		double[] mB = new double[15];
		
		for(int i = 0; i < 15;) {
			try {
				System.out.println("Digite um valor: ");
				mA[i] = sc.nextDouble();
				mB[i] = sc.nextDouble();
				
				i++; 
			}catch(InputMismatchException e) {
				System.out.println("Valor Invalido!!");
				sc.next();			}
		}
		
		sc.close();
		
		for(int i = -1; i< 15; i++) {
			if(i == -1) {
				System.out.println("Matriz B: ");
			} else {
				System.out.println(i + ": " + mB[i]);
			}
		}
	}
}
