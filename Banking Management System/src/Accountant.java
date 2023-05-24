import java.sql.SQLOutput;
import java.util.Scanner;
public class Accountant extends Acc_and_Mang_Abstract{

    private String name;
    private String CNIC;

    private String Password;


    private String Acctype;

    private double Balance;

   public Accountant(){
        CreateAccount();
       // Login();
       while(true) {
           deposit();
           withdraw();
           BillProcess();
           viewBalance();
           TransferMoney();
           ChangePin();
       }
    }

    public void CreateAccount() {
      Scanner sc=new Scanner(System.in);

        System.out.print("\n Enter your name = ");
        String n=sc.next();
        name=n;

        System.out.print("\n Enter your CNIC = ");
        String id=sc.next();
        for( int i=0 ; i<id.length();i++){
          while(id.charAt(i)>='a' && id.charAt(i)<='z' || id.charAt(i)>='A' && id.charAt(i)<='z'){
              System.out.println("\n Invalid CNIC \n Try again = ");
              id=sc.next();
          }
        }
        CNIC=id;

        System.out.print("\n Enter the account type you want to open \n 1.Saving \n 2.Current \n");
        String accT=sc.next();
        while(!accT.equals("Saving") && !accT.equals("Current") && !accT.equals("saving") && !accT.equals("current")){
            System.out.print("\nInvalid Input Type Saving or Cuurent = ");
            accT=sc.next();
        }
        Acctype=accT;


        System.out.print("\n Enter the Password you want to create for Login = ");
        String pass=sc.next();
        Password=pass;

        System.out.print("\n Congratulations Your "+Acctype+" has been successfully created !!! ");
   }

    public String getName() {
        return name;
    }
    public String getAcctype() {
        return Acctype;
    }
    public String getCNIC() {
        return CNIC;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public void Login() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t ACCOUNTANT LOGIN\n");
        System.out.print("Enter your name = ");
        String n2=sc.next();

        System.out.print("\n Enter your Password = ");
        String pass2=sc.next();

        System.out.println("\n Welcome !!!");
    }

    public void deposit(){
       Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the amount you want to deposit = ");
        double deposit=sc.nextDouble();
        Balance=Balance+deposit;
        System.out.println("\n Your balance after deposit = "+getBalance());
    }

    public void withdraw(){
       Scanner sc=new Scanner(System.in);
        System.out.print("\n Your balance before withdrawal = "+getBalance());
        System.out.print("\nEnter the amount you want to withdraw = ");
        double withdraw=sc.nextDouble();
        if(getBalance()<withdraw){
            System.out.println("\n Insufficient Balance to withdraw ");
        }else {
            Balance = Balance - withdraw;
            System.out.println("\n Your balance after withdraw = " + getBalance());
        }
        }
    public double getBalance() {
        return Balance;
    }

    public void BillProcess(){
       Scanner sc=new Scanner(System.in);
       System.out.print("\n Enter your name = ");
       String n3=sc.next();
       while(!n3.equals(getName())){
           System.out.print("\n Invalid name \n Enter a valid registered name = ");
           n3=sc.next();
       }
        System.out.print("\nEnter your CNIC = ");
        String id2=sc.next();
        while(!id2.equals(getCNIC())){
            System.out.print("\n Invalid CNIC \n Enter a valid registered CNIC = ");
            id2=sc.next();
        }
        System.out.print("\nEnter your Bill Number = ");
        String billNo=sc.next();
        System.out.print("\n Enter Bill amount = ");
        double billam=sc.nextDouble();
        if(getBalance()<billam){
            System.out.println("\n Insufficient Balance to process the Bill. Please deposit some money into your account to process the Bill");
        }else {
            Balance = Balance - billam;
            System.out.println("\n Bill Successfully has been Processed");
        }
    }

    public void viewBalance(){
       Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter your name = ");
        String n4=sc.next();
        while(!n4.equals(getName())){
            System.out.print("\n Invalid name \n Enter a valid registered name = ");
            n4=sc.next();
        }
        System.out.print("\n Enter your Password = ");
        String pass3=sc.next();
        while(!pass3.equals(getPassword())){
            System.out.print("\n Invalid Password \n Enter a valid registered Password = ");
            pass3=sc.next();
        }
        System.out.println("Your Balance is = "+getBalance());

    }

    public void TransferMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter your name = ");
        String n5=sc.next();
        while(!n5.equals(getName())){
            System.out.print("\n Invalid name \n Enter a valid registered name = ");
            n5=sc.next();
        }
        System.out.print("\n Enter your Password = ");
        String pass4=sc.next();
        while(!pass4.equals(getPassword())){
            System.out.print("\n Invalid Password \n Enter a valid registered Password = ");
            pass4=sc.next();
        }
        System.out.print("\n Enter the Account Number you want to transfer money = ");
        String accno=sc.next();

        System.out.print("\n Enter the amount you want to deposit = ");
        double am=sc.nextDouble();
        if(getBalance()<am){
            System.out.print("\n Insufficient Balance for transfering money");
        }else{
              Balance = Balance - am;
            System.out.print("\n Money has been successfully Transferred ");
            System.out.println("\n Your Balance after transfering money = "+getBalance());
        }
    }

    public void ChangePin(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter your name = ");
        String n6=sc.next();
        while(!n6.equals(getName())){
            System.out.print("\n Invalid name \n Enter a valid registered name = ");
            n6=sc.next();
        }
        System.out.print("\n Enter your Current Password = ");
        String pass5=sc.next();
        while(!pass5.equals(getPassword())){
            System.out.print("\n Invalid Password \n Enter a valid registered Password = ");
            pass5=sc.next();
        }
        System.out.print("\n Enter your New Password = ");
        String pass6=sc.next();

        System.out.print("\n Confirm your New Password = ");
        String pass7=sc.next();
        while(!pass7.equals(pass6)){
            System.out.print("\n Invalid Confirmation \n Enter new valid Password for Confirmation = ");
            pass7=sc.next();
        }
        Password=pass7;
        System.out.println("\n Your Password has been successfully changed ");

    }


}
