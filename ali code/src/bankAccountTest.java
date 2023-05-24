import java.util.Scanner;
public class bankAccountTest {
    static int choice = 0;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your name = ");
            String name = input.nextLine();

            System.out.println("Enter your balance = ");
            double balance = input.nextDouble();

            bankAccount account = new bankAccount(name, balance);

            do{
                System.out.println("Press key '1' to deposit the amount.");
                System.out.println("Press key '2' to withdraw your amount.");
                System.out.println("Press key '3' to check your balance.");
                System.out.println("Press key '4' to end the program.");
                choice = input.nextInt();

                switch (choice){
                    case 1:
                        account.deposit(getAmount());
                        break;
                    case 2:
                        if(account.balance < 50000){
                            System.out.println("If you will withdraw the amount your balance will get less than 50000. Press key '1' to withdraw and '0' to end.");
                            if (input.nextInt() == 1) continue;
                            account.deposit(getAmount());
                            break;
                        }
                    case 3:
                        System.out.println("Your balance is = " + account.balance);
                        break;
                }
            } while (choice != 4);

            System.out.println("Name = " + account.getName());
            System.out.println("Total number of deposits made = " + account.getCounter1());
            System.out.println("Total number of withdraws made = " + account.getCounter2());
            System.out.println("Total Balance = " + account.getBalance());


        }
        public static double getAmount() {
            Scanner data = new Scanner(System.in);
            System.out.println("Enter your amount = ");
            double amount = data.nextDouble();
            return amount;

        }
    }


