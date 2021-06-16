package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class AddressSearch extends JFrame {

	JPanel contentPane;
	JComboBox comboBox;
	JButton btnNewButton;
	JScrollPane scrollPane;
	JTable table;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddressSearch frame = new AddressSearch();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AddressSearch() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u60A8\u60F3\u67E5\u8BE2\u7684\u7701\u4EFD\uFF1A\r\n");
		lblNewLabel.setBounds(10, 34, 163, 47);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5317\u4EAC", "\u5929\u6D25", "\u4E0A\u6D77", "\u91CD\u5E86", "\u6CB3\u5317", "\u5C71\u897F", "\u8FBD\u5B81", "\u5409\u6797", "\u9ED1\u9F99\u6C5F", "\u6C5F\u82CF", "\u6D59\u6C5F", "\u5B89\u5FBD", "\u798F\u5EFA", "\u6C5F\u897F", "\u5C71\u4E1C", "\u6CB3\u5357", "\u6E56\u5317", "\u6E56\u5357", "\u5E7F\u4E1C", "\u6D77\u5357", "\u56DB\u5DDD", "\u8D35\u5DDE", "\u4E91\u5357", "\u9655\u897F", "\u7518\u8083", "\u9752\u6D77", "\u53F0\u6E7E", "\u5185\u8499\u53E4", "\u5E7F\u897F", "\u897F\u85CF", "\u5B81\u590F", "\u65B0\u7586", "\u9999\u6E2F", "\u6FB3\u95E8"}));
		comboBox.setBounds(145, 34, 133, 47);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("\u786E\u5B9A");
		
		btnNewButton.setBounds(288, 34, 133, 47);
		contentPane.add(btnNewButton);
		
		
		
//		table = new JTable();
//		scrollPane.setColumnHeaderView(table);
		this.setVisible(true);
	}
}
