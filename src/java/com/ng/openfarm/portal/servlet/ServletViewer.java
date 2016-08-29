/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dao.SessionDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Mutual-Links
 */
public class ServletViewer extends HttpServlet {
    private  String filePath;
    String userHomeDir = System.getProperty("user.home");
    private static final String AUTH_PREFIX = "AUT"; 
    private static final String OPENFARM_PREFIX = "OPN"; 
    private static String AUTH_CODE = ""; 
    private static String REG_YEAR = ""; 
    
    // Actions ------------------------------------------------------------------------------------

    public void init() throws ServletException {

        this.filePath = userHomeDir+File.separator +"cloudbucket"+File.separator+"report";
            REG_YEAR = new SimpleDateFormat("yyyy").format(new Date());
            AUTH_CODE = OPENFARM_PREFIX+"/"+AUTH_PREFIX+"/"+REG_YEAR+"/";
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
        try {
              Connection connection = OpenfarmConnect.Get_Connection();
              HashMap parameters=new HashMap();
              String farmerId = "";
              String vc_user = (String)request.getParameter("q");

                String authId = SessionDAO.getAuIdBySession(connection,vc_user);
                farmerId = FarmerDAO.getFarmerId(connection, authId); 
                parameters.put("FarmerID",farmerId);
                InputStream input  = new FileInputStream(new File(filePath+File.separator+"farmeridcard.jrxml"));
                JasperReport jasperReport = JasperCompileManager.compileReport(input);
                JasperPrint jasperprint  = JasperFillManager.fillReport(jasperReport, parameters, connection);
                JasperExportManager.exportReportToPdfStream(jasperprint,response.getOutputStream());
                response.getOutputStream().flush();
                response.getOutputStream().close();                
            


        } catch (Exception ex) {
            Logger.getLogger(ServletViewer.class.getName()).log(Level.SEVERE, null, ex);
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
  try {
      
          processRequest(request, response); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    
                
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
