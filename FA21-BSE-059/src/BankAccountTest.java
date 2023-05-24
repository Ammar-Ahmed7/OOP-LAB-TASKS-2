import java.util.Scanner;
public class BankAccountTest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        System.out.print("Enter your account balance = ");
        double balance = sc.nextDouble();


        BankAccount acc = new BankAccount(name, balance);


        while(true) {

            System.out.println('\n'+"Press 1: To Deposit an amount" + '\n' + "Press 2: To Withdraw an amount" + '\n' + "Press 3: To View the current Balance" + '\n' + "Press 4: To Create a new Account" +'\n'+ "Press 5: To terminate the program");
            System.out.println('\n'+"Enter your choice");
            int choice = sc.nextInt();



            switch (choice) {
                case 1:
                    System.out.print('\n'+"Enter the amount you want to deposit in your account = ");
                    acc.deposit(sc.nextDouble());
                    acc.getDeposit();
                    break;

                case 2:
                    System.out.print('\n'+"Enter the amount you want to withdraw in your account = ");
                    acc.withdraw(sc.nextDouble());
                    acc.getWithdraw();
                    break;

                case 3:
                    System.out.println(acc.toString());
                    break;

                case 4:
                    acc.createAccount();
                    break;

                case 5:
                    System.exit(1);
                    break;



            }
        }



    }



}
