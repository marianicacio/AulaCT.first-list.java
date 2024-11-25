import java.util.Scanner;

public class QuartaExA {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[12];
		
		for(int i = 0; i< 10; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = sc.nextLine();
		}
		
		sc.close();
		
		for(int i = 0; i< 10; i++) {
			System.out.println(nomes[i]);
		} 
    }
}
