import java.sql.*;
import java.util.*;
public class SetAuto
{
public static void main (String args[])throws Exception
{
     Connection con=null;
     Statement stmt=null;
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
     stmt=con.createStatement();
	 String uQuery="update student787 set branch='CSE'where name='Madhu'";
	 int i=stmt.executeUpdate(uQuery);
	 if(i>0)
	 {
	  System.out.println(i+"Rows updated");
	 }
}
}
