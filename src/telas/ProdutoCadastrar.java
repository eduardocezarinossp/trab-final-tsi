package telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import crud.CRUD_pessoas;
import crud.CRUD_produtos;
import objetos.Pessoa;
import objetos.Produto;

public class ProdutoCadastrar extends JFrame {

	JLabel lblNome = new JLabel("Descricao");
	JTextField txtNome = new JTextField(null, 20);
	
	JLabel lblCpf = new JLabel("Valor");
	JTextField txtCpf = new JTextField(null, 20);
		
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
	public ProdutoCadastrar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("Pessoas");
		JMenuItem mnCadastrar = new JMenuItem("Cadastrar");
		JMenuItem mnConsultar = new JMenuItem("Consultar");
		
		
		
		JMenu menuFile2 = new JMenu("Produtos");
		JMenuItem mn2Cadastrar = new JMenuItem("Cadastrar");
		JMenuItem mn2Consultar = new JMenuItem("Verificar");
		
		JMenu menuFile3 = new JMenu("Vendas");
		JMenuItem mn3Cadastrar = new JMenuItem("Realizar nova venda");
		JMenuItem mn3Consultar = new JMenuItem("Visualizar Vendas");
		

		mnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				TelaCadastroPessoa telaCadastro = new TelaCadastroPessoa();

				dispose();
			}
		});
		
		mnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaBuscar telaBuscar = new TelaBuscar();
				dispose();
			}
		});
		
		mn2Cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ProdutoCadastrar produtoCadastrar = new ProdutoCadastrar();
				dispose();
			}
		});

		
		mn2Consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ProdutoBuscar produtoBuscar = new ProdutoBuscar();
				dispose();
			}
		});
		
		
		mn3Cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCadastroVenda t = new TelaCadastroVenda();
//				JOptionPane.showMessageDialog (null, "Cadastrar venda");
				dispose();
			}
		});

		
		mn3Consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VendaBuscar v = new VendaBuscar();
//				JOptionPane.showMessageDialog (null, "consultar venda");
				dispose();
			}
		});
		menuFile.add(mnCadastrar);
		menuFile.add(mnConsultar);
		menuBar.add(menuFile);
		
		menuFile2.add(mn2Cadastrar);
		menuFile2.add(mn2Consultar);
		menuBar.add(menuFile2);
		
		menuFile3.add(mn3Cadastrar);
		menuFile3.add(mn3Consultar);
		menuBar.add(menuFile3);
		super.setJMenuBar(menuBar);
		
		
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setVisible(true);
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
				Produto p = new Produto();
				p.setDescricao(txtNome.getText());
				p.setPreco_unitario(Double.parseDouble(txtCpf.getText()));
				
			    
				CRUD_produtos crud = new CRUD_produtos();
				String retorno = crud.cadastra(p);
				JOptionPane.showMessageDialog (null, "Inserido");
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		btnLimpar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				txtCpf.setText(null);
				txtNome.setText(null);
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
			} 
			} );
		
		
		getContentPane().add(btnLimpar);
		
		setVisible(true);
	}
	
	
}
