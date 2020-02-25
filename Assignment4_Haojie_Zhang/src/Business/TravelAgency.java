/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhanghaojie
 */
public class TravelAgency {
 
   
    private Map<Integer, Customer> customerMap;
    private Map<Integer, Airliners> airlinerMap;
    private Date updateTime;
    public ArrayList<Customer>custlist = new ArrayList<>();
    
    
    public TravelAgency(){
        this.airlinerMap = new HashMap<Integer, Airliners> ();
        this.customerMap = new HashMap<Integer, Customer> ();
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        try {
//            Flight flight1 = new Flight("Boston", "Ningbo", dateFormat.parse("2020-02-15 11:30:00"), dateFormat.parse("2020-02-18 19:00:00"));
//            ]
//            Airliners airliner1 = new Airliners(" Delta Air lines");
//            
//            Airplane airplane1 = new Airplane("Super1", "C90", 50);   
//          ] 
//            airplane1.getFlightMap().put(flight1.getFlightID(), flight1);
//            flight1.setSeatTotal(airplane1.getSeatCapacity());
//            flight1.generateSeat();
//            airplane1.getFlightMap().put(flight2.getFlightID(), flight2);
//            flight2.setSeatTotal(airplane1.getSeatCapacity());
//            flight2.generateSeat();
//            
//           
//            
//            airliner1.getAirlinerMap().put(airplane1.getPlaneID(), airplane1);
//            airliner1.getAirlinerMap().put(airplane2.getPlaneID(), airplane2);
//            
//            
//            this.airlinerMap.put(airliner1.getAirlinerID(), airliner1);
//            this.airlinerMap.put(airliner2.getAirlinerID(), airliner2);
        } catch (Exception ex) {
            System.out.println("init airliner failed !");    
        }
//        
        custlist.add(new Customer(89,"123", "Jeffery",89));
        custlist.add(new Customer(00,"456", "Josh",99));
         Customer customer2 =  new Customer(89, "456", "Josh",89 );
         Customer customer1 =  new Customer(00,"456", "Josh",99);
//        custlist.add(customer2);
//        custlist.add(customer1);
        this.customerMap.put(customer2.getUserID(), customer2);
        this.customerMap.put(customer1.getUserID(), customer1);
    }
    
    
    
    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<Integer, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public Map<Integer, Airliners> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airliners> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    

}
    

