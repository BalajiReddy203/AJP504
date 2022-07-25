import java.sql.*;
public class UpdateQuery
{
	public static void main(String args[])throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","admin");
	Statement stmt=con.createStatement();
	String iQuery="Update Reddy set branch='cse' where name='Balaji Reddy'";
	int i=stmt.executeUpdate(iQuery);
	if(i>0)
		System.out.println(i+" rows updated");
}
}
