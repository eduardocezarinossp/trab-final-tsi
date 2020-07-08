package lista01;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		Idades idades = new Idades();
		Notas notas = new Notas();
		Tabuada tabuada = new Tabuada();
		Primos primos = new Primos();
		Nomes nomes = new Nomes();
		
		
		String[] buttons = { "Tabuada", "Notas", "Idade", "Numeros Primos", "Nomes"};
		int returnValue = JOptionPane.showOptionDialog(null, "Qual exercicío?", "Qual exercicío?", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
		System.out.println(returnValue);
		if(returnValue == 0) {
			tabuada.calcula();
		}
		else if(returnValue == 1) {
			notas.calcula();
		}
		else if(returnValue == 2) {
			idades.calcula();
		}
		else if(returnValue == 3) {
			primos.calcula();
		}
		else if(returnValue == 4) {
			nomes.calcula();
		}
	}
}