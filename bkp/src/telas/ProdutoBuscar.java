package telas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	JTextArea resultado = new JTextArea(null, 200, 200);
	
	JLabel lblTeste = new JLabel("teste");
	
	public ProdutoBuscar() {
		
		
		
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,400);
		setLayout(new BorderLayout());
		
//		tela.setLayout(new BorderLayout());
		pnCampos.setLayout(new GridLayout(4,2));
		pnCampos.add(lblDescricao);
		pnCampos.add(txtDescricao);


		pnCampos.add(btnLimpar);
		
//		pnDados.add(resultado);
		
		pnCampos.setSize(200,200);
		
		pnCampos.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				CRUD_produtos crud = new CRUD_produtos();
				if(txtDescricao.getText().isEmpty()) {
					
					for(Produto p2 : crud.readAll()) {
						System.out.println(p2.getId_produto()+"-"+p2.getDescricao()+"- R$"+p2.getPreco_unitario());
						resultado.append(p2.getId_produto()+"-"+p2.getDescricao()+"- R$"+p2.getPreco_unitario()+"\n");
					}
				} else {
					p.setDescricao(txtDescricao.getText());
					p = crud.getProduto(p);
					System.out.println(p.getId_produto()+"-"+p.getDescricao()+"- R$"+p.getPreco_unitario());
					resultado.append(p.getId_produto()+"-"+p.getDescricao()+"- R$"+p.getPreco_unitario()+"\n");
				}
				
				
				
				
			    
				
			  }

			
			} );
		
		btnBuscar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				resultado.setText("");			    
				txtDescricao.setText("");
			  }

			
			} );
		
		
		resultado.setSize(200, 300);
		pnCampos.add(resultado);
		tela.addTab("Filtros", pnCampos);
		

		getContentPane().add(tela);
		setVisible(true);
		
	}
}
