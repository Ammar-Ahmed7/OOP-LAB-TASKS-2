public class bankAcc {

    private String firstName;
    private String lastName;
    private Double openingBalance;
    private int accountNumber;
    private String email;
    private Date openingDate;
    private Address add;
    private double money;

    public bankAcc(String firstName, String lastName, Double openingBalance, int accountNumber, String email, Date openingDate, Address add)
    {

        this.firstName = firstName;
        this.lastName = lastName;
        this.openingBalance = openingBalance;
        this.accountNumber = accountNumber;
        this.email = email;
        this.openingDate = openingDate;
        this.add = add;

    }


    @Override
    public String toString() {
        return "bankAcc" + "\n" +
                "firstName=" + firstName + '\n' +
                "lastName=" + lastName + '\n' +
                "openingBalance=" + openingBalance + '\n' +
                "accountNumber=" + accountNumber + '\n' +
                "email='" + email + '\n' +
                "openingDate=" + openingDate.toString() + '\n' +
                "add=" + add +
                '\n';
    }

    public double draw(double money)
    {
        if (openingBalance >= money)
        {
            this.openingBalance = openingBalance - money;
        }
        return openingBalance;
    }

    public double deposit(double money) {
     this.openingBalance=this.openingBalance+money;
     return this.openingBalance;
    }


    public double getopeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }
}
