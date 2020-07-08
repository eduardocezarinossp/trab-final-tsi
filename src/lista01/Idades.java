package lista01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Idades {
public static void main(String[] args) {
	
}
public void calcula() {
	int i1 = 0;
	int i2 = 0;
	int i3 = 0;
	int i4 = 0;
	int i5 = 0;
	int[] idades = new int[5];
		i1  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1"));
		i2  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2"));
		i3  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 3"));
		i4  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 4"));
		i5  = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 5"));
		idades[0] = i1;
		idades[1] = i2;
		idades[2] = i3;
		idades[3] = i4;
		idades[4] = i5;
	    Arrays.sort(idades); 

		if(i1  <= 0 || i2  <= 0 || i3  <= 0 || i4  <= 0 || i5  <= 0) {
			JOptionPane.showMessageDialog(null, "Notas inválidas.");	
		}
		int media = (i1+i2+i3+i4+i5) / 5;
		
		JOptionPane.showMessageDialog(null, "Média de idades " + media+" \n "
				+ " Idade mais nova:" + idades[0] +" \n"
				+ " Idade mais velha:" +idades[4]);
		
		
		
			

		
};	
}