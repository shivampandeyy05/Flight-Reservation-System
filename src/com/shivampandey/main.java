package com.shivampandey;

import java.util.Scanner;

public class main {
    public static void greet() {
        System.out.println("--WELCOME to Flight Reservation System--");
    }

    // print -- line
    public static void line() {
        System.out.println("--------------");
    }

    // method for Showing option on page 1
    public static void page1() {

        System.out.println("1. Please enter 1 to Book a Ticket");
        System.out.println("2. Please enter 2 to Check Seat Avilabilty");
        System.out.println("3. Please enter 3 to check PNR Status");
        System.out.println("4. Please enter 4 to Print Your Ticket");
        System.out.println("5. Please enter 5 to Cancel Ticket");
        System.out.println("6. Please enter 6 to Update Your Tourist Ticket Address");
        System.out.println("7. Please enter 7 to Update Your Profile");
        System.out.println("0. Please enter 0 to Exit");
    }

    // method for Showing option on page 2
    public static void page2() {
        System.out.println("---Book a Regular Ticket or Tourist Ticket---");
        System.out.println("1. Regular Ticket");
        System.out.println("2. Tourist Ticket");
        System.out.println("0. Main Menu");
    }

    public static void printTicketDetails(RegularTicket rt) {
        System.out.println("----------Regular Ticket----------");
        System.out.println("Ticket Type:       " + rt.getTicketType());
        System.out.println("PNR Number:        " + rt.getpnrNo());
        System.out.println("Passenger Name:    " + rt.passenger.getpName());
        System.out.println("Passenger Id:      " + rt.passenger.getPassengerCount());
        System.out.println("Seat Number:       " + rt.getSeatNo());
        System.out.println("Ticket Status:     " + rt.getticketStatus());
        System.out.println("Special Services - Food: " + rt.getspacialFood() + ", Water: " + rt.getspacialWater()
                + ", Snacks: " + rt.getspacialSnacks());
        System.out.println("Flight Name:       " + rt.flight.getFlightNameandNumber());
        System.out.println("Flight Route:      " + rt.flight.getFlightRoute());
        System.out.println(rt.flight.getDA());
    }

    public static void printTicketDetails(TouristTicket rt) {
        System.out.println("---Tourist Ticket---");
        System.out.println("Ticket Type:       " + rt.getTicketType());
        System.out.println("PNR Number:        " + rt.getpnrNo());
        System.out.println("Passenger Name:    " + rt.passenger.getpName());
        System.out.println("Passenger Id:      " + rt.passenger.getPassengerCount());
        System.out.println("Seat Number:       " + rt.getSeatNo());
        System.out.println("Ticket Status:     " + rt.getticketStatus());
        // System.out.println("Spacial Services --- Food: "+rt.getspacialFood()+" Water:
        // "+rt.getspacialWater()+" Snacks: "+rt.getspacialSnacks());
        System.out.println("Flight Name:       " + rt.flight.getFlightNameandNumber());
        System.out.println("Flight Route:      " + rt.flight.getFlightRoute());
        System.out.println(rt.flight.getDA());
        System.out.println("---Tourist Hotel and Destination---");
        System.out.println("Hotel Name:        " + rt.getHotelName());
        System.out.println("-----Destination------");
        rt.getTAddress();
    }

