import java.sql.*;
public class UpdateResult
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
while(rs.next())
{
  if((rs.getString("branch")).equals("CSE"))
   {
    String newName =rs.getString("name")+"Garu";
    rs.updateString("name",newName);
    rs.updateRow();
}
}
rs.beforeFirst();
System.out.println("name \t\t\t\t branch");
while(rs.next())
{
System.out.println(rs.getString("name")+"\t"+rs.getString("branch"));
}
}
}
//output
D:\2cseb-5A3\jdbc5A3>javac UpdateResult.java

D:\2cseb-5A3\jdbc5A3>java UpdateResult
name             branch
MadhuGaru       CSE
Shiv    EEE
NanduGaru       CSE
saiGaru CSE
Triut   EEE
Murali  ECE
Chinnu  ECE
Megna   Mech
Nandu   ECE
Murali  ECE
lucyGaru        CSE
Megna   Mech
Truit   EEE
shiv    EEE
Nandy   AIDS
NavyaGaruGaru   AIML
