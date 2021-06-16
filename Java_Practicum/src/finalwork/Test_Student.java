package finalwork;
import java.sql.*;
public class Test_Student {

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
    public void menu() throws Exception{
        init();
        close();
    }
    public void nameSearch(String name){

    }
    public void idSearch(String id){

    }
    public void add(){

    }
    public void delete(){

    }
    public void update(){

    }
    public static void main(String args[]) throws Exception {
        Test_Student test =new Test_Student();
    }

}
class Student{
    String id;
    String name;
    String address;
}