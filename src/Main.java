


/**
 * Created by Babatunde on 8/23/2016.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("");

        //Test_1 using default constructor:
        System.out.println("==================CLIENT 1==========================");

        BankAccount client = new BankAccount();
        client.setAccountNumber("2398999");
        client.setPhoneNumber(" (541)-298-3499" );
        client.setCustomerName("Babatunde Idahor");
        client.setEmail("tundahor@yahoo.com");
        client.printCustomerDetails();
        client.setDepositFund(20.50);
        client.setWithdrawFund(50);


        System.out.println("");
        System.out.println("==================CLIENT 2==========================");

        //************Test_2 using a non-default constructor: ****************************//
        BankAccount client_2 = new BankAccount("123456000", "Max Payne", "test@yahoo.com", "(523)-234-5674", 0.0f);
        client_2.printCustomerDetails();
        //client_2.getAccountNumber();
        //client_2.getCustomerName();

        //inputs transactions
        // Add $100.99 cents
        client_2.setDepositFund(100.0f);
        client_2.setDepositFund(1000.0f);
        client_2.setWithdrawFund(600.1f);
    }
}
