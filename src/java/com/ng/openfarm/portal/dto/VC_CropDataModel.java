/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class VC_CropDataModel {
    private String cropId,cropName,species,quality,quantity,lifespan,inputSource,groupId,farmerId,valueChain,lastModified;
    
    public String getCropId(){
        
        return cropId;
    }
    public void setCropId(String cropId){
        
        this.cropId = cropId;
    }
    
    public String getCropName(){
        
        return cropName;
    }
    public void setCropName(String cropName){
        
        this.cropName = cropName;
    }
    
    public String getSpecies(){
        
        return species;
    }
    public void setSpecies(String species){
        
        this.species = species;
    }
    
    public String getQuality(){
        
        return quality;
    }
    public void setQuality(String quality){
        
        this.quality = quality;
    }
    
    public String getQuantity(){
        
        return quantity;
    }
    public void setQuantity(String quantity){
        
        this.quantity = quantity;
    }
    
    public String getLifeSpan(){
        
        return lifespan;
    }
    public void setLifeSpan(String lifespan){
        
        this.lifespan = lifespan;
    }
    
    public String getInputSource(){
        
        return inputSource;
    }
    public void setInputSource(String inputSource){
        
        this.inputSource = inputSource;
    }
    
    public String getGroupId(){
        
        return groupId;
    }
    public void setGroupId(String groupId){
        
        this.groupId = groupId;
    }
    
    public String getFarmerId(){
        
        return farmerId;
    }
    public void setFarmerId(String farmerId){
        
        this.farmerId = farmerId;
    }
    
    public String getValueChain(){
        
        return valueChain;
    }
    public void setValueChian(String valueChain){
        
        this.valueChain = valueChain;
    }
    
    public String getLastDateMidified(){
        
        return lastModified;
    }
    public void setLastDateModified(String lastModified){
        
        this.lastModified = lastModified;
    }

}
