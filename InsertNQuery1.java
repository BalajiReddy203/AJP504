import java.sql.*;
import java.util.*;
public class InsertNQuery1
{
 public static void main(String args[]) throws Exception
 {
  Connection con=null;
  PreparedStatement pstmt=null;
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
   pstmt=con.prepareStatement("insert into Reddy values(?,?)");
   System.out.println("Enter 5 records");
   Scanner sc=new Scanner(System.in);
   int i=1;
   while(i<=5)
   {
    System.out.println("Enter Name");
	String sname=sc.next();
	System.out.println("Enter Branch");
	String sbranch=sc.next();
	pstmt.setString(1,sname);
	pstmt.setString(2,sbranch);
	int x=pstmt.executeUpdate();
	if(x>0)
	  System.out.println(x+"Rows inserted");
	i++;
	}
  }
  
 catch(ClassNotFoundException ae)
{
 ae.printStackTrace();
}	
catch(SQLException e)
{
 e.printStackTrace();
}
finally
{
try{
con.close();
pstmt.close();	 
 }
 catch(SQLException e)
{
 e.printStackTrace();
}
}
 }
}

