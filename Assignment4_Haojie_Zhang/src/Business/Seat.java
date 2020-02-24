package Business;

/**
 *
 * @author lhm
 */
public class Seat {
    private String seatID;
    private boolean isAvai;
    
    
    public Seat(String seatId){
        this.seatID = seatId;
        this.isAvai = true;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public boolean isIsAvai() {
        return isAvai;
    }

    public void setIsAvai(boolean isAvai) {
        this.isAvai = isAvai;
    }


    @Override
    public String toString(){
        return this.seatID;
    }
 
}
