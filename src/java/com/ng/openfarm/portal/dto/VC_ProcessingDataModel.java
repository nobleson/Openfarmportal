/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProcessingDataModel {
        private String processingId,processingDesc,processingTech,processedQty,processingFirm,productionId,groupId,farmerId,VC_ID,lastModifiedDate;
    
    public String getProcessingId(){
        return processingId;
    }       
    public void setProcessingId(String processingId){
        this.processingId = processingId;
    }    
    
    public String getProcessingDesc(){
        return processingDesc;
    }       
    public void setProcessingDesc(String processingDesc){
        this.processingDesc = processingDesc;
    }    
    
    public String getProcessingTech(){
        return processingTech;
    }       
    public void setProcessingTech(String processingTech){
        this.processingTech = processingTech;
    }    
    
    public String getProcessedQty(){
        return processedQty;
    }       
    public void setProcessedQty(String processedQty){
        this.processedQty = processedQty;
    }    
    
    public String getProcessingFirm(){
        return processingFirm;
    }       
    public void setProcessingFirm(String processingFirm){
        this.processingFirm = processingFirm;
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
