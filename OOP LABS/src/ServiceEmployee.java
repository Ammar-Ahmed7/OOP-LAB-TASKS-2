import java.util.Scanner;

public class ServiceEmployee extends SalaryClass{

    int hours2;
    int sal2=0;

    public ServiceEmployee(int hours2,int sal2){
        this.hours2=hours2;
        this.sal2=sal2;
    }

    @Override
    public int calculateSalary(){
        if(hours2>40){
            sal2=hours2*500+2000;
        }
        else{
            sal2=hours2*500;
        }
        return sal2;
    }

    @Override
    public String toString() {
        return "ServiceEmployee" + '\n'+
                "hours2 = " + hours2 + '\n'+
                "sal2 = " + sal2 + '\n'+
                 calculateSalary();
    }
}
