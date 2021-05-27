/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;

/**
 *
 * @author Hunter Buchardt
 */
public class Store {
    
    
    private int storeID;
    private String primaryPhone;
    private String storeAddress;
    private String openingDate;
    
    public Store(int storeID, String primaryPhone, String storeAddress, String openingDate) {
        this.storeID = storeID;
        this.primaryPhone = primaryPhone;
        this.storeAddress = storeAddress;
        this.openingDate = openingDate;
    }
    
    public int getStoreID(){
       return storeID;
    }
    
    public String getPrimaryPhone(){
        return primaryPhone;
    }
    
    public String getStoreAddress(){
        return storeAddress;
    }
    
    public String getOpeningDate(){
        return openingDate;
    }
    
    public void setPrimaryPhone(String primaryPhone){
        this.primaryPhone = primaryPhone;
    }
    
    public void setStoreAddress(String storeAddress){
        this.storeAddress = storeAddress;
    }

    public void setOpeningDate(String openingDate){
        this.openingDate = openingDate;
    }

    
}
