package test1;
import java.sql.*;
import java.util.ArrayList;
class Test_Student {
	public static ArrayList<Student> stu =new ArrayList<Student>();
    String driver="org.hsqldb.jdbcDriver";
    String url="jdbc:hsqldb:hsql://localhost";
    String user ="sa";
    String pass ="";
    Connection con=null;
    Statement stmt;
    public void init()throws Exception{
        if (con!=null)return;
        Class.forName(driver);
        con = DriverManager.getConnection(url,user,pass);
    }
    public void close() throws Exception {
        if(con!=null)
            con.close();
    }
    public void initTable()throws SQLException{
        String sql="create table students(id bigint,name varchar(30),address varchar (30))";
        stmt =con.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }
    public Test_Student() throws Exception {
    	init();
    	stmt= con.createStatement();
    	ResultSet rs = stmt.executeQuery("Select * from students");
    	while(rs.next()) {
    		long id = rs.getLong("id");
        	String name = rs.getString("name");
        	String address =rs.getString("address");
        	Student student = new Student(id,name,address);
//        	System.out.println(id+" "+name+" "+address); 
        	stu.add(student);
    	}
    }   
}
class Student{
    long id;
    String name;
    String address;
    Student(long id,String name,String address){
    	this.id=id;
    	this.name =name;
    	this.address=address;
    }
}