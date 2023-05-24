public class bankAccount {


        public double balance;
        public String name;
        public int counter1;
        public int counter2;

        public void deposit(double amount){
            if (balance >= 100000)
                amount = (amount) + ((amount) * (1/100));
            balance = balance + amount;
            counter1++;
        }
        public void withdraw(double amount){
            if(balance < 50000)
                amount = (amount) + ((amount) * (2/100));
            balance = balance - amount;
            counter2++;
        }
        public bankAccount(String name, double balance){
            this.balance=balance;
            this.name=name;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public int getCounter1() {
            return counter1;
        }

        public int getCounter2() {
            return counter2;
        }

}

