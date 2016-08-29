/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProductionDataModel {
    
    private  String productionId,productionDescription,siteNumber,stakeholder,cropId,productionWeeks,hectares,productionSeason,technology,targetYield,
                actualYield,commonPest,groupId,farmerId,VC_ID,productionYear,inputProvider,inputs,productionStatus,lastModifiedDate;
	
    public String getProductionId(){
        return productionId;
    }       
    public void setProductionId(String productionId){
        this.productionId = productionId;
    }
	
    public String getProductionDescription(){
        return productionDescription;
    }       
    public void setProductionDescription(String productionDescription){
        this.productionDescription = productionDescription;
    }
	
    public String getCropId(){
        return cropId;
    }       
    public void setCropId(String cropId){
        this.cropId = cropId;
    }
	
    public String getProductionWeeks(){
        return productionWeeks;
    }       
    public void setProductionWeeks(String productionWeeks){
        this.productionWeeks = productionWeeks;
    }
	
    public String getHectares(){
        return hectares;
    }       
    public void setHectares(String hectares){
        this.hectares = hectares;
    }
	
    public String getProductionSeason(){
        return productionSeason;
    }       
    public void setProductionSeason(String productionSeason){
        this.productionSeason = productionSeason;
    }
	
    public String getTechnology(){
        return technology;
    }       
    public void setTechnology(String technology){
        this.technology = technology;
    }
	
    public String getTargetYield(){
        return targetYield;
    }       
    public void setTargetYield(String targetYield){
        this.targetYield = targetYield;
    }
	
    public String getActualYield(){
        return actualYield;
    }       
    public void setActualYield(String actualYield){
        this.actualYield = actualYield;
    }
	
    public String getCommonPest(){
        return commonPest;
    }       
    public void setCommonPest(String commonPest){
        this.commonPest = commonPest;
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
    
    public String getSiteNumber(){
        return siteNumber;
    }       
    public void setSiteNumber(String siteNumber){
        this.siteNumber = siteNumber;
    }
	
    public String getStakeholder(){
        return stakeholder;
    }       
    public void setStakeholder(String stakeholder){
        this.stakeholder = stakeholder;
    }	
    public String getProductionYear(){
        return productionYear;
    }       
    public void setProductionYear(String productionYear){
        this.productionYear = productionYear;
    }
	
    public String getInputProvider(){
        return inputProvider;
    }       
    public void setInputProvider(String inputProvider){
        this.inputProvider = inputProvider;
    }
	
    public String getInputs(){
        return inputs;
    }       
    public void setInputs(String inputs){
        this.inputs = inputs;
    }
	
    public String getProductionStatus(){
        return productionStatus;
    }       
    public void setProductionStatus(String productionStatus){
        this.productionStatus = productionStatus;
    }
	
    public String getLastModifiedDate(){
        return lastModifiedDate;
    }       
    public void setLastModifiedDate(String lastModifiedDate){
        this.lastModifiedDate = lastModifiedDate;
    }
	


}
