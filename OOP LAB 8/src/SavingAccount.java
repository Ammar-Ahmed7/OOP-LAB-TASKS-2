import java.util.Scanner;
public class SavingAccount extends Account{


   public SavingAccount(){
        super();
    }

    public String steps(){
        System.out.println();
        profit();
        System.out.println();
        zakat();
        System.out.println();
        setCheckFiler(checkFiler);
        System.out.println('\n'+"Do you want to withdraw (Y/N) = ");
        Scanner sc=new Scanner(System.in);
        Character c=sc.next().charAt(0);
        if(c=='Y'||c=='y'){
            withdraw();
        }
        if(c=='N'||c=='n'){
            System.out.println("Your account balance is = "+getOpeningBalance());
        }
        System.out.println();
        getTotalEarning();

        return "";
    }
    public void profit(){
       if(getAge()<35){

           profit=openingBalance*6/100;
           openingBalance=openingBalance+profit;
       }
       if(getAge()>=35 && getAge()<=50){
           profit=openingBalance*7/100;
           openingBalance=openingBalance+profit;
       }
       if(getAge()>50){
           profit=openingBalance*8/100;
           openingBalance=openingBalance+profit;
       }
        System.out.println("Your Profit is = "+openingBalance);
    }


@Override
    public double withdraw(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you wanna withdraw = ");
        double w1=sc.nextDouble();
        if(checkFiler ==true){
            double p=profit*0.02;
            double with=w1+(p);
            openingBalance=openingBalance-with;
            profit=profit-p;
        }
        if(checkFiler==false){
            double p=profit*0.04;
            double with=w1+(p);
            openingBalance=openingBalance-with;
            profit=profit-p;
        }
        System.out.println("Your leftover Balance is = "+getOpeningBalance());
        System.out.println("Deduction of tax from profit is = "+getProfit());
        return super.withdraw();
    }

    @Override
    public double getTotalEarning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Total Earning is = " + openingBalance);
        char ch4;
        do {
            System.out.println("Do you want to Reinvest (Y/N) = ");
            ch4 = sc.next().charAt(0);
            while(ch4!='Y' && ch4!='y' && ch4!='N' && ch4!='n'){
                System.out.println("Press Y or N ");
                System.out.println("Do you want to Reinvest (Y/N) = ");
                ch4 = sc.next().charAt(0);
            }

            switch (ch4) {
                case 'Y':
                    deposit();
                    break;
                case 'y':
                    deposit();
                    break;
                case 'N':
                    break;
                case 'n':
                    break;
            }
        } while (ch4=='Y' || ch4=='y');
        return super.getTotalEarning();
    }

    public void deposit(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount = ");
        double a=sc.nextDouble();
        if(checkFiler==true){
            double p=profit*0.15;
            double dep=a-(p);
            cap=openingBalance+dep;
            aftercap=openingBalance-cap;
            openingBalance=cap;
        }
        if(checkFiler==false){
            double p=profit*0.25;
            double dep=a-(p);
            cap=openingBalance+dep;
            aftercap=openingBalance-cap;
            openingBalance=cap;
        }
        System.out.println("Your Earning after Reinvesting is = "+getOpeningBalance());

    }


    @Override
    public double zakat(){
      if(checkZakat==true){
          double z=openingBalance*0.025;
          zakat=openingBalance-z;
          afterZakat=openingBalance-zakat;
          openingBalance=zakat;
          System.out.println("Your balance after Zakat deduction is = "+getOpeningBalance());
          System.out.println("The amount deducted for zakat is = " +getAfterZakat());
      }

        return super.zakat();
    }

    @Override
    public String toString() {
        return steps() ;

    }

}
