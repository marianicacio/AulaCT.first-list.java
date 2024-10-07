import java.util.Scanner;

public class Aniversario2 {
    public static void main(String[] args) {
		String nome;
		int dia, mes, ano, resp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é seu nome: ");
		nome = sc.next();
		do {
		System.out.print("Que dia é hoje: ");
		dia = sc.nextInt();
		System.out.print("Que mes é hoje: ");
		mes = sc.nextInt();
		System.out.print("Qual é o ano: ");
		ano = sc.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Não há " + "aniversariantes em JAN :(");
			break;
		case 2 :
			if(dia==8||dia==15||dia==28) {
				if(dia==8) {
					System.out.println("Parabéns Rafael 08/02");
				}else if(dia==15) {
					System.out.println("Parabéns Naun 15/02");
				}else if(dia==15) {
					System.out.println("Parabéns Rebecca 28/02");
				}else {
					System.out.println("Não há " + "aniversariantes nessa data :(");
				}
				break;
			}
		case 3: 
			if(dia==25) {
				System.out.println("Sarah 25/03");
			}else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 4: 
			if(dia==13) {
				System.out.println("Nicoly 13/04");
			}else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 5:
			System.out.println("Não há " + "aniversariantes em MAI :(");
			break;
		case 6: 
			if(dia==16) {
				System.out.println("Thais 16/06");
			} else if(dia==19) {
				System.out.println("Murilo 19/06");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 7:
			if(dia==17) {
				System.out.println("Matheus 17/07");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 8:
			if(dia==19) {
				System.out.println("Murillo 19/08");
			} else if(dia==31) {
				System.out.println("Maria 31/08");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 9:
			if(dia==25) {
				System.out.println("Wallas 25/09");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 10: 
			if(dia==20) {
				System.out.println("Pedro 20/10");
			} else if (dia==30) {
				System.out.println("Yuri 30/10");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 11:
			if(dia==3) {
				System.out.println("Nikolas 03/11");
			} else if (dia==16) {
				System.out.println("Thiago 16/11");
			} else if (dia==24) {
				System.out.println("Valdir 24/11");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		case 12:
			if(dia==6) {
				System.out.println("Masxuel 06/12");
			} else if (dia==10) {
				System.out.println("Maria 10/12");
			} else {
				System.out.println("Não há " + "aniversariantes nessa data :(");
			}
			break;
		default: System.out.println("Mês inválido:(");
			break;
		} 
		
		System.out.println("Digite [1] para continuar ou [0] para sair");
		resp=sc.nextInt();
		}while(resp!=0);
	}
}
