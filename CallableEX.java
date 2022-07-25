import java.sql.*;
public class CallableEx
{
 public static void main(String args[])throws Exception
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
   String sql="{call getBranch(?,?)}";
   CallableStatement cstmt=con.prepareCall(sql);
   cstmt.setString(1,"Madhu");
   cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
   cstmt.execute();
   String branch=cstmt.getString(2);
   System.out.println("Madhu branch is:"+branch);
  }
  catch(Exception e)
  {
  e.printStackTrace();
  }
 }
}
