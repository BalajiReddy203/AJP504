import java.sql.*;
public class DeleteRow
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
String sQuery="select name,branch from student787";
ResultSet rs=stmt.executeQuery(sQuery);
rs.last();
rs.deleteRow();
rs.beforeFirst();
System.out.println("Give the records after deletion");
while(rs.next())
{
System.out.println(rs.getString("name")+"\t"+rs.getString("branch"));
}
}
}
//output
D:\2cseb-5A3\jdbc5A3>javac DeleteRow.java

D:\2cseb-5A3\jdbc5A3>java DeleteRow
Give the records after deletion
MadhuGaruGaru   CSE
Shiv    EEE
NanduGaruGaru   CSE
saiGaruGaru     CSE
Triut   EEE
Murali  ECE
Chinnu  ECE
Megna   Mech
Nandu   ECE
Murali  ECE
lucyGaruGaru    CSE
Megna   Mech
Truit   EEE
shiv    EEE
Nandy   AIDS
