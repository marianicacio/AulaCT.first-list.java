import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartaExF {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mA = new int[15];
		int[] mB = new int[15];
		int[] mC = new int[30];
		
		for(int i = 0; i < 15;) {
			try {
				System.out.println("Matriz A - Digite um valor: ");
				mA[i] = sc.nextInt();
				mC[i] = mA[i];
				
				i++;
			} catch (InputMismatchException e){
				System.out.println("Valor invalido!!");
				sc.next();
			}
		}
		
		for(int i = 0; i < 15;) {
			try {
				System.out.println("Matriz A - Digite um valor: ");
				mB[i] = sc.nextInt();
				mC[i + 15] = mB[i];
				
				i++;
			} catch (InputMismatchException e){
				System.out.println("Valor invalido!!");
				sc.next();
			}
		}
		
		for(int i = -1; i < 30; i++) {
			if(i == -1) {
				System.out.println("Matriz C: ");
			} else {
				System.out.println(i + ": " + mC[i]);
			}
			
			sc.close();
		}

	}

}
