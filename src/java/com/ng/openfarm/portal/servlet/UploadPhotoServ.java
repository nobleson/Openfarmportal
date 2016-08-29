/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Mutual-Links
 */
public class UploadPhotoServ extends HttpServlet {
    private  String filePath;
    String userHomeDir = System.getProperty("user.home");

    // Actions ------------------------------------------------------------------------------------

        @Override
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
            out.println("<title>Servlet UploadPhotoServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UploadPhotoServ at " + request.getContextPath() + "</h1>");
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
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
           response.setContentType("text/html;charset=UTF-8");
            String name = new SimpleDateFormat("SSSssmmHHddMMyy").format(new Date());
            String imageName = "profile_"+name+".jpg";
            PrintWriter out = response.getWriter();
        if (isMultipart) {
                System.out.println("isMultipart");
                // Create a factory for disk-based file items
                FileItemFactory factory = new DiskFileItemFactory();

                // Create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);
                try {
                // Parse the request
                List<FileItem> multiparts = upload.parseRequest(request);
                File file = new File(filePath + File.separator +imageName);
                
                for (FileItem item : multiparts) {
                if (!item.isFormField()) {
                String fileName = new File(item.getName()).getName();
                System.out.println("file old name:"+fileName);
                
                item.write(file);      
                out.print(file.getName()); 
                System.out.println("file new name:"+file.getName());
                }
                }
                } 
                catch (Exception e) 
                {
                  e.printStackTrace();
                }
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
