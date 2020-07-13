package telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import crud.CRUD_pessoas;
import crud.CRUD_produtos;
import objetos.Pessoa;
import objetos.Produto;

public class ProdutoCadastrar extends JFrame {
	JLabel lblDescricao = new JLabel("Descricao");
	JTextField txtDescricao = new JTextField(null, 20);
	
	JLabel lblValor = new JLabel("Valor");
	JTextField txtValor = new JTextField(null, 20);
	

	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	public ProdutoCadastrar() {
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new GridLayout(7,2)); 
		
		getContentPane().add(lblDescricao);
		getContentPane().add(txtDescricao);
		
		getContentPane().add(lblValor);
		getContentPane().add(txtValor);
		
		
		
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				p.setDescricao(txtDescricao.getText());
				String temp = txtValor.getText().replace(",", ".");
				temp = temp.replaceAll("[a-zA-z]", "");
				Double valor = Double.parseDouble(temp);
				if(valor == 0 ) {
					JOptionPane.showMessageDialog(null, "Valor não pode ser vazio.");
				} else {
					CRUD_produtos cp = new CRUD_produtos();
					String retorno = cp.cadastra(p);
					JOptionPane.showMessageDialog (null, "Inserido");
				}
			    
				
			  }

			
			} );
		
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				txtDescricao.setText("");
				txtValor.setText("0");
			  }
			  
		});
		getContentPane().add(btnLimpar);
		
		setVisible(true);
	}
	
	
}
