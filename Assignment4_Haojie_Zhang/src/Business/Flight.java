package Business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lhm
 */
public class Flight {

    private int flightID;
    private String departure;
    private String arrival;
    private Date departureTime;
    private Date arrivalTime;
    private int seatTotal;
    private Seat [][] seatTable;
    private Ticket ticket;
    private int lastTime;

    public static int idCounter = 1;

    public Flight() {
        this.flightID = this.idCounter++;
    }

    public Flight(String departure, String arrival, Date departureTime, Date arrivalTime) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.lastTime = departureTime.compareTo(arrivalTime) <= 0 ? (int)(arrivalTime.getTime() - departureTime.getTime()) : 0;

        this.flightID = this.idCounter++;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getLastTime() {
        return lastTime;
    }

    public void setLastTime(int lastTime) {
        this.lastTime = lastTime;
    }

    public Seat[][] getSeatTable() {
        return seatTable;
    }

    public void generateSeat() {
        int row = 6;
        int col = 6;
        if (row * col > this.seatTotal)
                row = this.seatTotal / col + 1;
        Seat [][]seats = new Seat[row][col];
        for (int i = 0, count = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (count == this.seatTotal)
                    break;
                String seatID = (char)(65 + i) + String.valueOf(j);
                seats[i][j] = new Seat(seatID);
            }
        }
        this.seatTable = seats;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getSeatTotal() {
        return seatTotal;
    }

    public void setSeatTotal(int seatTotal) {
        this.seatTotal = seatTotal;
    }
    
    

    @Override
    public String toString() {
        return this.flightID + ":" + this.departure + "-> " + this.arrival;
    }
   
}
