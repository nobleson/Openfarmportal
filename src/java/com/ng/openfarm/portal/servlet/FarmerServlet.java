/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;


import com.google.gson.Gson;
import com.ng.openfarm.portal.dao.AuthenticationDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dto.AuthenticationDataModel;
import com.ng.openfarm.portal.dto.FarmersDataModel;
import com.ng.openfarm.portal.model.AuthenticationManager;
import com.ng.openfarm.portal.model.FarmerManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.RandomStringUtils;

/**
 *
 * @author Mutual-Links
 */
public class FarmerServlet extends HttpServlet {
//    private  String filePath;
//    String userHomeDir = System.getProperty("user.home");
    private static final String FARMER_PREFIX = "FMR"; 
    private static final String AUTH_PREFIX = "AUT"; 
    private static final String OPENFARM_PREFIX = "OPN"; 
    private static String REG_YEAR = ""; 
    private static String REG_CODE = ""; 
    private static String AUTH_CODE = ""; 
    FarmerManager farmerManager = null;
    public void init() throws ServletException {

        // Define base path somehow. You can define it as init-param of the servlet.
//        this.filePath = userHomeDir+File.separator +"cloudbucket"+File.separator+"photo_upload";
//         File f = new File(filePath); 
//
//            if(!f.exists()){
//
//                f.mkdirs();
//            }
//          
            farmerManager = new FarmerManager();
            REG_YEAR = new SimpleDateFormat("yyyy").format(new Date());
            REG_CODE = OPENFARM_PREFIX+"/"+FARMER_PREFIX+"/"+REG_YEAR+"/";
            AUTH_CODE = OPENFARM_PREFIX+"/"+AUTH_PREFIX+"/"+REG_YEAR+"/";
            
            
        // In a Windows environment with the Applicationserver running on the
        // c: volume, the above path is exactly the same as "c:\files".
        // In UNIX, it is just straightforward "/files".
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
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
        try {

                    /* TODO output your page here. You may use following sample code. */
                    Connection connection = OpenfarmConnect.Get_Connection();
                    String[] dataValues  = request.getParameterValues("dataString[]");
                    
                    if(dataValues[0].equals("loadfarmers")){    
                try {
                    ArrayList farmerArrayList =  null;
                    farmerArrayList = farmerManager.getAllFarmers(connection);
                    Gson gson = new Gson();
                    String json = gson.toJson(farmerArrayList);        
                    out.println(json);        
//                    System.out.println("json:"+json);
                    
                } catch (Exception ex) {
                    Logger.getLogger(FarmerServlet.class.getName()).log(Level.SEVERE, null, ex);
                }                        
                    }    
                    
                    if(dataValues[0].equals("phonecheck")){        
                    int status = AuthenticationDAO.checkPhoneNumber(connection, dataValues[1].trim());

                        if(status==0){

                        out.println("Invalid"); 

                        }else{
                         out.println("Valid"); 
                        }                    
               
                    }
                    
        } catch (Exception ex) {
            Logger.getLogger(FarmerServlet.class.getName()).log(Level.SEVERE, null, ex);
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
		
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try { 
            /* TODO output your page here. You may use following sample code. */
            Connection connection = OpenfarmConnect.Get_Connection();
            System.out.println("Connection:"+connection);
            AuthenticationManager authmodel = new AuthenticationManager();
            AuthenticationDataModel authdto = new AuthenticationDataModel();
            FarmersDataModel famerdto = new FarmersDataModel();
	    FarmerManager famermodel = new FarmerManager();
            String name = new SimpleDateFormat("SSSssHHddMMyy").format(new Date());
//            File file = new File(filePath + File.separator + name+".jpg");
            String[] dataValues  = request.getParameterValues("dataString[]");
            
            if(dataValues[0].equals("insert")){        

            String OTP = generatePassword();
            String authPin = new SimpleDateFormat("SSSHHddMM").format(new Date());
            String farmerId = new SimpleDateFormat("SSSHHddMM").format(new Date());
    	    String authId =  AUTH_CODE+authPin; 
    	    String farmerReg = REG_CODE+farmerId; 
    	    long epoch = 1L;
    	    String dateModified = "";  
            epoch = System.currentTimeMillis()/1000;
	    dateModified = String.valueOf(epoch);  
            System.out.println("Recieved data: "+dataValues.length);
//            Base64.decodeToFile(dataValues[21],file.getAbsolutePath()); 
            authdto.setAuthId(authId); 
            authdto.setRoleId(AuthenticationDAO.getFarmerRoleCode());
            authdto.setUserId(dataValues[5]);
            authdto.setEmail(dataValues[6]); 
            authdto.setPassword(OTP); 
            authdto.setLoginStatus("0"); 
            authdto.setRecordDate(dateModified); 

            famerdto.setFarmerId(farmerReg);
            famerdto.setSurname(dataValues[1]);
            famerdto.setFirstName(dataValues[2]);
            famerdto.setMiddleName(dataValues[3]);
            famerdto.setGender(dataValues[4]);
            famerdto.setPhoneNumber(dataValues[5]);
            famerdto.setTelephone_type(dataValues[7]); 
            famerdto.setContact(dataValues[8]);
            famerdto.setCity(dataValues[9]);
            famerdto.setPrefered_language(dataValues[10]);
            famerdto.setEduction_level(dataValues[11]);
            famerdto.setStateId(dataValues[12]);
            famerdto.setCountry("Nigeria");
            famerdto.setLgAreaId(dataValues[13]);
            famerdto.setWard(dataValues[14]);
            famerdto.setKinSurname(dataValues[15]);
            famerdto.setKinOtherName(dataValues[16]);
            famerdto.setKinPhoneNumber(dataValues[17]);
            famerdto.setKinConactAddress(dataValues[18]);
            famerdto.setKinRelationShip(dataValues[19]);
            famerdto.setAge(dataValues[20]);
            famerdto.setProfilePhoto(dataValues[21]);
            famerdto.setAuthId(authId);  
            famerdto.setLastModifyDate(dateModified); 


    		String message = authmodel.Web_InsertAuthentication(connection, authdto);

    		if(message.equals("Congratulations!!")){
    			
    			String operations = famermodel.Web_InsertFarmers(connection, famerdto);
    			
    			System.out.println(operations); 
    			
    			if(operations.equals("success")){

    				out.println(OTP);
    				
    			}else{
    				
            		out.println(operations); 
            		
    			}

    			
    		}else{
    			
        		out.println(message); 
    		}
      
            }

        } catch (Exception e) {
            
            out.println("Error"); 
            
            e.printStackTrace();
        } finally {            
            out.close();
        }
    }
    public String generatePassword(){
        String seed = "";
                    // Passwords with only alphabetic characters.
//            for (int i = 0; i < 8; i++) {
//                System.out.println(RandomStringUtils.randomAlphabetic(8));
//            }
//                for (int i = 0; i < 8; i++) {
//                    System.out.println(RandomStringUtils.random(8, "abcDEF123"));
//                }        
        
//            System.out.println("--------");
            // Passwords with alphabetic and numeric characters.
//            for (int i = 0; i < 8; i++) {
//                seed = RandomStringUtils.randomAlphanumeric(8);
//            }
            // Passwords with alphabetic and numeric characters.
            for (int i = 0; i < 6; i++) {
                seed = RandomStringUtils.randomNumeric(6);
            }
          return seed;
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
