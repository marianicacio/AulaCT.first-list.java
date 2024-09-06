import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
		//Entrada
		double vm, t, resDis, resL;
		int km;
		km = 12;
		Scanner sc = new Scanner(System.in);
		
		//Processamento
		System.out.print("Digite a velocidade media do carro em metros: ");
		vm = sc.nextDouble();
		System.out.print("Digite o tempo gasto na viagem em segundos: ");
		t = sc.nextDouble();
		 
		resDis = t * vm;
		resL = resDis / km;
		
		//Saída
		System.out.println("A velocidade media do carro foi: " +vm);
		System.out.println("O tempo gasto na viagem foi: " +t);
		System.out.println("A distância percorrida em m/s foi: " +resDis);
		System.out.println("Os litros usados são: " +resL);
	}
}
