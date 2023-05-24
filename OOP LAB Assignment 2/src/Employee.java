public class Employee {
    private final String firstName;
    private final String lastName;
    private final int socialSecurityNumber;

    public Employee(String firstName,String lastName,int socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;

    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public int getsocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber
                ;
    }
}
