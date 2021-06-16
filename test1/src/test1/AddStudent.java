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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

class AddStudent extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JButton btnNewButton;
	 JComboBox comboBox;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u6DFB\u52A0");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6DFB\u52A0\u4E00\u4E2A\u5B66\u751F");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u53F7:");
		lblNewLabel.setBounds(41, 56, 105, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u8981\u6DFB\u52A0\u5B66\u751F\u7684\u4FE1\u606F");
		lblNewLabel_1.setBounds(126, 10, 164, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 60, 164, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener((KeyListener) new KeyAdapter(){
	          public void keyTyped(KeyEvent event)
	           {
	               char ch=event.getKeyChar();
	               if(ch<'0'||ch>'9')
	                event.consume();
	            }
	       });
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 118, 164, 27);
		textField_1.addKeyListener((KeyListener) new KeyAdapter(){
	          public void keyTyped(KeyEvent event)
	           {
	               char ch=event.getKeyChar();
	               if(!(ch<'0'||ch>'9'))
	                event.consume();
	            }
	       });
		contentPane.add(textField_1);
		
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		textField_2.setBounds(99, 180, 164, 27);
//		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D:");
		lblNewLabel_2.setBounds(41, 114, 105, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u7C4D\u8D2F:");
		lblNewLabel_3.setBounds(41, 176, 105, 34);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton = new JButton("\u786E\u5B9A");
		
		
		btnNewButton.setBounds(273, 118, 153, 89);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5317\u4EAC", "\u5929\u6D25", "\u4E0A\u6D77", "\u91CD\u5E86", "\u6CB3\u5317", "\u5C71\u897F", "\u8FBD\u5B81", "\u5409\u6797", "\u9ED1\u9F99\u6C5F", "\u6C5F\u82CF", "\u6D59\u6C5F", "\u5B89\u5FBD", "\u798F\u5EFA", "\u6C5F\u897F", "\u5C71\u4E1C", "\u6CB3\u5357", "\u6E56\u5317", "\u6E56\u5357", "\u5E7F\u4E1C", "\u6D77\u5357", "\u56DB\u5DDD", "\u8D35\u5DDE", "\u4E91\u5357", "\u9655\u897F", "\u7518\u8083", "\u9752\u6D77", "\u53F0\u6E7E", "\u5185\u8499\u53E4", "\u5E7F\u897F", "\u897F\u85CF", "\u5B81\u590F", "\u65B0\u7586", "\u9999\u6E2F", "\u6FB3\u95E8"}));
		comboBox.setBounds(99, 170, 164, 40);
		contentPane.add(comboBox);
		
		this.setVisible(true);
	}
}
