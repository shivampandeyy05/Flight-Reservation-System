package com.shivampandey;

class Contact {
    //Attributes
    private String phoneNumber;
    private String emailId;
    //constructor
    Contact(){}
    //methods
    // deatails setter mathod
    public void setConatactDetial(String phoneNumber, String emailId){
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
    //emailId getter method
    public String getEmailId(){
        return emailId;
    }
    //phoneNumber getter method
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
