package com.shivampandey;

abstract class Ticket {
    //Attrributes
    private int pnrNo;
    private String ticketStatus;
    private String durationJourney;
    Flight flight;
    Passenger passenger;
    //constructor
    Ticket(){
        this.ticketStatus = "Empty";
    }
    Ticket(Flight flight, Passenger passenger,int pnrNo){
        this.flight = flight;
        this.passenger = passenger;
        this.durationJourney = "9 Hours";
        this.ticketStatus = "Confirmed";
        this.pnrNo = pnrNo;
    }

    public int getpnrNo(){
        return pnrNo;
    }
    public String getdurationJourney(){
        return  durationJourney;
    }
    public void setticketStatus(String status){
        this.ticketStatus = status;
    }
    public String getticketStatus(){
        return ticketStatus;
    }
}