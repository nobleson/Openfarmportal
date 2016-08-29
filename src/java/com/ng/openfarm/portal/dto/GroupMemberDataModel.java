/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dto;

/**
 *
 * @author Mutual-Links
 */
public class GroupMemberDataModel {
    
    private String groupMemberId,groupId,farmerId,groupHead,status,lastModifiedDate;
    
    public String getGroupMemberId(){
        
        return groupMemberId;
    }
    
    public void setGroupMemberId(String groupMemberId){
        
        this.groupMemberId = groupMemberId;
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
    
    public void setFarmerId(String groupFarmerId){
        
        this.farmerId = groupFarmerId;
    }
    
    public String getGroupHeadId(){
        
        return groupHead;
    }
    
    public void setGroupHeadId(String groupHead){
        
        this.groupHead = groupHead;
    }
    
    public String getStatus(){
        
        return status;
    }
    
    public void setStatus(String status){
        
        this.status = status;
    }
    
    public String getLastMofied(){
        
        return lastModifiedDate;
    }
    
    public void setLastMofied(String status){
        
        this.lastModifiedDate = status;
    }

    
    
}
