import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
		int i, num;
		double rNum;
		Scanner sc = new Scanner(System.in);
		i=0;
	do {
		System.out.println("Digite uma raiz quadrada: ");
		num=sc.nextInt();
		rNum = Math.sqrt(num);
		System.out.println(rNum);
		i++;
	} while (i<15);
	}
}
