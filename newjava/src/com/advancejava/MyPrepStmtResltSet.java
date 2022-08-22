package com.advancejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyPrepStmtResltSet {
	 
	public static void main(String a[]){
	         
	        Connection con = null;
	        PreparedStatement prSt = null;
	        ResultSet rs = null;
	        try {
	        	
	        	
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.
	                    getConnection("jdbc:oracle:thin:@localhost:8080:sampleDB"
	                        ,"testuser","12345");
	            String query = "select * from emp where empid=?";
	            prSt = con.prepareStatement(query);
	       
	            prSt.setInt(1, 1016);
	            rs = prSt.executeQuery();
	            while(rs.next()){
	                System.out.println(rs.getString("name")+" -- "+rs.getInt("salary"));
	            }
	            rs.close();
	         
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally{
	            try{
	                if(rs != null) rs.close();
	                if(prSt != null) prSt.close();
	                if(con != null) con.close();
	            } catch(Exception ex){}
	        }
	    }

}
