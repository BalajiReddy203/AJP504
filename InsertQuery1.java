import java.sql.*;
public class InsertQuery1
{
	public static void main(String args[])throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","admin");
	Statement stmt=con.createStatement();
	String iQuery="insert into Reddy(name,branch)values('Balaji','cse')";
	int i=stmt.executeUpdate(iQuery);
	if(i>0)
		System.out.println(i+" rows inserted");
}
}
