package project;
import java.sql.*;
public class EXample {
	public static void main(String[] args) {
		//System.out.println("helloo");	
try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kumar123","kumar123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from register");
		while(rs.next()){
			//System.out.println("hello");
			System.out.println(""+rs.getString(1)+""+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(7));

		}
		
		con.close();
}catch(Exception e){
	System.out.println(e);
}

	}

}
