public class Flight implements Comparable<Flight>{
    private String depCity;
    private String daysOfWeek;
    private String flightNum;
    private String depTime;
    private String arrTime;

    public Flight(String depCity, String daysOfWeek, String flightNum, String depTime, String arrTime) {
        this.depCity = depCity;
        this.daysOfWeek = daysOfWeek;
        this.flightNum = flightNum;
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    public String getDepCity() {
        return depCity;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public String getFlightNum() {
        return flightNum;
    }


    public String getDepTime() {
        return depTime;
    }

    public String getArrTime() {
        return arrTime;
    }


    @Override
    public int compareTo(Flight flight) {
        return this.flightNum.compareTo(flight.getFlightNum());
    }
}
