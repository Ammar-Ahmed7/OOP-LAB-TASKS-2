package com.Mycompany;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //printing statement
      /*  System.out.println("OH YEAH JAVA");
        System.out.println("LALALALALALALA");

        //Variables
        String myname ="Ammar";
        String neighbour ="Zaman";
        int age = 18;
        String friend = neighbour;
        */

        //DATA TYPES
        //Primitive types
        /* byte - 1 [-128 to 127]
         * short - 2
         * int - 4 [1,2,3]
         * long - 8
         * float - 4 [3.14]
         * double - 8
         * char - 2 [a,b,c,d]
         * boolean - 1 [true/false]
         */

        //Examples
       /* byte age2 = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float PI = 3.14F;
        char letter = 'a';
        boolean isAdult = true;


        //Non-Primitive Data type(On which we can perform manipulation)
        String name = new String("Ammar");
        String friendy = new String("Zaman");
        System.out.println(name.length());


        //STRINGS
        //concatenate
        String name1 = "Ammar1";
        String name2 = "Zaman1";
        String name3 = name1 + name2;
        String name4 = name1 + " and " + name2;
        System.out.println(name3);
        System.out.println(name4);

        //CharAt
        String name5 = "Ammar";
        System.out.println(name.charAt(0));

        //Length
        String name6 ="Ammar";
        System.out.println(name.length());

        //replace
        String name7 = "Ammar";
        String name8 = name7.replace('a','b');
        System.out.println(name8);


        //substring
        String name9 = "Ammar and Ahmed";
        System.out.println(name9.substring(0, 5));
        System.out.println(name9.substring(6, 10));


        //Arrays(Non-primitive)
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

       */










        // HARRY'S COURSE



        // Add two numbers
      /*  int n1= 5;
        int n2= 5;
        int sum;
        sum = n1 + n2;
        System.out.print("The sum of numbers is = ");
        System.out.println(sum);
      */




        //Taking input from the user
       /* System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int b = sc.nextInt();
        int sum= a + b;
        System.out.print("The sum is = ");
        System.out.println(sum);

        System.out.print("Enter the float number 1 = ");
        float f1 = sc.nextFloat();
        System.out.print("Enter the float number 2 = ");
        float f2 = sc.nextFloat();
        float sum2 = f1 +f2;
        System.out.print("The sum of floatng number is = ");
        System.out.println(sum2);
     */





        //Program to calculate Percentage of a student in 5 subjects

        /*int total = 100;
        Scanner s= new Scanner(System.in);

        //Each subject has a total of 20 marks
        System.out.println("Enter marks of subject 1 = ");
        int marks1 = s.nextInt();
        System.out.println("Enter marks of subject 2 = ");
        int marks2 = s.nextInt();
        System.out.println("Enter marks of subject 3 = ");
        int marks3 = s.nextInt();
        System.out.println("Enter marks of subject 4 = ");
        int marks4 = s.nextInt();
        System.out.println("Enter marks of subject 5 = ");
        int marks5 = s.nextInt();

        int sum = marks1 + marks2 + marks3 + marks4 + marks5;


        float percentage = (float) sum/total * 100;
        System.out.print("Your percentage is = ");
        System.out.println(percentage);

       */




        //To get name and print hello have a good day
     /*
      Scanner scan = new Scanner(System.in);
      String name = scan.next();
        System.out.println("Hello " + name + " have a good day");
      */


        //Km to miles
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter your distance in km (i.e 1km , 2km ) =  ");
        int km = sc.nextInt();

        double miles = km * 0.6214;
        System.out.println(miles);
       */

        //Determine wheather the number is an integer or not
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =  ");
        System.out.println(sc.hasNextInt());

        */






    }
}