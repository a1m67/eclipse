package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import test1.Test_Student;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class jComboBox1 extends JFrame {
	private JPanel contentPane;
	public static Test_Student test;
	JTable table;
	JScrollPane scrollPane;
	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	void init () throws Exception {
		
		test = new Test_Student();
	}
	
	public static void main(String[] args) throws Exception{
					jComboBox1 frame = new jComboBox1();
					frame.setVisible(true);
	}
	public static boolean isLetterDigit(String str) {
		  String regex = "^[a-z0-9A-Z]+$";
		  return str.matches(regex);
		 }

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
public jComboBox1() throws Exception {
		
		setTitle("\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 402);
		init();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u67E5\u8BE2");
		menuBar.add(mnNewMenu);
		
		
		
		
		//查询
		 
		//根据id查询
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6839\u636E\u5B66\u53F7\u67E5\u8BE2");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IdSearch idsearch = new IdSearch();
				idsearch.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {						
						
							if (idsearch.textField.getText().trim().equals("")){//判定文本框输入是否为空 					
								JOptionPane.showMessageDialog(null, "您的输入为空");
								return;
							}
							String text =  idsearch.textField.getText();
							Vector rowData,columnNames;
							columnNames = new Vector();
							rowData =new Vector();
							columnNames.add("id");columnNames.add("name");columnNames.add("address");
							idsearch.table_3 = new JTable(rowData,columnNames) {
								public boolean isCellEditable(int rowIndex, int ColIndex){
								     return false;
									}
							};
							idsearch.scrollPane = new JScrollPane(idsearch.table_3);
							idsearch.scrollPane.setBounds(0, 85, 436, 166);
							idsearch.table_3.setVisible(true);
							idsearch.contentPane.add(idsearch.scrollPane);
							String sIdSearch ="Select id,name,address from students where id like "+"\'"+"%"+text+"%"+"\'";
							System.out.println(sIdSearch);
							try {
								test.stmt = test.con.createStatement();
								ResultSet rs = test.stmt.executeQuery(sIdSearch);
								if(rs.isBeforeFirst()) {
									while(rs.next()) {
										Vector v = new Vector();
										v.add(Long.toString(rs.getLong("id")));
										v.add(rs.getString("name"));
										v.add(rs.getString("address"));
										rowData.add(v);	
									}
								}
								else {
									JOptionPane.showMessageDialog(null, "查不到此人信息");
									return;
								}
							} catch (SQLException e1) {							
								e1.printStackTrace();
							}
						
						}
					
				});		
			}
			
			});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		//根据姓名查询
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6839\u636E\u59D3\u540D\u67E5\u8BE2");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameSearch nameSearch = new NameSearch();
				nameSearch.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (nameSearch.textField.getText().trim().equals("")){//判定文本框输入是否为空 
							JOptionPane.showMessageDialog(null, "您的输入为空");
							return;
						}
						String text =  nameSearch.textField.getText();
						String s[] =  {"id", "name", "address"};
						Vector rowData,columnNames;
						columnNames = new Vector();
						rowData =new Vector();
						columnNames.add("id");columnNames.add("name");columnNames.add("address");
						nameSearch.table_3 = new JTable(rowData,columnNames) {
							public boolean isCellEditable(int rowIndex, int ColIndex){
							     return false;
								}
						};
						nameSearch.scrollPane = new JScrollPane(nameSearch.table_3);
						nameSearch.scrollPane.setBounds(0, 85, 436, 166);
						nameSearch.table_3.setVisible(true);
						nameSearch.contentPane.add(nameSearch.scrollPane);
						String sNameSearch ="Select id,name,address from students where name like "+"\'"+"%"+text+"%"+"\'";
						System.out.println(sNameSearch);
				
						try {
							test.stmt = test.con.createStatement();
							ResultSet rs = test.stmt.executeQuery(sNameSearch);
							if(rs.isBeforeFirst()) {
								
								while(rs.next()) {
								Vector v = new Vector();
								v.add(Long.toString(rs.getLong("id")));
								v.add(rs.getString("name"));
								v.add(rs.getString("address"));
								rowData.add(v);	
							}
								}
							else {
								JOptionPane.showMessageDialog(null, "查不到此人信息");
								return;
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					}
				});		
			}
			
			});
		mnNewMenu.add(mntmNewMenuItem_1);

		
		
		//根据籍贯查询
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u6839\u636E\u7C4D\u8D2F\u67E5\u8BE2");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddressSearch address = new AddressSearch();
				address.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String addressText = (String)address.comboBox.getSelectedItem();
						
						Vector rowData,columnNames;
						columnNames = new Vector();
						rowData =new Vector();
						columnNames.add("id");columnNames.add("name");columnNames.add("address");
						address.table = new JTable(rowData,columnNames) {
							public boolean isCellEditable(int rowIndex, int ColIndex){
							     return false;
								}
						};
						address.scrollPane = new JScrollPane(address.table);
						address.scrollPane.setBounds(10, 113, 416, 140);
						address.contentPane.add(address.scrollPane);
						
						String S_address = "Select * from students where address like "+"\'"+"%"+addressText+"%"+"\'";

						try {
							test.stmt = test.con.createStatement();
							ResultSet rs = test.stmt.executeQuery(S_address);
							if(rs.isBeforeFirst()) {
								while(rs.next()) {
									Vector v = new Vector();
									v.add(Long.toString(rs.getLong("id")));
									v.add(rs.getString("name"));
									v.add(rs.getString("address"));
									rowData.add(v);	
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "该地区没有本校学生");
								return;
							}
						} catch (SQLException e1) {							
							e1.printStackTrace();
						}
					
						
					}
				});
				
				
				
			}
		});	
		mnNewMenu.add(mntmNewMenuItem_5);
		
		
		
		
		
		
		
		//添加
		JMenu mnNewMenu_1 = new JMenu("\u6DFB\u52A0");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u6DFB\u52A0\u4E00\u4E2A\u5B66\u751F");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				AddStudent add = new AddStudent();
				add.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {						
						if(!add.textField.getText().trim().equals("")&&!add.textField_1.getText().trim().equals(""))
						{
							String idText = add.textField.getText();
							String S_sql = "SELECT id FROM  students where id = "+idText;
							ResultSet rs;
							try {
								rs = test.stmt.executeQuery(S_sql);
								long id =Long.parseLong(idText);
								if(rs.isBeforeFirst()) {
									JOptionPane.showMessageDialog(null, "该学生已存在");
									return;
								}
								
								else if( id<100000000000l ||  id>300000000000l) {
									JOptionPane.showMessageDialog(null, "输入学号错误，请重新输入");
									return;
								}
								else {
									String nameText = add.textField_1.getText();
									String addressText = (String)add.comboBox.getSelectedItem();
									String I_sql = "Insert Into Students values("+id+",\'"+nameText+"\'"+",\'"+addressText+"\'"+")";
									test.stmt = test.con.createStatement();
									test.stmt.execute(I_sql);
									JOptionPane.showMessageDialog(null, "添加成功");
									return;
								}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
						else {
							JOptionPane.showMessageDialog(null, "请输入完整的学生信息");
							return;
						}
						}
				});
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		
		
		
		
		//删除
		JMenu mnNewMenu_2 = new JMenu("\u5220\u9664");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u5220\u9664\u4E00\u4E2A\u5B66\u751F");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent delete = new DeleteStudent();
				delete.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String idDelete = delete.textField.getText();
						if (delete.textField.getText().trim().equals("")){//判定文本框输入是否为空 
							JOptionPane.showMessageDialog(null, "您的输入为空");
							return;
						}
						int n = JOptionPane.showConfirmDialog(null, "您确定要删除id为"+idDelete+"的学生吗？", "Title",JOptionPane.YES_NO_OPTION); 
						if(n==0) {
						String D_sql = "Delete From Students Where id = "+idDelete;
						int flag = 0;
						try {
							String S_sql =  "SELECT id FROM  students where id = "+idDelete;
							ResultSet rs;
							rs = test.stmt.executeQuery(S_sql);
							if(!rs.isBeforeFirst()) {
								JOptionPane.showMessageDialog(null, "不存在此学生");
								return;
							}
							test.stmt=test.con.createStatement();
							flag = test.stmt.executeUpdate(D_sql); 
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(flag==1)
						JOptionPane.showMessageDialog(null, "删除成功", "Title",JOptionPane.WARNING_MESSAGE);
					}
						}
				});
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("\u4FEE\u6539\r\n");
		menuBar.add(mnNewMenu_3);

		
		
		
		
		
		//修改（有bug）
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u4FEE\u6539\u5B66\u751F\u4FE1\u606F");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent update = new UpdateStudent();
				update.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (update.textField.getText().trim().equals("")){//判定文本框输入是否为空 
							JOptionPane.showMessageDialog(null, "您的输入为空"); 
							return;
						}
						else {
							String updateId = update.textField.getText();
							String S_sql ="Select * from students where id = "+update.textField.getText();
							try {
								test.stmt = test.con.createStatement();
								ResultSet rs = test.stmt.executeQuery(S_sql);
								if(!rs.isBeforeFirst()) {
									JOptionPane.showMessageDialog(null, "不存在此学生");
									return;
								}
								if(rs.isBeforeFirst()) {
								Vector rowData,columnNames;
								columnNames = new Vector();
								rowData =new Vector();
								columnNames.add("id");columnNames.add("name");columnNames.add("address");
								update.table = new JTable(rowData,columnNames) {
									public boolean isCellEditable(int rowIndex, int ColIndex){
									     return false;
										}
								};
								update.scrollPane = new JScrollPane(update.table);
								update.scrollPane.setBounds(0, 85, 436, 80);
								update.table.setVisible(true);
								update.contentPane.add(update.scrollPane);		
									while(rs.next()) {
										Vector v = new Vector();
										v.add(Long.toString(rs.getLong("id")));
										v.add(rs.getString("name"));
										v.add(rs.getString("address"));
										rowData.add(v);	
									}
									
									//输入对话框
									String newAddress = (JOptionPane.showInputDialog(null,"请输入新地址","修改",1));
									while("".equals(newAddress)||newAddress ==null) {
										newAddress = (JOptionPane.showInputDialog(null,"请输入新地址","修改",1));
									}									
									if(isLetterDigit(newAddress)) {
										JOptionPane.showMessageDialog(null, "请输入正确的地址");
										return;
									}
									String U_sql = "UPDATE students set address = "+"\'"+newAddress+"\'"+" where id = "+ updateId;
									test.stmt.execute(U_sql);
									JOptionPane.showMessageDialog(null, "修改成功");									
								}
							}
							 catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
						}
						
						
						
					}
				});
				
			}
		});
		
		
		
		
		
		
		mnNewMenu_3.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u5B66\u751F\u7C4D\u8D2F\u4FE1\u606F\u8BB0\u5F55\u7C3F");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 32));
		lblNewLabel.setBounds(48, 10, 440, 124);
		contentPane.add(lblNewLabel);
		

		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(104, 105, 278, 53);
		contentPane.add(btnNewButton);
		
		
		
		//确定键打印所有人
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Vector rowData,columnNames;
				columnNames = new Vector();
				rowData =new Vector();
				columnNames.add("id");columnNames.add("name");columnNames.add("address");
				table = new JTable(rowData,columnNames) {
					public boolean isCellEditable(int rowIndex, int ColIndex){
					     return false;
						}
				};
				
				scrollPane = new JScrollPane(table);
//				scrollPane.setColumnHeaderView(table);
				scrollPane.setBounds(10, 168, 505, 174);
				table.setVisible(true);
				contentPane.add(scrollPane);
				try {
					test.stmt = test.con.createStatement();
					String  show = "Select * from students";
					ResultSet rs = test.stmt.executeQuery(show);
					while(rs.next()) {
						Vector v = new Vector();
						v.add(Long.toString(rs.getLong("id")));
						v.add(rs.getString("name"));
						v.add(rs.getString("address"));
						rowData.add(v);	
				}
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});

		
this.setVisible(true);
	}
	
}

















