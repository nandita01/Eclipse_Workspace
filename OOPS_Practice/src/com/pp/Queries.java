package com.pp;

import java.sql.*;
public class Queries
{
	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/prestigepoint","root","1234");
		Statement st = con.createStatement();
		int res = st.executeUpdate("update department set dname='Nandita' where did=7");
		System.out.println(res);
		}
}
