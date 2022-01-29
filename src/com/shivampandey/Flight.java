package com.shivampandey;

public class Flight{
    //Atributes
    private int flightNo;
    private String flightName;
    private String flightRoute;
    private String timeDepature;
    private String timeArival;
    private int regularTicketSeat = 10;
    private int touristTicketSeat = 10;


    //Constructor
    Flight(int flightNo, String flightName, String flightRoute ){
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.flightRoute = flightRoute;
        this.timeDepature = "9:00 AM";
        this.timeArival = "18:00 PM";
    }
    //method
    //method for printting flight details //done
    public void printFlightDetails(){
        System.out.println("Flight Name:             "+flightName);
        System.out.println("Flight Number:           "+ flightNo);
        System.out.println("Flight Route:            "+ flightRoute);
        System.out.println("Flight Depature Time:    "+timeDepature+ "Fight Arival Time: "+timeArival);
        System.out.println("Seat for Regular Ticket: "+regularTicketSeat);
        System.out.println("Seat for Tourist Ticket: "+touristTicketSeat);
    }
    public String getDA(){
        return "Flight Depature Time:    "+timeDepature+ "Fight Arival Time: "+timeArival;
    }
    public String getFlightRoute(){
        return flightRoute;
    }
    //setter
    public void setRegularTicketSeat(int seat){
        this.regularTicketSeat = (this.regularTicketSeat - seat);
    }
    public void setTouristTIcketSeat(int seat){
        this.touristTicketSeat = (this.touristTicketSeat - seat);
    }
    public String getFlightNameandNumber(){
        return flightName + " ("+flightNo+")";
    }
    //getter
    public int getNoofSeatsBooked(){
        return 20 - (this.regularTicketSeat + this.touristTicketSeat);
    }
}
