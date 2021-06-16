package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Registered extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registered frame = new Registered();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Registered() throws Exception {
		
		Login_sql  register = new Login_sql();
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tel:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(57, 10, 109, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("userName:");
		lblUsername.setFont(new Font("宋体", Font.PLAIN, 16));
		lblUsername.setBounds(57, 59, 109, 39);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setFont(new Font("宋体", Font.PLAIN, 16));
		lblPassword.setBounds(57, 118, 109, 39);
		contentPane.add(lblPassword);
		
		JLabel lblConfirm = new JLabel("confirm:");
		lblConfirm.setFont(new Font("宋体", Font.PLAIN, 16));
		lblConfirm.setBounds(57, 167, 109, 39);
		contentPane.add(lblConfirm);
		
		textField = new JTextField();
		textField.setBounds(176, 11, 180, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener((KeyListener) new KeyAdapter(){
	          public void keyTyped(KeyEvent event)
	           {
	               char ch=event.getKeyChar();
	               String s = textField.getText();
	               if(ch<'0'||ch>'9'||s.length()>=11)
	                event.consume();
	            }
	       });
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 60, 180, 39);
		contentPane.add(textField_1);
		textField_1.addKeyListener((KeyListener) new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = textField_1.getText();
				if(s.length() >= 16) e.consume();
			}
	       });
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 116, 180, 45);
		contentPane.add(passwordField);
		passwordField.addKeyListener((KeyListener) new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = passwordField.getText();
				if(s.length() >= 16) e.consume();	
			}
	       });
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(176, 171, 180, 45);
		contentPane.add(passwordField_1);
		passwordField_1.addKeyListener((KeyListener) new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = passwordField_1.getText();
				if(s.length() >= 16) e.consume();
			}
	       });
		
		btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().trim().equals("")&&!textField_1.getText().trim().equals("")&&!passwordField.getText().trim().equals("")&&!passwordField_1.getText().trim().equals("")){
					long tel =  Long.parseLong(textField.getText());
					
					String userName = textField_1.getText();
					String password = passwordField.getText();
					String confirm = passwordField_1.getText();
					
					String S_tel ="Select * from admin where tel = "+tel; 
//					System.out.println(S_tel);
					
					String S_userName = "Select * from admin where userName = "+"\'"+userName+"\'";
//					System.out.println(S_userName);
					try {
						register.stmt = register.con.createStatement();
						ResultSet rs = register.stmt.executeQuery(S_tel);
						ResultSet rs1 = register.stmt.executeQuery(S_userName);
						if(tel<10000000000l||tel>19999999999l) {
							JOptionPane.showMessageDialog(null, "请输入合法的手机号");
							return;
						}
						else if(rs.isBeforeFirst()) {
							JOptionPane.showMessageDialog(null, "该手机已被注册");
							return;
						}						
						else if(userName.length()<2) {
							JOptionPane.showMessageDialog(null, "用户名长度过短，请重新输入");
							return;
						}
						else if(rs1.isBeforeFirst()) {
							JOptionPane.showMessageDialog(null, "该用户名已存在");
							return;
						}
						else if(password.length()<6) {
							JOptionPane.showMessageDialog(null, "密码过短");
							return;
						}
						else if(!password.equals(confirm)) {
							JOptionPane.showMessageDialog(null, "两次输入的密码不一致");
							return;
						}
						else {
							String I_sql = "Insert Into Admin values("+tel+",\'"+userName+"\',\'"+password+"\')";
//							System.out.println(I_sql); 
							register.stmt.execute(I_sql);
							JOptionPane.showMessageDialog(null, "注册成功");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "请输入完整信息");
					return;
				}
				
				
			}
		});
		btnNewButton.setBounds(57, 246, 299, 82);
		contentPane.add(btnNewButton);
		
		
		this.setVisible(true);
		
		
		
		
		
	}
}



















//password.addKeyListener(new KeyListener() {
//	 
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		int len = password.getPassword().length;
//		if(len >= 16) {//限制密码框输入长度
//			password.setEditable(false);
//		}
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		password.setEditable(true);
//		
//	}
//	
//});