import java.sql.*;
public class BatchUpdate
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
con.setAutoCommit(false);
Statement stmt=con.createStatement();
String q1="insert into student787 values('shiv','EEE')";
stmt.addBatch(q1);
String q2="insert into student787 values('Nandy','AIDS')";
stmt.addBatch(q2);
String q3="update student787 set branch='CSE' where name='lucy'";
stmt.addBatch(q3);
stmt.executeBatch();
con.commit();
}
}
