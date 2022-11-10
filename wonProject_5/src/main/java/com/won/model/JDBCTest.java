package com.won.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testConnection() {

		try (Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tigger")) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
