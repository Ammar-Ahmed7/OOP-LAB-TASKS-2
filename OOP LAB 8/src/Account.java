import java.util.ArrayList;
import java.util.Scanner;
public class Account {
    private int id;
    private String accountHolderName;
    public double openingBalance;
    private int age;

    public double zakat;

    public double profit;

    public boolean checkFiler;

    public boolean checkZakat;

    public  double afterZakat;

    public double getCap() {
        return cap;
    }

    public double cap;

    public double getAftercap() {
        return aftercap;
    }

    public double aftercap;

    public Account() {
        setId(id);
        setAccountHolderName(accountHolderName);
        setOpeningBalance(openingBalance);
        setAge(age);
        setCheckZakat(checkZakat);


    }
    public void setId(int id) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your ID = " );
        int id1 = sc.nextInt();
        this.id=id1;

    }

    public void setAccountHolderName(String accountHolderName) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Holder's Name = " );
        String accountHolderName1 = sc.next();
        this.accountHolderName=accountHolderName1;
    }

    public void setOpeningBalance(double openingBalance) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Opening Balance = " );
        Double openingBalance1 = sc.nextDouble();
        this.openingBalance=openingBalance1;
    }

    public void setAge(int age) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age = " );
        int age1 = sc.nextInt();
        this.age=age1;
    }

    public void setCheckFiler(boolean checkFiler){
        Scanner sc=new Scanner(System.in);
        System.out.print("Are you a Filer or a Non-Filer (F/N) = " );
        Character ch2 = sc.next().charAt(0);
        if(ch2=='F'||ch2=='f'){
            checkFiler =true;
        }
        if(ch2=='N'||ch2=='n'){
            checkFiler =false;
        }
        while (ch2!='F'&& ch2!='f' && ch2!='N'&& ch2!='n'){
            System.out.println("Press F for Filer or N for Non-Filer ");
            System.out.print("Are you a Filer or a Non-Filer (F/N) = " );
             ch2 = sc.next().charAt(0);
            if(ch2=='F'||ch2=='f'){
                checkFiler =true;
            }
            if(ch2=='N'||ch2=='n'){
                checkFiler =false;
            }

        }
        this.checkFiler = checkFiler;
    }

    public void setCheckZakat(boolean checkZakat){
        Scanner sc=new Scanner(System.in);
        System.out.print("Do you want to opt for Zakat (Y/N) = " );
        Character ch3 = sc.next().charAt(0);
        if(ch3=='Y'||ch3=='y'){
            checkZakat =true;
        }
        while (ch3!='N'&& ch3!='n' && ch3!='Y'&& ch3!='y'){
            System.out.println("Press Y or N ");
            System.out.print("Do you want to opt for Zakat (Y/N) = " );
            ch3 = sc.next().charAt(0);
            if(ch3=='Y'||ch3=='y'){
                checkZakat =true;
            }
        }
        this.checkZakat = checkZakat;

    }



    public int getId() {
        return id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Double getOpeningBalance() {
        return openingBalance;
    }

    public double getZakat() {
        return zakat;
    }

    public int getAge() {
        return age;
    }
    public boolean isCheckFiler() {
        return checkFiler;
    }
    public boolean isCheckZakat() {
        return checkZakat;
    }

    public double getProfit() {
        return profit;
    }
    public double getAfterZakat() {
        return afterZakat;
    }

    public static double getTotalPaidProfit(ArrayList<SavingAccount> s,ArrayList<InvestmentAccount> i){
        double p=0;
        double p2=0;
        for(int in=0;in<s.size();in++){
            p+=s.get(in).profit;
        }
        for(int j=0;j<i.size();j++){
            p2+=i.get(j).profit;
        }
        return p+p2;
    }


    public double withdraw(){
        return 0;
    }

    public double zakat(){
        return 0;
    }

    public double getTotalEarning(){
        return 0;
    }

}
