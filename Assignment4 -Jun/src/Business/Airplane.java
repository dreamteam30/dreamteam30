package Business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lhm
 */
public class Airplane {

    private int planeID;
    private String company;
    private String model;
    private Map<Integer, Flight> flightMap;
    private int seatCapacity;
    private Date updateTime;
    
    public static int idCounter = 1;
    
    public Airplane(String company, String model, int seat){
        this.company = company;
        this.model = model;
        this.seatCapacity = seat;
        
        this.flightMap = new HashMap<Integer, Flight> ();
        this.planeID = this.idCounter++;
        this.updateTime = new Date();
    }

    public int getPlaneID() {
        return planeID;
    }

    public void setPlaneID(int planeID) {
        this.planeID = planeID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Map<Integer, Flight> getFlightMap() {
        return flightMap;
    }

    public void setFlightMap(Map<Integer, Flight> flightMap) {
        this.flightMap = flightMap;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString(){
        return "Airplane " + this.planeID;
    }
    
    public Flight getFlightbyID(int ID){
        return this.flightMap.get(ID);
    }
    
    public Flight addFlight(){
        Flight flight = new Flight();
        this.flightMap.put(flight.getFlightID(), flight);
        return flight;
    }
}
