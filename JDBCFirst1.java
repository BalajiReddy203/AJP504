import java.sql.*;
public class JDBCFirst1{
	static final String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	static final String dbURL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="system";
	static final String pass="admin";
	public static void main(String[] args) throws Exception{
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName(jdbcDriver);
			System.out.println("Connecting to database....");
			conn=DriverManager.getConnection(dbURL,user,pass);
			System.out.println("Creating table....");
			stmt=conn.createStatement();
			if(stmt!=null){
				System.out.println("Connection established");
				String sqlq="create table Reddy("+"name varchar(20),"+"branch varchar(20))";
				stmt.executeUpdate(sqlq);
				System.out.println("Table created succesfully..");
		
			}
			
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		System.out.println("Goodbye!....");
	}
}
