import java.util.Scanner;

public class TituloEleitor {

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		
		int[] digitos = new int[12];
		int i, soma, peso;
		long titulo;
		
		System.out.print("Digite o número do seu título eleitoral:  ");
		titulo = sc.nextLong();
		
		sc.close();
 
		for(i=11; i>=0; i--) {
			digitos[i]=(int)(titulo % 10);
			titulo /= 10;
		}
		
		for(i=0; i<=11; i++) {
			System.out.print(digitos[i] + " ");
		}
		
		soma=0;
		peso=2;
		for(i=0; i<8; i++) {
			soma+=digitos[i]*peso;
			peso++;
		}
		
		int digito1 = soma%11;
		if(digito1 >= 10) {
			digito1 = 0;
		}
		
		soma=0;
		peso=7;
		for(i=8; i<11; i++) {
			soma+=digitos[i]*peso;
			peso++;
		}
		
		int digito2 = soma % 11;
		if(digito2 >= 10) {
			digito2 = 0;
		}
		
		if(digito1==digitos[10] && digito2==digitos[11]) {
			System.out.println("\n\nTítulo Válido");
		}
		else {
			System.out.println("\n\nTítulo Inválido");
		}
    }
}