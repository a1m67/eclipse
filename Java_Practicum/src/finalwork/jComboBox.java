package finalwork;
import javax.swing.*;

public class jComboBox {
    @SuppressWarnings("unchecked")
	public static void main(String args[]){
        JFrame jf =new JFrame("瀛︾敓绫嶈疮淇℃伅璁板綍绨�");
        JPanel jp1 =new JPanel();

//        JLabel jl1 = new JLabel("鏌ヨ");
//        JLabel jl2 = new JLabel("鏍规嵁瀛﹀彿鏌ヨ");
//        JLabel jl3 = new JLabel("鏍规嵁濮撳悕鏌ヨ");



        @SuppressWarnings("rawtypes")
		JComboBox cmb1 =new JComboBox();
        cmb1.addItem("---鏌ヨ---");
        cmb1.addItem("瀛﹀彿");
        cmb1.addItem("濮撳悕");

        jp1.add(cmb1);
        jf.add(jp1);
        jf.setBounds(300,200,400,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
