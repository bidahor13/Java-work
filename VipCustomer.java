package com.Babatunde;

/**
 * Created by Babatunde on 8/25/2016.
 */
public class VipCustomer {

    private String name;
    private int zipCode;	
    private double creditLine;
    private String emailAddress;

    //Default constructor - 1st constructor
    public VipCustomer(){
        //this.name = "Chalie Sheen";
        //this.creditLine = 200;
        //this.emailAddress = "chalie.sheen@aol.com";

        /*
        * Better way to do this is - which is the
        * same as the constructor above.
        * */
        this("Caroline Davindenko", 200 , "cDavindenko@aol.com");
    }

    //   2nd constructor
    public VipCustomer(String name, double creditLine){
        this(name, creditLine, "bing@microsoft.com");
    }

    //non- default constructor - 3rd constructor
    public VipCustomer(String name, double creditLine, String emailAddress, zipCode){
        this.name =name;
        this.creditLine = creditLine;
        this.emailAddress = emailAddress;
        this.zipCode = zipCode;
    }

    /* Returns the name of the Vip customer */
    public String getName() {
        return name;
    }
    /* Returns the credit line of the Vip customer
    @credit line */
    public double getCreditLine() {
        return creditLine;
    }
    /*Returns the name of the email address of the customer   @email address */
    public String getEmailAddress() {
        return emailAddress;
    }

     public int getZipCode(){
        return zipCode;   	
}



}
