package com.shivampandey;

public class RegularTicket extends Ticket {
    //Attributes
    private int seatNo; //1...50
    private String ticketType;
    private String spacialFood;
    private String spacialWater;
    private String spacialSnacks;
    //constructor
    RegularTicket(){
        super();
    }
    public RegularTicket(Flight flight, Passenger passenger,int pnrNo, int seatNo){
        super(flight,passenger, pnrNo);
        this.ticketType = "Regular Type";
        this.spacialFood = "Not Taken";
        this.spacialWater = "Not Taken";
        this.spacialSnacks = "Not Taken";
        this.seatNo = seatNo;
    }
    //methods
    public void setSpecial(String spacialFood, String spacialWater, String spacialSnacks ){
        this.spacialFood = spacialFood;
        this.spacialWater = spacialWater;
        this.spacialSnacks = spacialSnacks;
    }
    public String getspacialFood(){
        return spacialFood;
    }
    public String getspacialWater(){
        return spacialWater;
    }
    public String getspacialSnacks(){
        return spacialSnacks;
    }
    public String getTicketType(){
        return ticketType;
    }
    public int getSeatNo(){
        return seatNo;
    }
}