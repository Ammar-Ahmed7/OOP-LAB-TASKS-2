public class CommissionEmployee extends Employee{

    private double commissionRate;
    private double grossAmount;



    CommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double commissionRate, double grossAmount){
        super(firstName,lastName,socialSecurityNumber);
            this.commissionRate=commissionRate;
            this.grossAmount=grossAmount;


    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }




    double commissionSalary()
    {
        double com = (grossAmount * commissionRate) * 100;
        return com;
    }
    double earn()
    {
        double inc = 0;
        if(commissionSalary() > 10000.00 && commissionSalary() <20000.00)
        {
            inc = commissionSalary()+5000;
        }
        else if(commissionSalary() > 20000.00 && commissionSalary() < 50000.00)
        {
            inc = commissionSalary()+10000;
        }
        else if(commissionSalary() > 50000.00)
        {
            inc = commissionSalary()+20000;;
        }
        else
            inc = commissionSalary();
        return inc;
    }


    @Override
    public String toString() {
        return super.toString()+" " +
                "commissionRate=" + commissionRate +
                ", grossAmount=" + grossAmount +
                ", commsission=" + earn()
                ;
    }
}
