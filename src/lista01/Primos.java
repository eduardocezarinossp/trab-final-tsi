package lista01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Primos {
	
	public void calcula() {
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		
			i1  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
			if(isPrimo(i1)) a.add(i1);
			
			i2  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
			if(isPrimo(i2)) a.add(i2);
			
			i3  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));
			if(isPrimo(i3)) a.add(i3);
			
			i4  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 4"));
			if(isPrimo(i4)) a.add(i4);
			
			i5  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 5"));
			if(isPrimo(i5)) a.add(i5);
			
			JOptionPane.showMessageDialog(null, "Quantidade de numeros primos: " + a.size());
		
			
	}
	
	public static boolean isPrimo(int x) {
		if(x == 1)x=4;
		int temp;
		boolean isPrime=true;
		
		int num=x;
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}

	        if (!isPrime) return false;
	        else return true;
	    }
}
