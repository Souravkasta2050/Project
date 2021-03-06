package com.cg.bank.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {

	public static Connection getConnection() throws SQLException {

		InitialContext icontext;
		DataSource ds;
		Connection con = null;
		try {
			icontext = new InitialContext();
			ds = (DataSource) icontext.lookup("java:/oracleDs");
			con = ds.getConnection();
			return con;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
