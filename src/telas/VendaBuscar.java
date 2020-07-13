package telas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.CRUD_pessoas;
import crud.CRUD_produtos;
import crud.CRUD_vendas;
import objetos.Pessoa;
import objetos.Produto;
import objetos.Venda;

public class VendaBuscar extends JFrame{
	JPanel pnCampos = new JPanel();
	

	
	JButton btnBuscar = new JButton("Buscar");
	
	JTextArea resultado = new JTextArea(null, 200, 200);
	
//	JLabel lblTeste = new JLabel("teste");
	
	public VendaBuscar() {
		System.setProperty("java.awt.headless", "false"); 
		
		setLayout(new BorderLayout());
		setSize(600,1000);
		setLayout(new GridLayout(6,2));
//		tela.setLayout(new BorderLayout());
		
		
		
//		pnDados.add(resultado);
		
//		pnCampos.setSize(200,200);
		
		
		
		
		btnBuscar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				
				CRUD_vendas crud = new CRUD_vendas();
				for(Venda v : crud.readAll()) {
					
					resultado.append("Vendedor: "+v.getVendedor()+
							 ", "+
							"Comprador: "+v.getComprador()+
							", Produto: "+v.getDescricao()+
							", Valor: "+v.getValor_venda()+
							"\n______________________________________________________\n");
				}
				
				
				
				
			    
				
			  }

			
			} );
		
		getContentPane().add(btnBuscar);
		resultado.setSize(600, 800);
		getContentPane().add(resultado);
		

		
		setVisible(true);
		
	}
}
