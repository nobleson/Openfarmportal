package com.ng.openfarm.portal.model;

import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dto.FarmersDataModel;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class FarmerManager {

	public FarmersDataModel Service_GetFarmerById(String famerId)throws Exception {
		FarmersDataModel feeds = null;
		try {
		// Here you can validate before connecting DAO class, eg. User session condition
		OpenfarmConnect oLAPConnect= new OpenfarmConnect();
		Connection connection = oLAPConnect.Get_Connection();
		FarmerDAO dao= new FarmerDAO();
		
		feeds=dao.GetFarmerById(connection, famerId);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}	

	public FarmersDataModel getFarmerByFarmerReg(Connection connection,String farmerId)throws Exception {
		FarmersDataModel feeds = null;
		try {
		FarmerDAO dao= new FarmerDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetFarmerByFarmerReg(connection, farmerId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	

	public FarmersDataModel getFarmerById(Connection connection,String authId)throws Exception {
		FarmersDataModel feeds = null;
		try {
		FarmerDAO dao= new FarmerDAO();
		// Here you can validate before connecting DAO class, eg. User session condition
                
		feeds=dao.GetFarmerById(connection, authId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	

	public ArrayList<FarmersDataModel> Service_GetAllFarmers()throws Exception {
		ArrayList<FarmersDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition
		Connection connection = OpenfarmConnect.Get_Connection();
		FarmerDAO dao= new FarmerDAO();
		feeds=dao.GetAllFarmers(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		

	public ArrayList<FarmersDataModel> getAllFarmers(Connection connection)throws Exception {
		ArrayList<FarmersDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition

		FarmerDAO state= new FarmerDAO();
		feeds=state.GetAllFarmers(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	public String Web_InsertFarmers(Connection connection, FarmersDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		try {

		FarmerDAO dao= new FarmerDAO();
		status = dao.InsertFarmer(connection, feedObject);

		if(status==0){
			
			message = "success";
		}else{
			
			message = "Fail";

		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String Web_UpdateFarmer(Connection connection,FarmersDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		
		try {

		FarmerDAO dao= new FarmerDAO();
		status = dao.updateFarmer(connection, feedObject);

		if(status==0){
			
			message = "Record is updated successfully";

		}else{
			
		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String updateFarmerToVerify(Connection connection,FarmersDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		
		try {

		FarmerDAO dao= new FarmerDAO();
		status = dao.updateFarmerToVerify(connection, feedObject);

		if(status==0){
			
			message = "Success";

		}else{
			message = "Fail";
		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String Web_DeleteFarmer(Connection connection, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String message = null;
		int status = -1;
		
		try {
		String farmerId = (String)request.getParameter("stateId");
		

		FarmerDAO dao= new FarmerDAO();
		status = dao.deleteFarmer(connection, farmerId);

		if(status==0){
			
			message = "Record is deleted successfully";
		}else{
			
		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}

}

