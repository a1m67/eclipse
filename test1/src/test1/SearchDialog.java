package test1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchDialog extends JDialog {

	public SearchDialog(){
		this.setLayout(new GridLayout(2,1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JLabel jl1 =  new JLabel("—ß∫≈");
		JTextField jtf1 = new JTextField();
		JButton jb1 = new JButton ("≤È—Ø");
		jp1.add(jl1);jp1.add(jtf1);
		jp2.add(jb1);
		this.add(jp1);
		this.add(jp2);
		String text = jtf1.getText();
		
	}
	
}
