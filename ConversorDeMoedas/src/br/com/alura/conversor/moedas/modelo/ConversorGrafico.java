package br.com.alura.conversor.moedas.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConversorGrafico extends JFrame{
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem op0;
	private JMenuItem op1;
	private JMenuItem op2;
	
	ConversorGrafico(){
		setSize(400, 300);
		setTitle("Conversor de Moedas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel  = new JPanel();
		
		exibirMenu();
		painel.add(menuBar);
		add(painel);
	}
	
	public void exibirMenu() {
		JMenuBar menubar = new JMenuBar();
		
		menu = new JMenu("Escolha uma opção valida");
		op1 = new JMenuItem("Real para Dolar");
		op2 = new JMenuItem("Real para Euro");
		op0 = new JMenuItem("Sair");
		
		menu.add(op1);
		menu.add(op2);
		menu.add(op0);
		
		menuBar.add(menu);
		
		op0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "que pena que você vai sair, até logo!");
				System.exit(0);
				
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ConversorGrafico janelaGrafica = new ConversorGrafico();
		janelaGrafica.setVisible(true);
		
		
	}

}
