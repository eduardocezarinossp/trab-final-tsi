package telas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import crud.CRUD_pessoas;
import objetos.Pessoa;

public class TelaCadastroVenda extends JFrame{
	
//	JLabel lblNome = new JLabel("Pessoa");
//	JTextField txtNome = new JTextField(null, 20);
//	
//	JLabel lblCpf = new JLabel("CPF");
//	JTextField txtCpf = new JTextField(null, 20);
		
	JButton btnVendedor = new JButton("Selecione o vendedor");
	JLabel lblValor = new JLabel("Valor venda");
	JTextField txtValor = new JTextField(null, 20);
	JLabel lblVendedor = new JLabel("vendedor..");
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
	public TelaCadastroVenda() {
		CRUD_pessoas crud = new CRUD_pessoas();
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new GridLayout(3,2)); 
		
		getContentPane().add(lblValor);
		getContentPane().add(txtValor);
	    
	    
		getContentPane().add(btnVendedor);
		getContentPane().add(lblVendedor);
		
		getContentPane().add(btnCadastrar);
		
		getContentPane().add(btnLimpar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
								
			    
//				CRUD_pessoas crud = new CRUD_pessoas();
//				String retorno = crud.cadastra(p);
//				JOptionPane.showMessageDialog (null, "Inserido");
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		btnVendedor.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  String[] options = crud.readAllString();
				  Integer response =  JOptionPane.showOptionDialog(null, "Selecione o comprador", "Title",
				        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				        null, options, options[0]);
					lblVendedor.setText(response.toString());
					System.out.println(response);
//				
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		
		
		setVisible(true);
	}
}
