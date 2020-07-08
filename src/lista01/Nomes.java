package lista01;

import javax.swing.JOptionPane;

public class Nomes {
	
	public void calcula() {
		String n1  = JOptionPane.showInputDialog("Digite o nome 1");
		String n2  = JOptionPane.showInputDialog("Digite o nome 2");
		String n3  = JOptionPane.showInputDialog("Digite o nome 3");
		String n4  = JOptionPane.showInputDialog("Digite o nome 4");
		String n5  = JOptionPane.showInputDialog("Digite o nome 5");
		String[] nomes = new String[5];
		nomes[0] = n1;
		nomes[1] = n2;
		nomes[2] = n3;
		nomes[3] = n4;
		nomes[4] = n5;
		
		
		String carac  = JOptionPane.showInputDialog("Digite a letra");
		char c  = carac.charAt(0);
		String resposta = "Nomes que começam com "+c+": \n";
		
		for(String n : nomes) {
			if(n.charAt(0) == c) {
				resposta += n+" \n";
			}
		}
		JOptionPane.showMessageDialog(null, resposta);
		
	}
		
		
}
