public class CPF {

	public static void main(String[] args) {
		double i, cpf, dig, r, acumulador, e;
		cpf=253717258;
		acumulador=0;
		i=10.0;
		int cont, d;
		e=8;
		
		for(cont=10; cont>=2; cont--) {
		dig=cpf/Math.pow(i, e);
		d=(int)(dig);
		r=cpf%Math.pow(i, e);
		e--;
		acumulador+=(cont*d);
		dig=cpf-d*(Math.pow(d, e--));
		System.out.println("Quoeficiente: " + d);
		System.out.println("Resto: " + r);
		System.out.println("Acumulador: " + acumulador);
	}

}
}
