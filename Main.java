package com.Babatunde;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ");

        //TEST CASE 1 :
        System.out.println("+===============CLIENT 1=====================+");
        VipCustomer client_1 = new VipCustomer();
        System.out.println("NAME: "+ client_1.getName() );
        System.out.println("CREDIT LINE: "+ client_1.getCreditLine());

        // TEST CASE 2 :
        System.out.println("+===============CLIENT 2=====================+");
        VipCustomer client_2 = new VipCustomer("Joe James", 200.00);
        System.out.println("NAME: "+ client_2.getName() );
        System.out.println("CREDIT LINE: "+ client_2.getCreditLine());


        // TEST CASE 3 :
        System.out.println("+===============CLIENT 3=====================+");
        VipCustomer client_3 = new VipCustomer("Keith Maia", 1000.00, "kMaia@aol.com");
        System.out.println("NAME: "+ client_3.getName() );
        System.out.println("CREDIT LINE: "+ client_3.getCreditLine());


    }
}
