package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Login_sql {
	String driver="org.hsqldb.jdbcDriver";
    String url="jdbc:hsqldb:hsql://localhost";
    String user ="sa";
    String pass ="";
    Connection con=null;
    Statement stmt;
    ResultSet rs;
    public void init()throws Exception{
        if (con!=null)return;
        Class.forName(driver);
        con = DriverManager.getConnection(url,user,pass);
    }
    public void close() throws Exception {
        if(con!=null)
            con.close();
    }
    public Login_sql() throws Exception {
    	init();
    }
}
