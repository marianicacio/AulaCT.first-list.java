import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int i, tabuada, res;
		res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite qual tabuada vc deseja: ");
		tabuada = sc.nextInt();
		
		//iniciando a estrutura de repetição:
		for(i=1; i<=10; i++) {
			res = tabuada * i;
			System.out.println(tabuada + " X " + i + " = " + res);
		}
		System.out.printf("%d|n", res);
	}

}
