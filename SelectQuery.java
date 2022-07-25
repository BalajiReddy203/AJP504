import java.sql.*;
public class SelectQuery
{
	public static void main(String args[])throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","admin");
	Statement stmt=con.createStatement();
	String sQuery="select *from Reddy";
	ResultSet rs=stmt.executeQuery(sQuery);
	int i=1;
	while(rs.next())
	   {
		System.out.println("-------------------------");
		System.out.println("Student Record:"+i);
		System.out.println("Name:"+rs.getString("name"));
		System.out.println("Branch:"+rs.getString("branch"));
		i++;
	   }
	}
}
