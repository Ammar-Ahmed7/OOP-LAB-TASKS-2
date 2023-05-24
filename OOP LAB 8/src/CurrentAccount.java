import java.util.Scanner;
public class CurrentAccount extends Account{

   public CurrentAccount(){
       super();
   }
   public String steps3(){
       currentBalance();
       System.out.println();
       zakat();
       System.out.println('\n'+"Do you want to withdraw (Y/N) = ");
       Scanner sc=new Scanner(System.in);
       Character c3=sc.next().charAt(0);
       if(c3=='Y'||c3=='y'){
           withdraw();
       }
       if(c3=='N'||c3=='n'){
           System.out.println("Your account balance is = "+getOpeningBalance());
       }

       return "";
   }

   public void currentBalance(){
       System.out.println("Your Current Balance is = "+getOpeningBalance());
   }

    @Override
    public double withdraw() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you wanna withdraw = ");
        double w3=sc.nextDouble();
        openingBalance=openingBalance-w3;
        System.out.println("Your leftover Balance is = "+openingBalance);
        return super.withdraw();
    }

    @Override
    public double zakat(){
        if(checkZakat==true){
            double z=openingBalance*0.025;
            zakat=openingBalance-z;
            afterZakat=openingBalance-zakat;
            openingBalance=zakat;
        }
        System.out.println("Your balance after Zakat deduction is = "+getOpeningBalance());
        System.out.println("The amount deducted for zakat is = " +getAfterZakat());
        return super.zakat();
    }

    @Override
    public String toString() {
        return steps3();
    }
}
