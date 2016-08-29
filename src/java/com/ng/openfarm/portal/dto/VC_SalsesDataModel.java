/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class VC_SalsesDataModel {
    
    private String salesId,salesDesc,productionForm,buyer,quantity,unitMeasurement,unitCost,totalCost,salesDate,productionId,groupId,farmerId,VC_ID,lastModifiedDate;
    
        
    public String getSalesId(){
        return salesId;
    }       
    public void setSalesId(String salesId){
        this.salesId = salesId;
    }       
        
        
    public String getSalesDesc(){
        return salesDesc;
    }       
    public void setSalesDesc(String salesDesc){
        this.salesDesc = salesDesc;
    }       
        
        
    public String getBuyer(){
        return buyer;
    }       
    public void setBuyer(String buyer){
        this.buyer = buyer;
    }       
        
        
    public String getProductionForm(){
        return productionForm;
    }       
    public void setProductionForm(String productionForm){
        this.productionForm = productionForm;
    }       
        
        
    public String getQuantity(){
        return quantity;
    }       
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }       
        
        
    public String getUnitMeasurement(){
        return unitMeasurement;
    }       
    public void setUnitMeasurement(String unitMeasurement){
        this.unitMeasurement = unitMeasurement;
    }       
        
        
    public String getUnitCost(){
        return unitCost;
    }       
    public void setUnitCost(String unitCost){
        this.unitCost = unitCost;
    }       
        
        
        
    public String getSalesDate(){
        return salesDate;
    }       
    public void setSalesDate(String salesDate){
        this.salesDate = salesDate;
    }       
        
        
    public String getTotalCost(){
        return totalCost;
    }       
    public void setTotalCost(String totalCost){
        this.totalCost = totalCost;
    }       
        
        
    public String getProductionId(){
        return productionId;
    }       
    public void setProductionId(String productionId){
        this.productionId = productionId;
    }       
        
    public String getGroupId(){
        return groupId;
    }       
    public void setGroupId(String groupId){
        this.groupId = groupId;
    }
	
    public String getFarmerIdd(){
        return farmerId;
    }       
    public void setFarmerId(String farmerId){
        this.farmerId = farmerId;
    }
	
    public String getVC_ID(){
        return VC_ID;
    }       
    public void setVC_ID(String VC_ID){
        this.VC_ID = VC_ID;
    }
    	
    public String getLastModifiedDate(){
        return lastModifiedDate;
    }       
    public void setLastModifiedDate(String lastModifiedDate){
        this.lastModifiedDate = lastModifiedDate;
    }
}
