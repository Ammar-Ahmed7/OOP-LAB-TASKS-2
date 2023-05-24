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
        Login();
        deposit();
        withdraw();

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

        System.out.print("Congratulations Your "+Acctype+" has been successfully created !!! ");
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
        System.out.print("\n Enter your name = ");
        String n2=sc.next();
        while(!n2.equals(getName())){
            System.out.print("\nInvalid name !! \nEnter your name = ");
            n2=sc.next();
        }

        System.out.print("\n Enter your Password = ");
        String pass2=sc.next();
        while(!pass2.equals(getPassword())){
            System.out.print("\nInvalid Password !! \n Enter your Password = ");
            pass2=sc.next();
        }

        System.out.println("Welcome !!!");
    }

    public void deposit(){
       Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the amount you want to deposit = ");
        double deposit=sc.nextDouble();
        Balance=Balance+deposit;
        System.out.println("Your balance after deposit = "+getBalance());
    }

    public void withdraw(){
       Scanner sc=new Scanner(System.in);
        System.out.print("\n Your balance before withdrawal = "+getBalance());
        System.out.print("\nEnter the amount you want to withdraw = ");
        double withdraw=sc.nextDouble();
        Balance=Balance-withdraw;
        System.out.println("Your balance after withdraw = "+getBalance());
    }
    public double getBalance() {
        return Balance;
    }



}
