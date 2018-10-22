package com.kumar.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kumar.Util.DBConnections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DBConnections DBcon = new DBConnections();
		
		Connection  Dbcon = DBConnections.getCon();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = Dbcon.prepareStatement("select * from customer");
			rs = ps.executeQuery();
			while (rs.next())
			{
				System.out.println(" * "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
