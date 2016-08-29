package com.ng.openfarm.portal.model;

import com.ng.openfarm.portal.dao.FarmConsultantDAO;
import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dto.FarmConsultantDataModel;
import java.sql.Connection;
import java.util.ArrayList;


public class FarmConsultantManager {

	public FarmConsultantDataModel Service_GetFarmerById(String famerId)throws Exception {
		FarmConsultantDataModel feeds = null;
		try {
		// Here you can validate before connecting DAO class, eg. User session condition
		OpenfarmConnect oLAPConnect= new OpenfarmConnect();
		Connection connection = oLAPConnect.Get_Connection();
		FarmConsultantDAO dao= new FarmConsultantDAO();
		
		feeds=dao.GetFarmMagrById(connection, famerId);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}	

	public FarmConsultantDataModel Web_GetFarmManagerById(Connection connection,String authId)throws Exception {
		FarmConsultantDataModel feeds = null;
		try {
		FarmConsultantDAO dao= new FarmConsultantDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetFarmMagrById(connection, authId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	

	public ArrayList<FarmConsultantDataModel> Service_GetAllFarmers()throws Exception {
		ArrayList<FarmConsultantDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition
		OpenfarmConnect oLAPConnect= new OpenfarmConnect();
		Connection connection = oLAPConnect.Get_Connection();
		FarmConsultantDAO dao= new FarmConsultantDAO();
		feeds=dao.GetAllFarmManagers(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		

	public ArrayList<FarmConsultantDataModel> Web_GetAllFarmers(Connection connection)throws Exception {
		ArrayList<FarmConsultantDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition

		FarmConsultantDAO state= new FarmConsultantDAO();
		feeds=state.GetAllFarmManagers(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	public String Web_InsertFarmers(Connection connection, FarmConsultantDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		try {

		FarmConsultantDAO dao= new FarmConsultantDAO();
		status = dao.InsertFarmManager(connection, feedObject);

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
	public String Web_UpdateFarmer(Connection connection,FarmConsultantDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		
		try {

		FarmConsultantDAO dao= new FarmConsultantDAO();
		status = dao.updateFarmManager(connection, feedObject);

		if(status==0){
			
			message = "Record is updated successfully";

		}else{
			
		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String Web_DeleteFarmer(Connection connection,String farmerId) throws Exception {
		String message = null;
		int status = -1;
		
		try {		

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
