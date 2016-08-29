/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class ApplicationDataModel {
    
    private String applicationId,fertilizer,fertilizerQuantity,herbicides,herbicidesQuantity,pesticides,pesticedsquantity,
            otherapplications,otherapplicationquntity,productionId,groupId,farmerId,VC_ID,lastModifiedDate;

    
    public String getApplicationId(){
        
        return applicationId;
    }
    public void setApplicationId(String applicationId){
        
        this.applicationId = applicationId;
    }
    
    
    public String getFertilizer(){
        
        return fertilizer;
    }
    public void setFertilizer(String fertilizer){
        
        this.fertilizer = fertilizer;
    }
    
    
    public String getFertilizerQty(){
        
        return fertilizerQuantity;
    }
    public void setFertilizerQty(String fertilizerQuantity){
        
        this.fertilizerQuantity = fertilizerQuantity;
    }
    
    
    public String getHerbicides(){
        
        return herbicides;
    }
    public void setHerbicides(String herbicides){
        
        this.herbicides = herbicides;
    }
    
    
    public String getHerbicidesQty(){
        
        return herbicidesQuantity;
    }
    public void setHerbicidesQty(String herbicidesQuantity){
        
        this.herbicidesQuantity = herbicidesQuantity;
    }
    
    
    public String getPesticides(){
        
        return pesticides;
    }
    public void setPesticides(String pesticides){
        
        this.pesticides = pesticides;
    }
    
    public String getPesticideQty(){
        
        return pesticedsquantity;
    }
    public void setPesticideQty(String pesticedsquantity){
        
        this.pesticedsquantity = pesticedsquantity;
    }
    
    
    public String getOtherApplication(){
        
        return otherapplications;
    }
    public void setOtherApplication(String otherapplications){
        
        this.otherapplications = otherapplications;
    }
    
    
    public String getOtherApplicationQty(){
        
        return otherapplicationquntity;
    }
    public void setOtherApplicationQty(String otherapplicationquntity){
        
        this.otherapplicationquntity = otherapplicationquntity;
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
