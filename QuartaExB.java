import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartaExB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mA = new int[8];
        int[] mB = new int[8];

        for (int i = 0; i < 8;) {
            try {
                System.out.println("Digite um valor: ");
                mA[i] = sc.nextInt();
                mB[i] = mA[i] * 3;

                i++;
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor inteiro!");
                sc.next();
            }
        }

        sc.close();

        for (int i = 0; i < 8; i++) {
            System.out.println(i + ": " + mB[i]);
        }
    }
}
