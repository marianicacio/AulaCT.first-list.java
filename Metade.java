import java.util.Scanner;

public class Metade {
    public static void main(String[] args) {
		double i, num, rNum;
		Scanner sc = new Scanner(System.in);
		i=0;
	do {
		System.out.println("Digite um número: ");
		num=sc.nextDouble();
		rNum = num/2;
		System.out.println(rNum);
		i++;
	} while (i<10);
	}
}
