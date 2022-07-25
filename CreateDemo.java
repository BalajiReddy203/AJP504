//CreateDemo.java
import java.sql.*;
 public class CreateDemo{
	public static void main(String args[]) throws Exception{
		Connection con=null;
		Statement stmt=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			stmt=con.createStatement();
			if(stmt!=null)
			{
			String sqlquery="Create table aitsannualdaycell(Roll varchar(15),name varchar(15),branch varchar(15),event varchar(15),concept varchar(50),Gmember1 varchar(15))";
			stmt.executeUpdate(sqlquery);
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();	
		}
		catch(SQLException ne)
		{
			ne.printStackTrace();	
		}
		finally{
			try
			{	
			stmt.close();
			con.close();
			}
			catch(SQLException e)
		{
			e.printStackTrace();	
		}
		}
	}
}