    public static void main(String[] args) {

        Scanner takeInput = new Scanner(System.in);
        Flight flight = new Flight(3030, "Spice Jet", "Bangalore to Yew York");
        Passenger[] passenger = new Passenger[10];
        RegularTicket[] regularTicket = new RegularTicket[10];
        TouristTicket[] touristTickets = new TouristTicket[10];

        for(int k = 0; k< 10;k++){
            passenger[k] = new Passenger();
            regularTicket[k] = new RegularTicket();
            touristTickets[k] = new TouristTicket();
        }

        int index = 0;
        int pnrNo = 808;
        // loop mian
        for (int i = 0; i <= 0;) {
            greet();
            // show page 1 option
            line();
            // metthod will print page1 options
            page1();
            line();
            // take option input 1,2,3,0
            int in = takeInput.nextInt();
            // 1 Option to Book Ticket
            if (in == 1) {
                line();
                page2();
                line();
                int in2 = takeInput.nextInt();
                if (in2 == 1) {
                    line();
                    System.out.println("**********Booking Regular Ticket**********");
                    line();
                    System.out.println("---Register your self as Passenger---");
                    line();
                    System.out.println("Enter Your Name, Ex: shivampandey with NO Space-in-between: ");
                    String pname = takeInput.next();
                    line();
                    System.out.println("Enter Your Age: ");
                    int page = takeInput.nextInt();
                    line();
                    System.out.println("Enter Your Gender: ");
                    String pgender = takeInput.next();
                    line();
                    System.out.println("----------Enter your Address and Contact Details----------");
                    line();
                    System.out.println("Enter Your Street Name: ");
                    String street = takeInput.next();
                    line();
                    System.out.println("Enter Your City Name: ");
                    String city = takeInput.next();
                    line();
                    System.out.println("Enter Your State Name: ");
                    String state = takeInput.next();
                    line();
                    System.out.println("Enter Your Phone Number: ");
                    String phoneNumber = takeInput.next();
                    line();
                    System.out.println("Enter Your Email ID: ");
                    String emailId = takeInput.next();
                    line();
                    System.out.println("-----Enter Yes and No for Special Services-----");
                    line();
                    System.out.println("Enter Your Special Food: ");
                    String spacialFood = takeInput.next();
                    line();
                    System.out.println("Enter Your Special Water ");
                    String spacialWater = takeInput.next();
                    line();
                    System.out.println("Enter Your Special Snacks: ");
                    String spacialSnacks = takeInput.next();

                    passenger[index] = new Passenger(pname, page, pgender, phoneNumber, emailId, street, city, state);
                    regularTicket[index] = new RegularTicket(flight, passenger[index], pnrNo, index + 1);
                    regularTicket[index].setSpecial(spacialFood, spacialWater, spacialSnacks);
                    flight.setRegularTicketSeat(1);
                    line();
                    System.out.println("*****Your Regular Ticket is Booked Successfully*****");
                    System.out.println("*****Your PNR Number is: " + pnrNo + " *****");
                    line();
                    index++;
                    pnrNo++;
                } else if (in2 == 2) {
                    line();
                    System.out.println("**********Booking Tourist Ticket**********");
                    line();
                    System.out.println("---Register your self as Passenger---");
                    line();
                    System.out.println("Enter Your Name: ");
                    String pname = takeInput.next();
                    line();
                    System.out.println("Enter Your Age: ");
                    int page = takeInput.nextInt();
                    line();
                    System.out.println("Enter Your Gender: ");
                    String pgender = takeInput.next();
                    line();
                    System.out.println("----------Enter your Address and Contact Details----------");
                    line();
                    System.out.println("Enter Your Street Name: ");
                    String street = takeInput.next();
                    line();
                    System.out.println("Enter Your City Name: ");
                    String city = takeInput.next();
                    line();
                    System.out.println("Enter Your State Name: ");
                    String state = takeInput.next();
                    line();
                    System.out.println("Enter Your Phone Number: ");
                    String phoneNumber = takeInput.next();
                    line();
                    System.out.println("Enter Your Email ID: ");
                    String emailId = takeInput.next();
                    line();
                    System.out.println("Enter Hotel Name: ");
                    String hotelName = takeInput.next();
                    line();
                    System.out.println("Enter Location 1: ");
                    String add1 = takeInput.next();
                    line();
                    System.out.println("Enter Location 2: ");
                    String add2 = takeInput.next();
                    line();
                    System.out.println("Enter Location 3: ");
                    String add3 = takeInput.next();
                    line();
                    System.out.println("Enter Location 4: ");
                    String add4 = takeInput.next();
                    line();
                    System.out.println("Enter Location 5: ");
                    String add5 = takeInput.next();
                    line();

                    passenger[index] = new Passenger(pname, page, pgender, phoneNumber, emailId, street, city, state);
                    touristTickets[index] = new TouristTicket(flight, passenger[index], pnrNo, index + 1);
                    touristTickets[index].setHotelNameandAddress(hotelName, add1, add2, add3, add4, add5);
                    flight.setTouristTIcketSeat(1);
                    System.out.println("*****Your Tourist Ticket is Booked Successfully");
                    System.out.println("*****Your PNR Number is: " + pnrNo);
                    line();
                    index++;
                    pnrNo++;
                } else if (in2 == 0) {
                    break;
                }
            }
            // 2 option to Seat Avilavilty
            else if (in == 2) {
                line();
                System.out.println("***********Seat Availability of " + flight.getFlightNameandNumber() + "**********");
                System.out.println("Total Number of Seats Booked: " + flight.getNoofSeatsBooked());
                System.out.println("Total Number of Seats are Available: " + (20 - flight.getNoofSeatsBooked()));
                line();
            }
            // 3 Option for to Check PNR status
            else if (in == 3) {
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                int indexs = -1;
                for (int j = 0; j <10; j++) {
                    if (pnrNum == regularTicket[j].getpnrNo()) {
                        line();
                        System.out.println("Your Seat No.: " + regularTicket[j].getSeatNo());
                        System.out.println("Booking Status: " + regularTicket[j].getticketStatus());
                        line();
                        indexs++;
                        break;
                    } else if (pnrNum == touristTickets[j].getpnrNo()) {
                        line();
                        System.out.println("Your Seat No.: " + touristTickets[j].getSeatNo());
                        System.out.println("Booking Status: " + touristTickets[j].getticketStatus());
                        line();
                        indexs++;
                        break;
                    } else {
                    }
                }
                if (indexs == -1) {
                    System.out.println("---PNR Number Is Not Found---");
                }
                line();
                // f1.pnrStatusCheck(pnrNum);
            }
            // 4 Option for To print ticket
            else if (in == 4) {
                line();
                System.out.println("***********Print Ticket**********");
                line();
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                int indexs = -1;
                for (int j = 0; j < 10; j++) {
                    if (pnrNum == regularTicket[j].getpnrNo()) {
                        line();
                        printTicketDetails(regularTicket[j]);
                        line();
                        indexs++;
                        break;
                    } else if (pnrNum == touristTickets[j].getpnrNo()) {
                        line();
                        printTicketDetails(touristTickets[j]);
                        line();
                        indexs++;
                        break;
                    } else {
                    }
                }
                if (indexs == -1) {
                    System.out.println("----PNR Number Is Not Found----");
                    line();
                    // f1.printTicket(pnrNum);
                    line();
                }
            }
            // 5 Option for cancel ticket
            else if (in == 5) {
                line();
                System.out.println("***********Cancel Ticket*********");
                line();
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                line();
                int indexs = -1;
                for(int j = 0; j <10;j++){
                    if(pnrNum == regularTicket[j].getpnrNo()){
                        regularTicket[j].setticketStatus("Cancelled");
                        System.out.println("----Your Ticket is Cancelled----");
                        indexs++;
                        break;
                    }
                    else if(pnrNum == touristTickets[j].getpnrNo()) {
                        touristTickets[j].setticketStatus("Cancelled");
                        System.out.println("----Your Ticket is Cancelled----");
                        indexs++;
                        break;
                    } else {}
                }
                if(indexs == -1){
                    System.out.println("----PNR Number Not Found----");
                }
                line();
            }
            //6 option update your tourist ticket destination address
            else if (in == 6) {
                line();
                System.out.println("-----Update Your Ticket Address------");
                System.out.println("Enter Your PNR Number: ");
                int pnrNum = takeInput.nextInt();
                int indexs = -1;
                for(int j = 0; j <10;j++){
                    if(pnrNum == touristTickets[j].getpnrNo()) {
                        line();
                        System.out.println("Enter Hotel Name: ");
                        String hotelName = takeInput.next();
                        line();
                        System.out.println("Enter Location 1: ");
                        String add1 = takeInput.next();
                        line();
                        System.out.println("Enter Location 2: ");
                        String add2 = takeInput.next();
                        line();
                        System.out.println("Enter Location 3: ");
                        String add3 = takeInput.next();
                        line();
                        System.out.println("Enter Location 4: ");
                        String add4 = takeInput.next();
                        line();
                        System.out.println("Enter Location 5: ");
                        String add5 = takeInput.next();
                        line();
                        touristTickets[index].setHotelNameandAddress(hotelName, add1, add2, add3, add4, add5);
                        indexs++;
                        break;
                    }
                }
                if(indexs == -1){
                    System.out.println("----PNR Number Not Found----");
                }



            }
            //update your profile
            else if(in == 7){
                line();
                System.out.println("-----Update Your Ticket Address------");
                System.out.println("Enter Your Passenger Id: ");
                int pnrNum = takeInput.nextInt();
                int indexs = -1;
                for(int j = 0; j <10;j++){
                    if(pnrNum == passenger[j].getPassengerCount()) {
                        line();
                        System.out.println("Enter Your Name: ");
                        String pname = takeInput.next();
                        line();
                        System.out.println("Enter Your Age: ");
                        int page = takeInput.nextInt();
                        line();
                        System.out.println("Enter Your Gender: ");
                        String pgender = takeInput.next();
                        line();
                        passenger[j].updatePassengerDetails(pname, page, pgender);
                        indexs++;
                        System.out.println("-----"+passenger[j].getpName()+" your profile is update successfully-----");
                        break;
                    }
                }
                if(indexs == -1){
                    System.out.println("----Passenger Id Not Found-----");
                }

            }// 0 option for to Exit Program

            else if(in == 0){
                i++;
            }
        }
        takeInput.close();
    }
}
