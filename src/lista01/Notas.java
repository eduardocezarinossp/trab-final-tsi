package lista01;

import javax.swing.JOptionPane;

public class Notas {
public static void main(String[] args) {

}
public void calcula() {
	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	int n4 = 0;
	int n5 = 0;

		n1  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1"));
		n2  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2"));
		n3  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 3"));
		n4  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 4"));
		n5  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 5"));
		
		if(n1  <= 0 || n2  <= 0 || n3  <= 0 || n4  <= 0 || n5  <= 0) {
			JOptionPane.showMessageDialog(null, "Notas inválidas.");	
		}
		int media = (n1+n2+n3+n4+n5) / 5;
		
		JOptionPane.showMessageDialog(null, "Média de notas " + media);
			

		
	}
}