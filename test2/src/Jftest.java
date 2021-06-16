import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Jftest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jftest frame = new Jftest();
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
	public Jftest() {
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-108, 10, 463, 54);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"  --\u67E5\u8BE2--", "\u6839\u636E\u5B66\u53F7\u67E5\u8BE2", "\u6839\u636E\u59D3\u540D\u67E5\u8BE2"}));
		comboBox.setEditable(true);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--\u7C4D\u8D2F--", "\u5317\u4EAC\u5E02", "\u5929\u6D25\u5E02", "\u4E0A\u6D77\u5E02", "\u91CD\u5E86\u5E02", "\u6CB3\u5317\u7701", "\u5C71\u897F\u7701", "\u8FBD\u5B81\u7701", "\u5409\u6797\u7701", "\u9ED1\u9F99\u6C5F\u7701", "\u6C5F\u82CF\u7701", "\u5B89\u5FBD\u7701", "\u798F\u5EFA\u7701", "\u6C5F\u897F\u7701", "\u5C71\u4E1C\u7701", "\u6CB3\u5357\u7701", "\u6E56\u5317\u7701", "\u6E56\u5357\u7701", "\u5E7F\u4E1C\u7701", "\u6D77\u5357\u7701", "\u56DB\u5DDD\u7701", "\u8D35\u5DDE\u7701", "\u4E91\u5357\u7701", "\u9655\u897F\u7701", "\u7518\u8083\u7701", "\u9752\u6D77\u7701", "\u53F0\u6E7E\u7701", "\u5185\u8499\u53E4\u81EA\u6CBB\u533A", "\u5E7F\u897F\u58EE\u65CF\u81EA\u6CBB\u533A", "\u897F\u85CF\u81EA\u6CBB\u533A", "\u5B81\u590F\u56DE\u65CF\u81EA\u6CBB\u533A", "\u65B0\u7586\u7EF4\u543E\u5C14\u81EA\u6CBB\u533A", "\u9999\u6E2F\u7279\u522B\u884C\u653F\u533A", "\u6FB3\u95E8\u7279\u522B\u884C\u653F\u533A"}));
		comboBox_1.setEditable(true);
		panel.add(comboBox_1);
	}
}
