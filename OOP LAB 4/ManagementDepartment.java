public class ManagementDepartment extends Universaty{
    public String managementName;
    public String timeRequired;
    public int fee;

    public ManagementDepartment(String universityName, String address, int rank, String managementName, String timeRequired, int fee) {
        super(universityName, address, rank);
        this.managementName = managementName;
        this.timeRequired = timeRequired;
        this.fee = fee;
    }



    @Override
    public String toString() {
        return "\nDepartment Name : "+ this.managementName+
                "\nTime Required : "+ timeRequired+
                "\nFee : "+ fee+
                super.toString();
    }
}
