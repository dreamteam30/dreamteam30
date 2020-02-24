/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wang
 */
public class Customer {
    private int userID;
    private String firstName;
    private String lastName;
    private int personalId;
    private int count;
    private Map<Integer,Customer> customerDirectory;
    
    public Customer(int userID, String firstName, String lastName, int personalId){
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.customerDirectory = new HashMap<Integer, Customer>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public Map<Integer, Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(Map<Integer, Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
}
