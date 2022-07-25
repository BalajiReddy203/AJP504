import java.sql.*;
public class DeleteQuery
{
	public static void main(String args[])throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","admin");
	Statement stmt=con.createStatement();
	String iQuery="delete from Reddy where branch='cse'";
	int i=stmt.executeUpdate(iQuery);
	if(i>0)
	System.out.println(i+"Rows deleted");
	}
}
	
