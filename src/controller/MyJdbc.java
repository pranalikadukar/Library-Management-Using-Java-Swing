package controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.jar.Attributes.Name;

import javax.swing.table.TableModel;

import java.sql.ResultSetMetaData;

import model.Library;



public class MyJdbc {
	public static Connection getConnect() throws ClassNotFoundException, SQLException
	{
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		//step 2
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","abc123");
		
		return con;
	}
	
	
     public static int insert(int id,String name,String passward,String email,String address,String city,String contact) throws ClassNotFoundException, SQLException
	{
    	 Connection con=getConnect();
		
	       PreparedStatement pr = con.prepareStatement("insert into lirarian (id, name, passward, email, address, city, contact) values(?,?,?,?,?,?,?)");
	      pr.setInt(1, id);
	       pr.setString(2, name);
	       pr.setString(3, passward);
	       pr.setString(4, email);
	       pr.setString(5, address);
	       pr.setString(6, city);
	       pr.setString(7, contact);
	       //step 4
		      int a = pr.executeUpdate();
				//step 5
				con.close();
		
		return a;
		
	}
     public static int delete(int id) throws ClassNotFoundException, SQLException {
    	 int b=0;
    	 Connection con = getConnect();
    	 PreparedStatement pr = con.prepareStatement("delete from lirarian where id=?");
    	 pr.setInt(1, id);
    	  b = pr.executeUpdate();
			//step 5
			con.close();
	
    	 
    	 return b;
		
	}
     public static TableModel View() throws ClassNotFoundException, SQLException {
    	 Connection con = getConnect();
    	 PreparedStatement pr = con.prepareStatement("select * from lirarian l",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    	 ResultSet rs=pr.executeQuery();
    	 ResultSetMetaData rsmd=rs.getMetaData();
    	 rsmd.getColumnCount();
		return null;
		
		
	}
     public static boolean validate(String name, String passward) {
    	 boolean status = false;
		Connection con;
		try {
			con = getConnect();
			PreparedStatement pr = con.prepareStatement("select * from librarian where name=? ");
	    	 pr.setString(1, name);
	    	 pr.setString(2, passward);
	    	 ResultSet rs = pr.executeQuery();
	    	 status = rs.next();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
    	 
		
		
	}
    

}







