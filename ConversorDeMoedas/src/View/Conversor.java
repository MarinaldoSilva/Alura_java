package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JMenu;

public class Conversor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        }catch(ClassNotFoundException|InstantiationException|
	        		IllegalAccessException|javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex.getMessage());
	        }
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(null, e.getActionCommand());
			}
		});
		
		btnNewButton.setBounds(270, 64, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		Label label = new Label("MOEDA");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(183, 23, 46, 22);
		frame.getContentPane().add(label);
		
		JComboBox cbMoeda = new JComboBox();
		cbMoeda.setModel(new DefaultComboBoxModel(new String[] {"Real -> Dolar", "Real -> Euro"}));
		
		cbMoeda.setBounds(47, 64, 198, 22);
		frame.getContentPane().add(cbMoeda);
		
		
	}
}
