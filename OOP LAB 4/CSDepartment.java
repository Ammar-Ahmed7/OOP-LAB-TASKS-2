public class CSDepartment extends Universaty{
    public String CSName;
    public String timeRequired;
    public int fee;

    public CSDepartment(String universityName, String address, int rank, String CSName, String timeRequired, int fee) {
        super(universityName, address, rank);
        this.CSName = CSName;
        this.timeRequired = timeRequired;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "\nDepartment Name : "+ this.CSName+
                "\nTime Required : "+ timeRequired+
                "\nFee : "+ fee+
                super.toString();
    }
}
