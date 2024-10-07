public class Multiplo {
    public static void main(String[] args) {
		int cont;
		cont=0;
		
		while(cont<100) {
			if((cont%5 == 0) && (cont%10 == 0)) {
				System.out.println(cont);
			}
			cont++;
		}

}
}
