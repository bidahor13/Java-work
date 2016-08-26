


/**
 * Created by Babatunde on 8/23/2016.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("");

        //Test_CASE_1 using default constructor:
        System.out.println("*==================CLIENT 2============================================*");

        BankAccount client = new BankAccount();
        client.setAccountNumber("2398999");
        client.setPhoneNumber(" (541)-298-3499" );
<<<<<<< HEAD
        client.setCustomerName("Sam Sammy");
        client.setEmail("rupert@gmail.com");
=======
        client.setCustomerName("Max");
        client.setEmail("maxT@yahoo.com");
>>>>>>> 44a97f76844ee25be5958e796d0dd109ff0e051d
        client.printCustomerDetails();
        client.setDepositFund(20.50);
        client.setWithdrawFund(20);
        client.setDepositFund(0.50);


        System.out.println("");
        System.out.println("*==================CLIENT 2============================================*");

        //************Test_CASE_2 using a non-default constructor: ****************************//
        BankAccount client_2 = new BankAccount("123456000", "Max Payne", "test@yahoo.com", "(523)-234-5674", 750);
        client_2.printCustomerDetails();
        client_2.setDepositFund(50.0);
        client_2.setWithdrawFund(601.0);
        client_2.setWithdrawFund(199.0);

        System.out.println("");
        System.out.println("*==================CLIENT 3============================================*");
        //************Test_CASE_3: With out a enough funds in the account****************************//
        BankAccount client_3 = new BankAccount("123456000", "Moss Reid", "test@yahoo.com", "(523)-234-5674", 200);
        client_3.printCustomerDetails();
        client_3.setDepositFund(500.0);
        client_3.setWithdrawFund(2000.0);

    }
}
