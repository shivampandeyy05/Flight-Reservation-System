package com.shivampandey;

public class Address {
    //Attributes
    private String street;
    private String city;
    private String state;
    //constructor
    Address(){}
    //methods
    //setter method for Address Details.
    public void setAddressDetails(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
    //getter method for addressDetails
    public String getAddressDetails(){
        return street+", "+city+", "+state;
    }
}
