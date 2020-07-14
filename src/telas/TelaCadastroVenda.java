package telas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import crud.CRUD_pessoas;
import crud.CRUD_produtos;
import crud.CRUD_vendas;
import objetos.Pessoa;
import objetos.Venda;

public class TelaCadastroVenda extends JFrame{
	
//	JLabel lblNome = new JLabel("Pessoa");
//	JTextField txtNome = new JTextField(null, 20);
//	
//	JLabel lblCpf = new JLabel("CPF");
//	JTextField txtCpf = new JTextField(null, 20);
		
	
	JLabel lblValor = new JLabel("Valor venda");
	JTextField txtValor = new JTextField(null, 20);
	
	JButton btnProduto = new JButton("Selecione o produto");
	JLabel lblProduto = new JLabel("produto..");
	
	JButton btnVendedor = new JButton("Selecione o vendedor");
	JLabel lblVendedor = new JLabel("vendedor..");
	
	JButton btnComprador = new JButton("Selecione o comprador");
	JLabel lblComprador = new JLabel("comprador..");
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	
	private void btnCadastrar() {
		

	}
	public TelaCadastroVenda() {
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
		setLayout(new GridLayout(6,2)); 
		
		
		getContentPane().add(btnProduto);
		getContentPane().add(lblProduto);
	    
		getContentPane().add(btnVendedor);
		getContentPane().add(lblVendedor);

		getContentPane().add(btnComprador);
		getContentPane().add(lblComprador);
		
		getContentPane().add(lblValor);
		getContentPane().add(txtValor);
		
		
		getContentPane().add(btnCadastrar);
		
		getContentPane().add(btnLimpar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
			  CRUD_vendas crud = new CRUD_vendas();
			  Venda v  = new Venda();
			  v.setIdproduto(lblProduto.getText());
			  v.setIdvendedor(lblVendedor.getText());
			  v.setIdcomprador(lblComprador.getText());
			  v.setValor_venda(txtValor.getText());
			  
			  crud.cadastra(v);
			  JOptionPane.showMessageDialog (null, "Venda Inserida");
			  System.out.println(v);
			  }

			} );
		btnVendedor.addActionListener(new ActionListener() { 
		  public void actionPerformed(ActionEvent e) {
			  CRUD_pessoas crud = new CRUD_pessoas();

			  String[] options = crud.readAllString();
			  Integer response =  JOptionPane.showOptionDialog(null, "Selecione", "Vendedor",
			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			        null, options, options[0]);
			  String nome = "";
			  int aux = 0;
			  for(String i : options) {
				  if(aux == response) {
					  nome = i;
				  }
				  aux++;  
			  }
				lblVendedor.setText(nome);
				System.out.println(response);
//				
			}

			
			} );
		btnComprador.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  CRUD_pessoas crud = new CRUD_pessoas();

				  String[] options = crud.readAllString();
				  Integer response =  JOptionPane.showOptionDialog(null, "Selecione", "Comprador",
				        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				        null, options, options[0]);
				  String nome = "";
				  int aux = 0;
				  for(String i : options) {
					  if(aux == response) {
						  nome = i;
					  }
					  aux++;  
				  }
					lblComprador.setText(nome);
					System.out.println(response);
//					
				}

				} );
		
		btnProduto.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  CRUD_produtos crud = new CRUD_produtos();

				  String[] options = crud.readAllString();
				  Integer response =  JOptionPane.showOptionDialog(null, "Selecione", "Produto",
				        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				        null, options, options[0]);
				  String nome = "";
				  int aux = 0;
				  for(String i : options) {
					  if(aux == response) {
						  nome = i;
					  }
					  aux++;  
				  }
				  lblProduto.setText(nome);
					System.out.println(response);
//					
				}

				
				} );
		
		
		
		setVisible(true);
	}
}
