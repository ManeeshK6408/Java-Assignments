import java.io.*;
import java.sql.*;
public class Test {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String filename = "c:/db1.mdb";
			String database = "jdbc:odbc:Driver= {Microsoft Access Driver(*.mdb)};DBQ=";
			database+=filename.trim()+";DriverID=22;READONLY=true}";
			Connection con = DriverManager.getConnection(database,"","");
			Statement s = con.createStatement();
			s.execute("create table TEST12345(firstcolumn integer)");
			s.execute("insert into TEST12345 values(1)");
			s.execute("select firstcolumn from TEST12345");
			ResultSet rs = s.getResultSet();
			if(rs!=null)
				while(rs.next())
				{
					System.out.println("Data from column name: "+rs.getString(1));
				}
			s.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
