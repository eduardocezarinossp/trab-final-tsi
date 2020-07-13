package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela extends JFrame{
	JPanel telaGlobal = new JPanel();
	
	public Tela() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("Opções");
		JMenuItem mnCadastrar = new JMenuItem("Cadastrar");
		JMenuItem mnConsultar = new JMenuItem("Consultar");
		
		JOptionPane.showMessageDialog(null,"Escolha uma opção no menu");
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
				// TODO Auto-generated method stub
				TelaBuscar telaBuscar = new TelaBuscar();
				dispose();
			}
		});
		
		menuFile.add(mnCadastrar);
		menuFile.add(mnConsultar);
		menuBar.add(menuFile);
		super.setJMenuBar(menuBar);
		
		
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setVisible(true);
	}
}
