package com.ng.openfarm.portal.dao;

import com.google.gson.Gson;
import com.ng.openfarm.portal.dto.FarmersDataModel;
import com.ng.openfarm.portal.model.FarmerManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenfarmConnect {

        public static Connection Get_Connection(){
                Connection connection = null;
                
            try {
                String username = "openfarmdbmis";
                String password = "ZPsTN5xnzDq29TZW";        
                    String url = null;
                    try {	 
                        // Local MySQL instance to use during development.
                        Class.forName("com.mysql.jdbc.Driver");
                         url = "jdbc:mysql://mysql124614-opnfarmng.j.layershift.co.uk/opscloudsqldbmis";
                    } catch (Exception e) {
                      e.printStackTrace();
                    }		
                        
                connection = DriverManager.getConnection(url,username,password); 
            } catch (SQLException ex) {
                Logger.getLogger(OpenfarmConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
                return connection;
        }	
    
//	public static Connection Get_Connection() throws Exception
//	{
//	try
//	{
//            
//            String username = "openfarm";
//            String password = "Utp6uyBmCVMbD6EW";            
//	   Connection connection = null;
//	    String url = null;
//	    try {
//
//	        Class.forName("com.mysql.jdbc.Driver");
//	        url = "jdbc:mysql://localhost:3306/opscloudsqldb2";
//	    } catch (Exception e) {
//	      e.printStackTrace();
//	    }		
//		
//		
//	connection = DriverManager.getConnection(url,username,password); 
//	return connection;
//	}
//	catch (SQLException e)
//	{
//	throw e;
//	}
//	catch (Exception e)
//	{
//	throw e;
//	}
//	}	

	
////	public static void main(String[] args) {
////		
//////		Database dao = new Database();
////		
////     try {
//////		System.out.println("Connection:"+dao.Get_Connection());
////                FarmerManager manager = new FarmerManager();
////                FarmersDataModel dto = manager.getFarmerById(Get_Connection(), "OPN/AUT/2016/947162808");
////                Gson gson = new Gson();
////                String json = gson.toJson(dto); 
////                    System.out.println("farmer json:"+json);                
////	} catch (Exception e) {
////		e.printStackTrace();
////	}
////
////	}

}