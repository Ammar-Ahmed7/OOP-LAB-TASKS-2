public class HourlyEmployee extends Employee{
   private double hours;
   private double wages;

    HourlyEmployee(String firstName, String lastName, int socialSecurityNumber, double hours, double wages){
       super(firstName,lastName,socialSecurityNumber);
        this.hours=hours;
        this.wages=wages;
        if(hours<0 || hours>168)
            throw new IllegalArgumentException("Hours must be between 0 to 168");

        if (wages<0)
            throw new IllegalArgumentException("wage must be non-negative");


   }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
            this.wages = wages;

    }

    public double HourlyEmployeeEarning(){
       if(hours>40)
        return (1.5*wages)*hours;
       else
           return wages*hours;

    }

    @Override
    public String toString() {
        return super.toString()+'\t' +
                "hours=" + hours +
                ", wages=" + wages +
                  ", HourlyEmployeeEarning= " + HourlyEmployeeEarning()
                ;
    }
}
