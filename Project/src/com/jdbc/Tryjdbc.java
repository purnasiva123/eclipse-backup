package com.jdbc;
import java.sql.*;
public class Tryjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			String url = "jdbc:mysql://localhost:3306/PURNA";
			Connection connection = DriverManager.getConnection(url, "root", "Purna@123");
			Statement statement = connection.createStatement();
//			int res = statement.executeUpdate("insert into account values(1,'kumar','raj',10000)");
			int res = statement.executeUpdate("delete into purna1 from values(4,'dfg','asdf',1200)");
			
//			ResultSet rs = statement.executeQuery("select * from account");
//			while(rs.next())
//			{
//				System.out.println(rs.getString("lastname"));
//				System.out.println(rs.getString("firstname"));
//			}
			
			System.out.println(res + "rows affected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
