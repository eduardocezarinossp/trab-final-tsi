package lista01;

import javax.swing.JOptionPane;

public class Tabuada {
public static void main(String[] args) {

}
public void calcula() {
	int x = 1;
	int y = 0;
	int result = 0;
	String mostrar1 = "";
	int tipo = 0;
		x  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
		String[] buttons = { "While", "For"};
		int returnValue = JOptionPane.showOptionDialog(null, "Tipo de repeticao", "Tipo de repeticao", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
		System.out.println(returnValue);
			if(tipo == 2) {
				while (y < 10) {
					y = y + 1;
					result = x * y;
					mostrar1 = mostrar1 + "\n" + x + " x " + y + " = " + result;
				}
			}else {
				for (y = 0; y <= 10; y++) {
					
					result = x * y;
					mostrar1 = mostrar1 + "\n" + x + " x " + y + " = " + result;
				}
			}
			JOptionPane.showMessageDialog(null, "Tabuada do " + x + mostrar1);
			mostrar1 = "";
			y = 0;
			x = x + 1;

		
	}
}