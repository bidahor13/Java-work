
/**
 * Created by Babatunde Idahor on 8/23/2016.
 */
public class BankAccount {
    private String accountNumber;       // String number
    private String customerName;
    private String email;               // customerEmailAddress
    private String phoneNumber;         //customerPhoneNumber
    private double  amountBalance;         // double balance

    //-- to generate setter and getters using IDE
    // --- select code from the tab -> Generate -> selct on the options - > select the fields you want.


//Constructor
    public BankAccount(String acctNum, String customerName, String emailAddress, String phoneNumber , float amountBalance)
    {
        this.customerName = customerName;
        this.accountNumber = acctNum;
        this.email = emailAddress;
        this.phoneNumber = phoneNumber;
        this.amountBalance = amountBalance;
    }

    // Default constructor
    public BankAccount(){
        this.customerName = " ";
        this.accountNumber = " ";
        this.email = " ";
        this.phoneNumber = " ";
        this.amountBalance = 0;
    }


    public double getAmountBalance(){
        return amountBalance;
    }

    // Getter for account account number
    public String getAccountNumber(){
        return accountNumber;
    }
    //Setter for account number
    public void setAccountNumber(String accountNum) {
        this.accountNumber = accountNum;
    }

    // Getter for customer name
    public String getCustomerName(){
        return  customerName;
    }

    //Setter for account Customer Name
    public void setCustomerName(String custName){
        this.customerName = custName;
    }

    //getter for E-mail address
    public String getEmail(){
        return email;
    }

    //Setter for E-mail Address
    public void setEmail(String email){
        this.email = email;
    }

    //Getter for the customer Phone Number
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // setter for the phone number
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

//This method allow the customer to deposit funds(this should increment the balance value)
    public void setDepositFund(double depositFund){
//        if (depositFund > amountBalance ) {
                this.amountBalance += depositFund;
                System.out.println("You account balance after Transaction: $" + amountBalance);
        //return;
            }
       // }

    // This method would allow the customer to withdraw funds .
    public void setWithdrawFund(double withdrawFund){
//        if (withdrawFund <= amountBalance ) {
//                amountBalance -= withdrawFund;
//        }else{
//            System.out.println("You don't have enough funds");
//            return; // terminates here if the there is not enough funds in the users account
//        }

        if(this.amountBalance - withdrawFund < 0) {
            System.out.println("You don't have enought funds!! => Only " + this.amountBalance + " is available for withdrawal." + "\n" + "Your new balance is $"+ this.amountBalance);
        }else{
            this.amountBalance -= withdrawFund;
            System.out.println("You did a withdrwal of $" + withdrawFund +  " processed. Remaining balance is: " +  this.amountBalance);
        }

        // Statement below displays the out come of a successful transaction.
        //System.out.println("Amount removed from account : $" + withdrawFund);
//        System.out.println("*--------------------------------------------------------------------*");
//        System.out.println("You withdrew: $" + withdrawFund ) ;
//        System.out.println("Transaction complete! Total Balance in your account : $" + Math.round(amountBalance) );

    }
    //Method prints out details of the customer
    public void printCustomerDetails(){
       System.out.println("DETAILS: " +"\n"+ "Name: " + customerName + "\n"+ "Acct#: "+ accountNumber +
                          System.lineSeparator()+ "E-mail: " + email + "\n" + "Tel: "+ phoneNumber);
    }

}
