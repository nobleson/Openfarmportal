/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.Base64;

/**
 *
 * @author Mutual-Links
 */
public class CamPhotoHandllerServ extends HttpServlet {
    private  String filePath;
    String userHomeDir = System.getProperty("user.home");
    
    public void init() throws ServletException {

        // Define base path somehow. You can define it as init-param of the servlet.
        this.filePath = userHomeDir+File.separator +"cloudbucket"+File.separator+"portal_images";
         File f = new File(filePath); 

            if(!f.exists()){

                f.mkdirs();
            }
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CamPhotoHandllerServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CamPhotoHandllerServ at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
            String[] dataValues  = request.getParameterValues("dataString[]");    
            String name = new SimpleDateFormat("SSSssmmHHddMMyy").format(new Date());
            String imageName = "profile_"+name+".jpg";            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();  
            int status  = Base64.decodeToFile(dataValues[1],filePath + File.separator + imageName);

           if(status==0){
               
//                String encodedString =  Base64.encodeFromFile(filePath + File.separator + imageName+".jpg");
                out.println(imageName); 
////                deleteTextConfig(name+".jpg"); 
           }else{
               
               System.out.println("could not decode this file: ");
           }
    }
    
    public  void deleteTextConfig(String fileName){
        
         Path pathToUploadFile = FileSystems.getDefault().getPath(filePath+File.separator+fileName);
        try {
            
            Files.deleteIfExists(pathToUploadFile);
            System.out.println("File is successfully deleted");
            
        } catch (IOException ex) {
            
            Logger.getLogger(CamPhotoHandllerServ.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not deleted");
        }
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
