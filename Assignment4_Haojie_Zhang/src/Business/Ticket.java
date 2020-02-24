package Business;

import java.util.Date;

/**
 *
 * @author lhm
 */
public class Ticket {
    private int ticketnumber;
    private int customerID;
    private Seat seat;    
    private String FN;
    private String SN;
    private int count=0;

    public Ticket(int ticketnumber,int customerID, String FN, String SN  ){
        this.ticketnumber=ticketnumber;
        this.customerID=customerID;
        this.FN=FN;
        this.SN=SN;
        
 
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }
    

    
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

   

   

    @Override
    public String toString(){
        return this.customerID + " " + this.seat;
    }
}
