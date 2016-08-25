
/**
 * Created by Babatunde on 8/23/2016.
 */
public class BankAccount {
    private String accountNumber;       // String number
    private String customerName;
    private String email;               // customerEmailAddress
    private String phoneNumber;         //customerPhoneNumber
    private float amountBalance;         // double balance


    //-- to generate setter and getters using IteliJ
    // --- select code from the tab -> Generate -> selct on the options - > select the fields you want.


//Constructor
    public BankAccount(String acctNum, String customerName, String emailAddress, String phoneNumber , float amountBalance){
        this.customerName = customerName;
        this.accountNumber = acctNum;
        this.email = emailAddress;
        this.phoneNumber = phoneNumber;
        this.amountBalance = amountBalance;
    }

    // Default constructor
    public BankAccount(){
        this.customerName = " ";
        this.accountNumber = "";
        this.email = " ";
        this.phoneNumber = "";
        this.amountBalance = 0;
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
        if (depositFund > amountBalance ) {
                amountBalance += depositFund;
                System.out.println("Amount Deposited in your account: $" + amountBalance);
            }
        }

    // This method would allow the customer to withdraw funds .
    public void setWithdrawFund(float removeFund){
        if (removeFund <= amountBalance ) {
                amountBalance -= removeFund;
        }else{
            System.out.println("You don't have enough funds");
            return; // terminates here if the there is not enough funds in the users account
        }
        // Statement below displays the out come of a successful transaction.
        System.out.println("Amount removed from account : $" + removeFund);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("You withdrew: $" + removeFund ) ;
        System.out.println("Withdrawal complete! Total Balance in your account : $" + Math.round(amountBalance) );

    }

    public void printCustomerDetails(){
       System.out.println("DETAILS: " +"\n"+ "Name: " + customerName + "\n"+ "Acct#: "+ accountNumber +
                          System.lineSeparator()+ "E-mail: " + email + "\n" + "Tel: "+ phoneNumber);
    }

}
