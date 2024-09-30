public class Fatorial {

	public static void main(String[] args) {
		double i, fat, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o fatorial: ");
		num = sc.nextInt();
		fat = 1;
		
		for(i=1; i<=num; i++) {
			fat *= i;
		}
		System.out.println("Fatorial é: " + fat);
		
		//invertido o looping
		System.out.println("Qual o fatorial: ");
		num = sc.nextInt();
		fat = 1;
		
		
		for(i=num; i>=1; i--) {
			fat *= i;
		}
		System.out.println("Fatorial é: " + fat);
	}

}
