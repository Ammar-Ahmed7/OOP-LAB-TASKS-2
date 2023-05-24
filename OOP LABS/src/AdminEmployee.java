import java.util.Scanner;
public class AdminEmployee extends SalaryClass{

    int hours;
   int sal=0;

    public AdminEmployee(int hours, int sal){
        this.hours = hours;
       this.sal=sal;
    }

    @Override
    public int calculateSalary(){
        if(hours>40) {
            sal =hours*1000 +5000;
        }
        else{
            sal=hours*1000;
        }
        return sal;
    }


    @Override
    public String toString() {
        return "AdminEmployee" +'\n' +
                "hours= " + hours + '\n'+
                "sal= " + sal + '\n'+
                "Salary= " + calculateSalary();
    }
}
