package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateStudent extends JFrame {

	JPanel contentPane;
	JTable table;
	JTextField textField;
	JButton btnNewButton;
	JScrollPane scrollPane;
	JButton btnNewButton_1;
	JTextField textField_2;
	JLabel lblNewLabel_1;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public UpdateStudent() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 414);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u4FEE\u6539");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8981\u4FEE\u6539\u4FE1\u606F\u7684\u5B66\u751F\u7684\u5B66\u53F7\uFF1A");
		lblNewLabel.setBounds(10, 25, 144, 41);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("\u786E\u5B9A\r\n");
		
		btnNewButton.setBounds(329, 25, 97, 41);
		contentPane.add(btnNewButton);
		
		
		
		
		textField = new JTextField();
		textField.setBounds(160, 25, 144, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		textField_1.setBounds(160, 284, 144, 41);
//		contentPane.add(textField_1);
//		
		
		
		
		
		
		
		textField.addKeyListener((KeyListener) new KeyAdapter(){
	          public void keyTyped(KeyEvent event)
	           {
	               char ch=event.getKeyChar();
	               if(ch<'0'||ch>'9')
	                event.consume();
	            }
	       });
		this.setVisible(true);
	}
}
