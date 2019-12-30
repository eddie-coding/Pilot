import java.sql.*;
public class DemoClass 
{

	public static void main(String[] args)throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/companydb";
		String uname="root";
		String pass="";
		String query="select fname from employee where dno=5";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		String name=rs.getString("fname");
		System.out.println(name);
		}
		st.close();
		con.close();
	}
	
}
