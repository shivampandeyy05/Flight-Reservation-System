package com.shivampandey;

public class TouristTicket extends Ticket {
    // Attributes
    private int seatNo;
    private String ticketType;
    private String touristHotel;
    private String[] touristHotelAddress;

    // constructor
    TouristTicket() {
        super();
    }

    TouristTicket(Flight flight, Passenger passenger, int pnrNo, int seatNo) {
        super(flight, passenger, pnrNo);
        this.ticketType = "Tourist Ticket";
        this.touristHotelAddress = new String[5];
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public String getTicketType() {
        return ticketType;
    }

    // method for setting the value of touristHotel and touristHotelAddress
    // attributes
    public void setHotelNameandAddress(String hotelName, String add1, String add2, String add3, String add4,
                                       String add5) {
        this.touristHotel = hotelName;
        touristHotelAddress[0] = add1;
        touristHotelAddress[1] = add2;
        touristHotelAddress[2] = add3;
        touristHotelAddress[3] = add4;
        touristHotelAddress[4] = add5;

    }

    // methods
    public String getHotelName() {
        return touristHotel;
    }

    public void getTAddress() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Location " + (i + 1) + " : " + touristHotelAddress[i]);
        }
    }

}
