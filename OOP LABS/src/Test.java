import java.util.Scanner;
public class Test {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Hours = ");
        int h=sc.nextInt();
        while(h<=0){
            System.out.println("Hours cannot be less than or equal to 0 = ");
            h=sc.nextInt();
        }

        System.out.print("Enter Salary = ");
        int s=sc.nextInt();

        AdminEmployee a1=new AdminEmployee(h,s);
        System.out.println(a1);


        System.out.print('\n'+"Enter Hours = ");
        int hor=sc.nextInt();
        while(hor<=0){
            System.out.println("Hours cannot be less than or equal to 0 = ");
            hor=sc.nextInt();
        }
        System.out.print("Enter Salary = ");
        int s3=sc.nextInt();

        ServiceEmployee s1=new ServiceEmployee(hor,s3);
        System.out.println(s1);



    }

}
