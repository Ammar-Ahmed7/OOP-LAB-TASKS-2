public class ManagementStudent extends ManagementDepartment{
    public String studentName;
    public int studentId;

    public ManagementStudent(String universityName, String address, int rank, String CSName, String timeRequired, int fee, String studentName, int studentId) {
        super(universityName, address, rank, CSName, timeRequired, fee);
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "\nStudent Name: "+ studentName+
                "\nStudentID: "+ studentId+
                super.toString();
    }
}
