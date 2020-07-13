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
	JScrollPane pnDados = new JScrollPane();
	JTabbedPane tela = new JTabbedPane();

	
	JLabel lblCredito = new JLabel("CREDITO");
	JTextField txtCredito = new JTextField(null,5);
	
	JLabel lblSexos = new JLabel("SEXO");
	String[] sexos  = {"Masculino","Femino","Prefiro Não informar"};
	JComboBox<String> cboSexo = new JComboBox<String>(sexos);
	
	JButton btnCadastrar = new JButton("Buscar");
	JButton btnLimpar = new JButton("Limpar Campos");
	
	JTextArea resultado = new JTextArea();
	
	JLabel lblTeste = new JLabel("teste");
	
	public TelaBuscar() {
		
		
		
		System.setProperty("java.awt.headless", "false"); 
		setSize(600,200);
		setLayout(new BorderLayout());

//		tela.setLayout(new BorderLayout());
		pnCampos.setLayout(new GridLayout(3,2));
		pnCampos.add(lblCredito);
		pnCampos.add(txtCredito);

		pnCampos.add(lblSexos);
		pnCampos.add(cboSexo);
		
		pnCampos.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				Pessoa p1 = new Pessoa();
				
				
				CRUD_pessoas crud = new CRUD_pessoas();
				
				for(Pessoa p : crud.readAll(p1)) {
					System.out.println(p.getNome());
					
				};
			    
				
			  }

			private void cadastra() {
				// TODO Auto-generated method stub
				
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
