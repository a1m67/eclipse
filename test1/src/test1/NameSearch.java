package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class NameSearch extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JTable table_3;
	 JScrollPane scrollPane;
	 JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public NameSearch() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 344);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u67E5\u8BE2");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D:");
		lblNewLabel.setBounds(31, 24, 44, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 24, 225, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(320, 24, 116, 34);
		contentPane.add(btnNewButton);
		
		
//		
//		table_3 = new JTable();
//		table_3.setModel(new DefaultTableModel(
//			new Object[][] {
//			},
//			new String[] {
//				"id", "name", "address"
//			}
//		));
//		
//		
//		
//		JScrollPane scrollPane = new JScrollPane(table_3);
//		scrollPane.setBounds(0, 85, 436, 166);
//		contentPane.add(scrollPane);
		this.setVisible(true);
//		scrollPane.setColumnHeaderView();
		

		
		
		

	}
}
