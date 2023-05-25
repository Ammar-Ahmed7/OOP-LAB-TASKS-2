import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          ArrayList<Accountant> a = new ArrayList<>();
        while(true) {
          System.out.println("\n Choose your option \n 1.Accountant \n 2.Manager \n 3.Exit ");
          Integer opt = sc.nextInt();

          switch (opt) {
              case 1:
                  a.add(new Accountant());
              case 2:
                  Acc_and_Mang_Abstract b = new Manager();
                  System.out.println(b);
              case 3:
                  System.exit(0);
          }

      }
    }
}