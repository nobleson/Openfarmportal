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
 * @author Mutual-Links
 */
public class ValueChainDAO {
    
      	public static ResultSet loadGroups(){
        ResultSet result = null;
        Connection connection = null;
        Statement st = null;
        try {

                 connection = OpenfarmConnect.Get_Connection();
                 st = connection.createStatement();
                result = st.executeQuery("SELECT * FROM groups");

                }catch(Exception e){

                }	

			return result;
	    }
        
	  	
	public static ResultSet loadGroupByValueChain(String valuechain){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
//                         System.out.println("value chain:"+valuechain);	
                        connection = OpenfarmConnect.Get_Connection();
                        st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM groups WHERE 	value_chain  ='"+valuechain+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }  
        	public static String getGroupName(Connection connection,String groupId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT * FROM groups WHERE group_id=?");
			 ps.setString(1, groupId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("groupName"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	
	  	
	public static ResultSet loadMembersByGroup(String group){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
				
                         connection = OpenfarmConnect.Get_Connection();
                         st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM group_members WHERE group_id  ='"+group+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }  
	                
}
