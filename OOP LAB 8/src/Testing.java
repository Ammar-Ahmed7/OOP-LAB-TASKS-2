import java.util.ArrayList;
import java.util.Scanner;
public class Testing {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<CurrentAccount> ca = new ArrayList<>();
        ArrayList<SavingAccount> sa = new ArrayList<>();
        ArrayList<InvestmentAccount> ia = new ArrayList<>();

        char chr;
        do {
            System.out.println();
            System.out.println("Press 1 for current Account ");
            System.out.println("Press 2 for Saving Account ");
            System.out.println("Press 3 for Investment Account ");

            System.out.print("Enter Your Choice = ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    ca.add(new CurrentAccount());
                    System.out.println(ca);
                    break;
                case 2:
                    System.out.println();
                    sa.add(new SavingAccount());
                    System.out.println(sa);

                    break;
                case 3:
                    System.out.println();
                    ia.add(new InvestmentAccount());
                    System.out.println(ia);
                    break;


            }

            System.out.println('\n'+"Total profit paid by Bank is = " + Account.getTotalPaidProfit(sa,ia));
            System.out.println("Do you want open an Account again (Y/N)= ");
            chr = sc.next().charAt(0);
        } while (chr == 'Y' || chr == 'y');


    }
}



