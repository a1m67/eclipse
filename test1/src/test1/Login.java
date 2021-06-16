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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	String S_sql;
	/**
	 * Launch the application.
	 */
	public static boolean isNumeric2(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() throws Exception {
		setVisible(true);
		Login_sql login = new Login_sql();
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D/\u624B\u673A\u53F7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(82, 127, 153, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(82, 225, 153, 54);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(82, 166, 195, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 268, 195, 68);
		contentPane.add(passwordField);
		
		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().trim().equals("")&&!passwordField.getText().trim().equals("")) {
				String userId = textField.getText();
				String password = passwordField.getText();
				try {
					boolean a = isNumeric2(userId);
					if(a) {
						S_sql = "Select * from admin where tel = "+userId+" or username = "+"\'"+userId+"\'";
					}
					else {
						S_sql = "Select * from admin where " + "username = "+"\'"+userId+"\'";
					}
					login.stmt = login.con.createStatement();
					System.out.println(S_sql);
					ResultSet rs = login.stmt.executeQuery(S_sql);
					if(!rs.isBeforeFirst()) {
						JOptionPane.showMessageDialog(null, "该账户不存在");
						return;
					}
					else {
						rs.next();
						String pass = rs.getNString("password");
						if(pass.equals(password)) {
							JOptionPane.showMessageDialog(null, "登录成功！欢迎使用本系统");
//							setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							setVisible(false);
							jComboBox1 jf = new jComboBox1();
						}
						else {
							JOptionPane.showMessageDialog(null, "密码错误");
							return;
						}
					}
					
					
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				}
				else {
					JOptionPane.showMessageDialog(null, "请输入完整的登录信息");
					return;
				}
				
				
				
			}
		});
		btnNewButton.setBounds(287, 156, 195, 180);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("\u767B    \u5F55");
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 99));
		lblNewLabel_2.setBounds(82, 24, 400, 92);
		contentPane.add(lblNewLabel_2);
	}
}
