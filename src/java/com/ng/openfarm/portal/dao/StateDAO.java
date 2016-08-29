/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MUTUALINKS
 */
public class StateDAO {
  	public static ResultSet loadState(){
        ResultSet result = null;
        Connection connection = null;
        Statement st = null;
        try {

                 connection = OpenfarmConnect.Get_Connection();
                 st = connection.createStatement();
                result = st.executeQuery("SELECT * FROM states");

                }catch(Exception e){

                }	

			return result;
	    }
	public static String getLGAreaName(Connection connection ,String areaId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT lga FROM lgas WHERE lgas_id=?");
			 ps.setString(1, areaId); 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("lga"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	}
	public static String getStateName(Connection connection,String stateId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT state FROM states WHERE state_id=?");
			 ps.setString(1, stateId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("state"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	
	public static String getLgvtName(Connection connection,String lgId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT lga FROM lgas WHERE lgas_id=?");
			 ps.setString(1, lgId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("lga"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	
	public static String getWardName(Connection connection,String wardId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT ward FROM wards WHERE ward_id=?");
			 ps.setString(1, wardId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("ward"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	
	public static ResultSet loadWards(String lgId){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
				
                         connection = OpenfarmConnect.Get_Connection();
                         st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM wards WHERE lga_id ='"+lgId+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }  
	  	
	public static ResultSet loadLGArea(String stateId){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
				
                         connection = OpenfarmConnect.Get_Connection();
                         st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM lgas WHERE state_id ='"+stateId+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }  
	        
  	
}
