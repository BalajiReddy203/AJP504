import java.sql.*;
public class InsertResult
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
String sQuery="select name,branch from student787";
ResultSet rs=stmt.executeQuery(sQuery);
int i=1;
rs.beforeFirst();
rs.moveToInsertRow();
rs.updateString("name","Navya");
rs.updateString("branch","AIML");
rs.insertRow();
//con.commit();
}
}
