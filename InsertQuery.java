import java.sql.*;
public class InsertNQuery
{
	public static void main(String args[])throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","admin");
	PreparedStatement pstmt=con.prepareStatement("insert into Reddy values(?,?,?,?,?)");
	Scanner sin=new Scanner(System.in);
	System.out.println("Enter 5 records to insert");
	int i=0;
	while(i<5)
	  {
		System.out.println("Enter Record:"+i);
		System.out.println("Enter Roll");
		String sroll=sin.next();
		System.out.println("Enter Name");
		String sname=sin.next();
		System.out.println("Enter Branch");
		String sbranch=sin.next();
		System.out.println("Enter Gender");
		String sgender=sin.next();
		System.out.println("Enter Address");
		String saddress=sin.next();
		pstmt.setString(1,sroll);
		pstmt.setString(2,sname);
		pstmt.setString(3,sbranch);
		pstmt.setString(4,sgender);
		pstmt.setString(5,saddress);
		int x=pstmt.executeUpdate();
		if(x>0)
			System.out.println(x+"Rows inserted");
		i++;
	  }
    }	
}
