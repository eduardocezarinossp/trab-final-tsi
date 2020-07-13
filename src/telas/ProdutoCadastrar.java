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
	
	JLabel lblValor = new JLabel("Preco");
	JTextField txtValor = new JTextField(null, 20);
		
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
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
				Produto p1 = new Produto();
				p1.setDescricao(txtDescricao.getText());
				p1.setPreco_unitario(Double.parseDouble(txtValor.getText().replace(",", ".")));
				if(txtValor.getText().isEmpty() || txtValor.getText().matches("a-zA-Z")) {
					JOptionPane.showMessageDialog(null, "O preço não pode ser vazio.");
				} else if (txtDescricao.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O nome não pode ser vazio.");
				} else {
					CRUD_produtos crud = new CRUD_produtos();
					String ret = crud.cadastra(p1);
					JOptionPane.showMessageDialog (null, "Inserido");
				}
				
				
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		
		
		getContentPane().add(btnLimpar);
		
		setVisible(true);
	}
	
}
