/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutual-Links
 */
public class DateFormat {
   
	public static String formatDate(long epoch){
		 
		  String newFormat = "null"; 

		if(epoch >1 ){
			
			  Date date = new Date(epoch * 1000L);
			  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss.SSS");
			  format.setTimeZone(TimeZone.getTimeZone("GMT+1:00"));
			  newFormat = format.format(date);
			
		  }
		

		
		return newFormat;
		
	}
        public static long convertToEpochTime(String date){
            
            long epoch = 1L;
            
            try {
            

                SimpleDateFormat df = new SimpleDateFormat("DD, d MM, yy");
                Date newDate = df.parse(date);
                epoch = newDate.getTime();
                System.out.println(epoch); // 1055
                  
                  
            } catch (ParseException ex) {
                Logger.getLogger(DateFormat.class.getName()).log(Level.SEVERE, null, ex);
            }
              return epoch;

        }
        
//    String str = "Jun 13 2003 23:11:52.454 UTC";
//    SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
//    Date date = df.parse(str);
//    long epoch = date.getTime();
//    System.out.println(epoch); // 1055545912454
        
////        DateFormat originalFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
////DateFormat targetFormat = new SimpleDateFormat("yyyyMMdd");
////Date date = originalFormat.parse("August 21, 2012");
////String formattedDate = targetFormat.format(date);  // 20120821
//        
//	    public static void main(String[] args) {
//
//	         
//
//	        try {
//
//	             
//	            String dateStr = "21/20/2011";
//
//	             
//
//	            DateFormat srcDf = new SimpleDateFormat("dd/MM/yyyy");
//
//	             
//
//	            // parse the date string into Date object
//
//	            Date date = srcDf.parse(dateStr);
//
//	             
//	            DateFormat destDf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
//
//	              
//
//	            // format the date into another format
//
//	            dateStr = destDf.format(date);
//
//	             
//
//	            System.out.println("Converted date is : " + dateStr);
//
//	             
//
//	        }
//
//	        catch (ParseException e) {
//
//	            e.printStackTrace();
//
//	        }
//            }
//            
}
