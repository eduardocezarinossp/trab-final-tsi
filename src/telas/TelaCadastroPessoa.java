package telas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import crud.CRUD_pessoas;
import objetos.Pessoa;

public class TelaCadastroPessoa extends JFrame{
	
	JLabel lblNome = new JLabel("NOME");
	JTextField txtNome = new JTextField(null, 20);
	
	JLabel lblCpf = new JLabel("CPF");
	JTextField txtCpf = new JTextField(null, 20);
		
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
	public TelaCadastroPessoa() {
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new GridLayout(7,2)); 
		
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		
		getContentPane().add(lblCpf);
		getContentPane().add(txtCpf);
		
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Pessoa p = new Pessoa();
				p.setNome(txtNome.getText());
				p.setCpf(txtCpf.getText());
				
			    
				CRUD_pessoas crud = new CRUD_pessoas();
				String retorno = crud.cadastra(p);
				JOptionPane.showMessageDialog (null, "Inserido");
			  }	

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		
		
		getContentPane().add(btnLimpar);
		
		setVisible(true);
	}
}
