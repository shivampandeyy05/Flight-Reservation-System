package com.shivampandey;

class Passenger {
    // Attributes
    private static int idCounter = 0;
    private String pname;
    private int page;
    private String pgender;
    // declare

    // Constructor
    private static class Address {
        // Attributes
        String street;
        String city;
        String state;

        // constructor
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        // Attributes
        String phoneNumber;
        String emailId;

        // constructor
        Contact(String phoneNumber, String emailId) {
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }
    }
    private Contact contact;
    Passenger(){}
    public Passenger(String pname, int page, String pgender,String phone, String email,String street, String city, String state) {
        address = new Address(street, city, state);
        contact = new Contact(phone,email);
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
        idCounter++;
    }
    //method
    public String getcontactDetails(){
        return contact.phoneNumber+ " "+ contact.emailId;
    }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
    public void updatePassengerDetails(String pname, int page, String pgender) {
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
    }
    public String getpName() {
        return pname;
    }

    public int getpAge() {
        return page;
    }

    public int getPassengerCount() {
        return idCounter;
    }

    public String getpGender() {
        return pgender;
    }

}