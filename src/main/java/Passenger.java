public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private int seatNo;

    public Passenger (String name, int bags, Flight flight, int seatNo) {
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seatNo = seatNo;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
