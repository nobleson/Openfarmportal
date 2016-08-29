/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class VC_CostDataModel {
    
    private String costId,costType,costDesc,quantity,unitCost,totalCost,productionStage,productionId,groupId,farmerId,VC_ID,lastModifiedDate;
    
            
        
    public String getCostId(){
        return costId;
    }       
    public void setCostId(String costId){
        this.costId = costId;
    }       
        
    public String getCostType(){
        return costType;
    }       
    public void setCostType(String costType){
        this.costType = costType;
    }       

        
    public String getCostDesc(){
        return costDesc;
    }       
    public void setCostDesc(String costDesc){
        this.costDesc = costDesc;
    }       
        
    public String getQuantity(){
        return quantity;
    }       
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }       
        
    public String getUnitCost(){
        return unitCost;
    }       
    public void setUnitCost(String unitCost){
        this.unitCost = unitCost;
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
        
    public String getProductionStage(){
        return productionStage;
    }       
    public void setProductionStage(String productionStage){
        this.productionStage = productionStage;
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
