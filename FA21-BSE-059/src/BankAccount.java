
import java.util.Scanner;
public class BankAccount {
    private String name;
    private Double balance;
    private int getDeposit = 0;
    private int getWithdraw = 0;

    private int Date1;
    private int Date2;
    private int Month1;
    private int Month2;
    private int Year1;
    private int Year2;

    int counter=0;


    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (balance >= 100000) {
            balance = balance + amount + amount / 100;
            System.out.println("As you have a minimum 100,000 in your account Balance yor received additional 1% of your deposited amount");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (balance < 50000) {
            System.out.println("Are you sure you want to withdraw, it would make your balance below 50,000. Press 1 to continue and 0 to abort");
            Scanner sc2 = new Scanner(System.in);
            int c = sc2.nextInt();

            switch (c) {
                case 1:
                    balance = balance - amount - (0.02 * amount);
                    break;

                case 0:
                    break;
            }
        } else {
            balance = balance - amount;
        }
    }

    public double getbalance() {
        return balance;
    }

    public int getDeposit() {
        return getDeposit++;
    }

    public int getWithdraw() {
        return getWithdraw++;
    }

    @Override
    public String toString() {
        return
                '\n'+"Account Title = " + name + '\n' +
                        "Total deposits =" + getDeposit + '\n' +
                        "Total withdraw = " + getWithdraw + '\n' +
                        "Balance = " + balance + '\n'
                ;
    }

    public void subscriptionDate() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println('\n' + "Enter Today's date of Subscription DD/MM/YY ");

        System.out.print('\n' + "DATE = ");
        Date1 = sc3.nextInt();

        System.out.print("MONTH = ");
        Month1 = sc3.nextInt();

        System.out.print("YEAR = ");
        Year1 = sc3.nextInt();

    }

    public int getDate1() {
        return Date1;
    }

    public int getMonth1() {
        return Month1;
    }

    public int getYear1() {
        return Year1;
    }

    public int getDate2() {
        return Date2;
    }

    public int getMonth2() {
        return Month2;
    }

    public int getYear2() {
        return Year2;
    }




    public void dateValidation() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("NOTE: (Annual Subscription fee will be deducted if a year has been passed)");
        System.out.println("DD/MM/YY");

        System.out.print('\n' + "DATE = ");
        Date2 = sc3.nextInt();

        System.out.print("MONTH = ");
        Month2 = sc3.nextInt();

        System.out.print("YEAR = ");
        Year2 = sc3.nextInt();
    }


    public void createAccount() {
        subscriptionDate();
        System.out.print('\n' + "Enter 1 to open a Standard Account or 2 for Premium Account = ");
        Scanner sc3 = new Scanner(System.in);
        int c2 = sc3.nextInt();
        switch (c2) {
            case 1:
                System.out.print('\n' + "Choose any one of the Subscription" + '\n');
                System.out.print('\n' + "Enter 1 for SMS Alert" + '\n' + "Enter 2 for Debit Card" + '\n' + "Enter 3 for both SMS Alert and Debit Subscription" + '\n');
                int c3 = sc3.nextInt();
                switch (c3) {
                    case 1:
                            dateValidation();
                            if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                                for (int i = 0; i < Year2-Year1; i++) {
                                balance = balance - 2000;
                            }
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                            }

                        else {
                            System.out.println("Balance = " + getbalance());
                            System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                        }
                        break;

                    case 2:
                        dateValidation();
                        if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                            for (int i = 0; i < Year2-Year1; i++) {
                                balance = balance - 5000;
                            }
                            System.out.println("Balance = " + getbalance());
                            System.out.println("Congratulations Your Standard Account has been Successfully Created ");

                        } else {
                            System.out.println("Balance = " + getbalance());
                            System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                        }
                        break;


                    case 3:
                        dateValidation();
                        if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                            for (int i = 0; i < Year2-Year1; i++) {
                                balance = balance - 7000;
                            }
                            System.out.println("Balance = " + getbalance());
                            System.out.println("Congratulations Your Standard Account has been Successfully Created ");

                        } else {
                            System.out.println("Balance = " + getbalance());
                            System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                        }
                        break;
                }
                break;


            case 2:
                if (getbalance() >= 3000000) {
                    System.out.println('\n'+"Subsription fee will be charged as you have 3000000 balance in your account");
                    System.out.print('\n' + "Choose any one of the Subscription" + '\n');
                    System.out.print('\n' + "Enter 1 for SMS Alert" + '\n' + "Enter 2 for Debit Card" + '\n' + "Enter 3 for both SMS Alert and Debit Subscription" + '\n');
                    int c4 = sc3.nextInt();
                    switch (c4) {
                        case 1:
                            dateValidation();
                            if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                                for (int i = 0; i < Year2-Year1; i++) {
                                    balance = balance - 2000;
                                }
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");

                            } else {
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                            }
                            break;


                        case 2:
                            dateValidation();
                            if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                                for (int i = 0; i < Year2-Year1; i++) {
                                    balance = balance - 5000;
                                }
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");

                            } else {
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                            }
                            break;


                        case 3:
                            dateValidation();
                            if ((getYear2() > getYear1() && getMonth2() >= getMonth1() && getDate2() >= getDate1())) {
                                for (int i = 0; i < Year2-Year1; i++) {
                                    balance = balance - 7000;
                                }
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");

                            } else {
                                System.out.println("Balance = " + getbalance());
                                System.out.println("Congratulations Your Standard Account has been Successfully Created ");
                            }
                            break;
                    }

                }
                else {
                    System.out.println(getbalance());

                    System.out.print('\n' + "Choose any one of the Subscription" + '\n');
                    System.out.print('\n' + "Enter 1 for SMS Alert" + '\n' + "Enter 2 for Debit Card" + '\n' + "Enter 3 for both SMS Alert and Debit Subscription" + '\n');
                    int c5 = sc3.nextInt();
                    switch (c5) {
                        case 1:
                            System.out.println("Congratulations Your Premium Account has been Successfully Created ");
                            System.out.println("Balance = " + getbalance());
                            break;


                        case 2:
                            System.out.println("Congratulations Your Premium Account has been Successfully Created ");
                            System.out.println("Balance = " + getbalance());
                            break;


                        case 3:
                            System.out.println("Congratulations Your Premium Account has been Successfully Created ");
                            System.out.println("Balance = " + getbalance());
                            break;
                    }

                }

        }

    }


}
