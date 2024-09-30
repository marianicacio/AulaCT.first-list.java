public class Exercise {

	public static void main(String[] args) {
		int volta, abdominal, abd;
		abd = 0;
		for(volta = 0; volta < 3; volta++) {
			for(abdominal=1; abdominal<=5; abdominal++) {
				System.out.print(abdominal + " ");
				abd++;
			} System.out.print("\n");
			
		}
		System.out.print("Total de voltas: " + volta + "\nTotal de abdominais: " + abd);

	}

}
