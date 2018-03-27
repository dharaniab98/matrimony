package project;
import java.sql.*;

import javax.swing.JOptionPane;
public class Dbase {

	static Connection con=null;
	public static Connection dbconnector(){
	
	try{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kumar123","kumar123");
	JOptionPane.showMessageDialog(null,"connection sucess");
	return con;
	//con.close();
			}
		
	catch(Exception e){
		System.out.println(e);
		return null;
	}
	
	}
}
