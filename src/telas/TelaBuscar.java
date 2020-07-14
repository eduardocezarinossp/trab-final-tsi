package telas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import crud.CRUD_pessoas;
import objetos.Pessoa;


public class TelaBuscar extends JFrame{
	JPanel pnCampos = new JPanel();
	JTabbedPane tela = new JTabbedPane();

	
	JLabel lblCredito = new JLabel("Nome");
	JTextField txtCredito = new JTextField(null,5);
	

	
	JButton btnCadastrar = new JButton("Buscar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	JTextArea resultado = new JTextArea();
	
	JLabel lblTeste = new JLabel("teste");
	
	public TelaBuscar() {
		
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
		setSize(600,600);
		setLayout(new BorderLayout());

//		tela.setLayout(new BorderLayout());
		pnCampos.setLayout(new GridLayout(5,2));
		pnCampos.add(lblCredito);
		pnCampos.add(txtCredito);
		
		pnCampos.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Pessoa p1 = new Pessoa();
				p1.setNome(txtCredito.getText());
				
				CRUD_pessoas crud = new CRUD_pessoas();
				
				for(Pessoa p : crud.readAll(p1)) {
					System.out.println(p.getNome());
					resultado.append(p.getNome()+" ( "+p.getCpf()+ ")"+"\n");
					
				};
			    
				
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
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
