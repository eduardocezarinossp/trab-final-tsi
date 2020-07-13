package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela extends JFrame{
	JPanel telaGlobal = new JPanel();
	
	public Tela() {
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
				JOptionPane.showMessageDialog (null, "Cadastrar venda");
//				dispose();
			}
		});

		
		mn3Consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog (null, "consultar venda");
//				dispose();
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
	}
}
