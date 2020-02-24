/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.sun.org.apache.bcel.internal.generic.LADD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author junyaoli
 */
public class MapStore {
    
    
    private static MapStore mapstore;
    private Map<Integer, Airliners> airlinerMap;
    private Map<Integer,Customer> customer;
    private Map<Integer,Ticket> ticketmap;
    public ArrayList<Customer>custlist = new ArrayList<>();
   
    MapStore(){
        
        this.airlinerMap= new HashMap<>();
        this.customer = new HashMap<>();
        this.ticketmap= new HashMap<>();
        /////生成顾客
        Customer c1 = new Customer(1, "J", "W", 2);
        Customer c2 = new Customer(3, "a", "c", 4);
        Customer c3 = new Customer(5, "Q", "D", 6);
        customer.put(1, c1);
        customer.put(3, c2);
        customer.put(5, c3);
        ////生成航班
        Airliners a1 = new Airliners(0, "22", "Bos"," LAD", "12/12","12/13", 12);
        Airliners a2 = new Airliners(1, "33", "LA", "BOS", "1/10", "1/12", 20);
        airlinerMap.put(0, a1);
        airlinerMap.put(1, a2);
        
    }

    public Map<Integer, Ticket> getTicketmap() {
        return ticketmap;
    }

    public void setTicketmap(Map<Integer, Ticket> ticketmap) {
        this.ticketmap = ticketmap;
    }
    
    public static MapStore getInstance(){
        if(mapstore == null)
            mapstore = new MapStore();
        return mapstore;
    }

    public Map<Integer, Customer> getCustomer() {
        System.out.println(this.customer);
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }
    

    public static MapStore getMapstore() {
        return mapstore;
    }

    public static void setMapstore(MapStore mapstore) {
        MapStore.mapstore = mapstore;
    }
    

    public Map<Integer, Airliners> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airliners> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }
    
    
    
}
