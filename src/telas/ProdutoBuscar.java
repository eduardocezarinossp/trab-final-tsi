package telas;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.CRUD_pessoas;
import crud.CRUD_produtos;
import objetos.Pessoa;
import objetos.Produto;

public class ProdutoBuscar extends JFrame{
	JPanel pnCampos = new JPanel();
	JTabbedPane tela = new JTabbedPane();

	
	JLabel lblDescricao = new JLabel("Descricao");
	JTextField txtDescricao = new JTextField(null,5);
	
	
	
	
	
	JButton btnBuscar = new JButton("Buscar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	JTextArea resultado = new JTextArea();
	
	JLabel lblTeste = new JLabel("teste");
	
	public ProdutoBuscar() {
		
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
		setSize(600,650);
		setLayout(new BorderLayout());

//		tela.setLayout(new BorderLayout());
		pnCampos.setLayout(new GridLayout(5,2));
		pnCampos.add(lblDescricao);
		pnCampos.add(txtDescricao);

		
		pnCampos.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				CRUD_produtos crud = new CRUD_produtos();
				if( txtDescricao.getText().isEmpty()) {
					
					resultado.setText(null);
					for(Produto p2 : crud.readAll()) {
//						System.out.println(p2.getId_produto()+"-"+p2.getDescricao()+"- R$"+p2.getPreco_unitario());
						resultado.append(p2.getId_produto()+"-"+p2.getDescricao()+"- R$"+p2.getPreco_unitario()+"\n");
					}
				} else {
					p.setDescricao(txtDescricao.getText());
					
					p = crud.getProduto(p);
					resultado.setText(null);
//					System.out.println(p.getId_produto()+"-"+p.getDescricao()+"- R$"+p.getPreco_unitario());
					resultado.setText(p.getId_produto()+"-"+p.getDescricao()+"- R$"+p.getPreco_unitario());
				}
				
				
				
				
			    
				
			  }

			
			} );
		
		btnLimpar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  txtDescricao.setText(null);
				  resultado.setText(null);
				
			  }

			
			} );
		
		
		pnCampos.add(btnLimpar);
		

		
		pnCampos.setSize(200,200);
//		tela.add(pnCampos,BorderLayout.WEST);
//		tela.add(pnDados,BorderLayout.EAST);
		pnCampos.add(resultado);
		tela.addTab("Filtros", pnCampos);


		getContentPane().add(tela);
		setVisible(true);
		
	}
}
