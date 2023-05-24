public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double commissionRate, double grossAmount, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,commissionRate,grossAmount);
        this.baseSalary=baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
