package com.pp;
import java.sql.*;
import java.lang.*;


public class JDBDEMO {
	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/prestigepoint","root","1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select eid,ecode,ename from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getInt(2)+ " " +rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
	}
}


