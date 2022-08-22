package com.advancejava;
import java.sql.*;

public class InsertRec {



		public static void main(String[] args) {
			try {
	            //step1:loading the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				System.out.println("DRIVERS LOADED...");
				
				//step 2: obtaining the connection
				Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "scott", "tiger");
				System.out.println("CONNECTION ESTABLISHED...");
				Statement st = con.createStatement();

				//step 3 : executing query
				ResultSet rs = st.executeQuery("Select * from Students");
				
				//step 4: processing the resutset
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}
				
				
				//Step 5: closing the connection
				con.close();
			} catch (Exception e) {
				System.out.println("DRIVER CLASS NOT FOUND...");
			}
		}
	
}
