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
	JScrollPane pnDados = new JScrollPane();
	JTabbedPane tela = new JTabbedPane();

	
	JLabel lblDescricao = new JLabel("Descricao");
	JTextField txtDescricao = new JTextField(null,5);
	
	JLabel lblValorAproximado = new JLabel("Valor aproximado (~10)");
	JTextField txtValorAproximado = new JTextField(null,5);
	
	
	
	JButton btnBuscar = new JButton("Buscar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	JTextArea resultado = new JTextArea();
	
	JLabel lblTeste = new JLabel("teste");
	
	public ProdutoBuscar() {
		
		
		
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new BorderLayout());

//		tela.setLayout(new BorderLayout());
		pnCampos.setLayout(new GridLayout(3,2));
		pnCampos.add(lblDescricao);
		pnCampos.add(txtValorAproximado);

		pnCampos.add(lblValorAproximado);
		pnCampos.add(txtValorAproximado);
		
		pnCampos.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				CRUD_produtos crud = new CRUD_produtos();
				if(txtValorAproximado.getText().isEmpty() && txtDescricao.getText().isEmpty()) {
					
					for(Produto p2 : crud.readAll()) {
						System.out.println(p2.getId_produto()+"-"+p2.getDescricao()+"- R$"+p2.getPreco_unitario());
					}
				} else {
					p.setDescricao(txtDescricao.getText());
					p.setPreco_unitario(Double.parseDouble(txtValorAproximado.getText()));
					p = crud.getProduto(p);
					System.out.println(p.getId_produto()+"-"+p.getDescricao()+"- R$"+p.getPreco_unitario());
				}
				
				
				
				
			    
				
			  }

			
			} );
		
		
		pnCampos.add(btnLimpar);
		
		pnDados.add(resultado);
		
		pnCampos.setSize(200,200);
//		tela.add(pnCampos,BorderLayout.WEST);
//		tela.add(pnDados,BorderLayout.EAST);
		
		tela.addTab("Filtros", pnCampos);
		tela.addTab("resultado", pnDados);

		getContentPane().add(tela);
		setVisible(true);
		
	}
}
