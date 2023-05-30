import java.sql.SQLOutput;
import java.util.Scanner;
public class Manager extends Acc_and_Mang_Abstract{
   public static boolean op;
    public Manager(){
        super();
        Login();
        LoanApproval();
    }

    @Override
    public void Login() {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n \t MANAGER LOGIN");
        System.out.print("\n Enter Name = ");
        String Mna=sc.next();

        System.out.print("\n Enter Password = ");
        String Mpass = sc.next();

        System.out.print("\n \t WELCOME!!! ");
    }
     public void LoanApproval(){
        Scanner sc=new Scanner(System.in);
         if(Accountant.getLoan()>0){
             System.out.print("\n Name = "+ Accountant.getName());
             System.out.print("\n CNIC = "+ Accountant.getCNIC());
             System.out.print("\n Loan applied = "+ Accountant.getLoan());
             System.out.print("\n Do you approve (Y/N) = ");
             char ch =sc.next().charAt(0);
             if((ch=='Y') || (ch=='y')){
                 op = true;
                 System.out.print("\n Loan has been Approved");
             }else{
                 op = false;
                 System.out.print("\n Loan not approved");
             }

         }
     }
}
