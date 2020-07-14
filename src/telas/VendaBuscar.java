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
