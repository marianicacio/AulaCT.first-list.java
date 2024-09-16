import javax.swing.JOptionPane;

public class PerimetroCirculo {
    public static void main(String[] args) {
		String raio;
		double fRaio, PC;
		
		raio = JOptionPane.showInputDialog("Digite o Raio:" );
		fRaio = Float.parseFloat(raio);
		PC = 2 * Math.PI * fRaio;
		
		JOptionPane.showMessageDialog(null, " O perimetro do circulo é: " + String.format("%.1f", PC));

	}
}
