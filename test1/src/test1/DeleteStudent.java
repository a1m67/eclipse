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

public class DeleteStudent extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JButton btnNewButton ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent frame = new DeleteStudent();
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
	public DeleteStudent() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u5220\u9664");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u8981\u5220\u9664\u7684\u5B66\u751F\u7684\u5B66\u53F7:");
		lblNewLabel.setBounds(24, 37, 163, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(197, 32, 197, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		//ֻ������������
		textField.addKeyListener((KeyListener) new KeyAdapter(){
		          public void keyTyped(KeyEvent event)
		           {
		               char ch=event.getKeyChar();
		               if(ch<'0'||ch>'9')
		                event.consume();
		            }
		       });
		
		btnNewButton = new JButton("\u786E\u5B9A");
		
		btnNewButton.setBounds(67, 122, 271, 88);
		contentPane.add(btnNewButton);
		this.setVisible(true);
	}

}
