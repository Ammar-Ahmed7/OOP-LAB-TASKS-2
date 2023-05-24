import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter your option \n 1.Circle \n 2.Square \n 3.Rectangle \n 4.Exit");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            if(op!=1 || op!=2 || op!=3 || op!=4){
                System.out.println("\nEnter a valid input \n 1.Circle \n 2.Square \n 3.Rectangle \n 4.Exit");
                 op = sc.nextInt();
            }

            switch (op) {


                case 1:
                    shape a = new Circle();
                    System.out.println(a);
                    break;

                case 2:
                    shape b = new Square();
                    System.out.println(b);
                    break;

                case 3:
                    shape c =new Rectangle();
                    System.out.println(c);
                    break;

                case 4:
                    exit(0);
            }

        }
    }

}