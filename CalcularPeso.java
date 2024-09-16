import javax.swing.JOptionPane;

public class CalcularPeso {
    public static void main(String[] args) {
		String altura, peso;
		double fAltura, fPeso, imc;
		
		altura = JOptionPane.showInputDialog("Digite sua altura: ");
		fAltura = Double.parseDouble(altura);
		peso = JOptionPane.showInputDialog("Digite seu peso: ");
		fPeso = Double.parseDouble(peso);
		
		imc = fPeso / Math.pow(fAltura, 2);
		
		JOptionPane.showMessageDialog(null, imc);
		
		if (imc <= 18.5) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " Magreza");
		} else if (imc > 18.5 && imc < 25) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " saudável");
		} else if (imc > 25 && imc < 30) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " pré-obesidade");
		} else if (imc > 30 && imc < 35) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " obesidade de grau 1");
		} else if (imc > 35 && imc < 40) {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " obesidade de grau 2");
		} else {
			JOptionPane.showMessageDialog(null, String.format("%.2f", imc) + " obesidade de grau 3");
		}
    }

}
