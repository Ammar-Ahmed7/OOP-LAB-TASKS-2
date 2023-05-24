public class BankAccount {
    //class member
    private static int accountCounter;
    // instance variables
    private String firstName;
    private String lastName;
    private double openingBalance;
    private int accountNum;
    private String email;
    private Date openingDate;


    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", openingBalance=" + openingBalance +
                ", accountNum=" + accountNum +
                ", email='" + email + '\'' +
                ", openingDate=" + openingDate +
                '}';
    }

    public BankAccount(String firstName, String lastName, double openingBalance, String email){


        this.firstName=firstName;
        this.lastName=lastName;
        this.openingBalance=openingBalance;
        this.accountNum=++accountCounter;
        this.email="No email Provided";
        //print

    }
    public BankAccount(String firstName,String lastName,double openingBalance,Date openingDate,String email)
    {
        this(firstName,lastName,openingBalance,openingDate);
        this.email=email;
        openingDate.setDay(12);
        openingDate.setMonth(2);
        openingDate.setYear(2018);

        //print
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public int getAccountNum() {
        return accountNum;
    }

 /*   public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }*/

    public void display()
    {
        System.out.printf("First Name = %s %n",getFirstName());
        System.out.printf("Last Name = %s %n",getLastName());
        System.out.printf("OpeningBalance = %.2f %n",getOpeningBalance());
        System.out.printf("AccountNumber = %d %n",getAccountNum());

    }

     public static void nonSense()
     {
         System.out.println("Non Sense function");
     }



     static{
        for(int i=0;i<10;i++){
             System.out.println(i);
         }
     }

    {
        System.out.println("Welcome to our bank");
    }



}
