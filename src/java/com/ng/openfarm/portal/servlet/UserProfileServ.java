/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;

import com.google.gson.Gson;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dto.FarmersDataModel;
import com.ng.openfarm.portal.dto.UserDataModel;
import com.ng.openfarm.portal.model.FarmerManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mutual-Links
 */
@WebServlet(name = "UserProfileServ", urlPatterns = {"/user.profile"})
public class UserProfileServ extends HttpServlet {
    UserDataModel userdto =  null;
    FarmerManager farmerManager = null;
    @Override
    public void init() throws ServletException {
        

            farmerManager =  new FarmerManager();
            userdto =  new UserDataModel();
//            dto = new BlogOwnerDataModel();            
//            blogmanager =  new BlogOwnerManager();
    }        
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Connection connection = OpenfarmConnect.Get_Connection();
            FarmersDataModel farmerDTO = new FarmersDataModel();
            
            String[] dataValues  = request.getParameterValues("dataString[]");
                  
            if(dataValues[0].equals("loadfarmer")){      
                
                if(dataValues[2].trim().equals("Farmer")){
               
                farmerDTO = farmerManager.getFarmerById(connection,SessionDAO.getAuIdBySession(connection, dataValues[1].trim()));
                       
                userdto.setSurname(farmerDTO.getSurname()); 
                userdto.setFirstName(farmerDTO.getFirstName()); 
                userdto.setLastName(farmerDTO.getMiddleName()); 
                userdto.setGender(farmerDTO.getGender()); 
                userdto.setPhoneNumber(farmerDTO.getPhoneNumber()); 
                userdto.setEmail(farmerDTO.getEmail()); 
                userdto.setContact(farmerDTO.getContact()); 
                userdto.setCity(farmerDTO.getCity()); 
                userdto.setState(farmerDTO.getStateId()); 
                userdto.setLGArea(farmerDTO.getLgAreaId()); 
                userdto.setWard(farmerDTO.getWard()); 
                userdto.setProfilePhoto(farmerDTO.getProfilePhoto()); 
                userdto.setPreferredLangauge(farmerDTO.getPrefered_language()); 
                userdto.setEducationLevel(farmerDTO.getEduction_level()); 
                userdto.setPhoneType(farmerDTO.getTelephone_type()); 
                userdto.setKinSurname(farmerDTO.getKinSurname()); 
                userdto.setKinName(farmerDTO.getKinOtherName()); 
                userdto.setKinPhone(farmerDTO.getKinPhoneNumber()); 
                userdto.setKinContact(farmerDTO.getKinConactAddress()); 
                userdto.setKinRelationShip(farmerDTO.getKinRelationShip()); 
                
                Gson gson = new Gson();
                String json = gson.toJson(userdto); 
                out.println(json);    
                System.out.println("farmer json:"+json);
                
                }else{
                    
                    
                }
                
                           
                                        
            }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(UserProfileServ.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
