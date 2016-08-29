/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutual-Links
 */
public class SessionDAO {
  
    
    public static int addNewSession(Connection connect,String session_id,String user_id,String lastvisit,int hitcount){
                  
        int status = -1;
        PreparedStatement ps = null;

        try {
            String query = "insert into sessions  values(?,?,?,?)";
            ps = connect.prepareStatement(query);
            ps.setString(1, session_id);
            ps.setString(2, user_id);
            ps.setString(3, lastvisit);
            ps.setInt(4, hitcount);
            status = ps.executeUpdate();
            
            if(status>-1){
                status = 0;
            }        
        } catch (SQLException ex) {
            Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{

              if(ps!= null){
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connect!=null){
                  try {
                      connect.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }

        }
                    
        return status;

    }
    
    public static int updateSession(Connection connect,String lastVisit,int hitcount,String userId){
                  
        int status = -1;
        PreparedStatement ps = null;

        try {
            String query = "update  sessions   set last_visit=?,hit_count=? where user_id=? ";
            ps = connect.prepareStatement(query);
            ps.setString(1, lastVisit);
            ps.setInt(2, hitcount);
            ps.setString(3, userId);
            status = ps.executeUpdate();
            
            if(status>-1){
                status = 0;
            }        
        } catch (SQLException ex) {
            Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{

              if(ps!= null){
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connect!=null){
                  try {
                      connect.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }

            }
                    
        return status;

    }
    
    public static int updateSessionId(Connection connect,String sessionId,String lastVisit,int hitcount,String userId){
                  
        int status = -1;
        PreparedStatement ps = null;

        try {
            String query = "UPDATE `opscloudsqldb2`.`sessions` SET `session_id` = ?, `last_visit`=?, \n" +
                           "`hit_count` =? WHERE CONVERT( `sessions`.`session_id` USING utf8 ) = ?";
            ps = connect.prepareStatement(query);
            ps.setString(1, sessionId);
            ps.setString(2, lastVisit);
            ps.setInt(3, hitcount);
            ps.setString(4, userId);
            status = ps.executeUpdate();
            
            if(status>-1){
                status = 0;
            }        
        } catch (SQLException ex) {
            Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{

              if(ps!= null){
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connect!=null){
                  try {
                      connect.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }

            }
                    
        return status;

    }
    public static String getAuIdBySession(Connection connect,String session){
         String authId = "";
         String query = "SELECT  user_id FROM sessions WHERE session_id=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, session);

             result = ps.executeQuery();
             if(result.next()){
                 
                authId = result.getString("user_id");
            	 
             }    

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return authId;
     }    
    
    public static String getSessionData(Connection connect,String userId){
        String session = "";
        String query = "SELECT*FROM sessions WHERE user_id=?";
        PreparedStatement ps = null;
        ResultSet result = null;
        try {

           ps = connect.prepareStatement(query);
           ps.setString(1, userId);
           
            result = ps.executeQuery();
            if(result.next()){
                
                session = result.getString("session_id");
            }            
            
        }catch (Exception ex) {
            Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{

          if(ps!= null){
              try {
                  ps.close();
              } catch (SQLException ex) {
                  Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
              }

          }

        }
        return session;
    }
    public static int getLastHit(Connection connect,String userId){
        int status = 0;
        String query = "SELECT hit_count FROM sessions WHERE user_id=?";
        PreparedStatement ps = null;
        ResultSet result = null;
        try {

           ps = connect.prepareStatement(query);
           ps.setString(1, userId);
            result = ps.executeQuery();
            if(result.next()){
                
                status = result.getInt("hit_count"); 
            }            
            
        }catch (Exception ex) {
            Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{

          if(ps!= null){
              try {
                  ps.close();
              } catch (SQLException ex) {
                  Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
              }

          }

        }
        return status;
    }
//    public static void main(String args[]){
//        
//        int status = checkSessionData("US23216"); 
//        System.out.println("status: "+status);
//                 
//
//
//    }      
}
