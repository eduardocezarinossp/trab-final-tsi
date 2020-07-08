package telas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import crud.CRUD_pessoas;
import objetos.Pessoa;

public class TelaCadastro extends JFrame{
	
	JLabel lblNome = new JLabel("NOME");
	JTextField txtNome = new JTextField(null, 20);
	
	JLabel lblCpf = new JLabel("CPF");
	JTextField txtCpf = new JTextField(null, 20);
	
	JLabel lblIdade = new JLabel("IDADE");
	JTextField txtIdade = new JTextField(null,2);
		
	//sexo 
	JLabel lblSexo = new JLabel("SEXO");
	String[] sexos  = {"Masculino","Femino","Prefiro Não informar"};
	JComboBox<String> cboSexo = new JComboBox<String>(sexos);
	
	JLabel lblCredito = new JLabel("CREDITO");
	JTextField txtCredito = new JTextField(null,20);
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
	public TelaCadastro() {
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new GridLayout(7,2)); 
		
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		
		getContentPane().add(lblCpf);
		getContentPane().add(txtCpf);
		
		getContentPane().add(lblIdade);
		getContentPane().add(txtIdade);
		
		getContentPane().add(lblSexo);
		getContentPane().add(cboSexo);

		getContentPane().add(lblCredito);
		getContentPane().add(txtCredito);
		
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Pessoa p = new Pessoa();
				p.setNome(txtNome.getText());
				p.setCpf(txtCpf.getText());
				p.setSexo(cboSexo.getSelectedIndex());
				p.setIdade(Integer.parseInt(txtIdade.getText()));
				p.setCredito(Double.parseDouble(txtCredito.getText()));
			    
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
