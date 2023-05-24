public class Main {
    public static void main(String[] args) {
        BasicCalculator obj1 = new BasicCalculator(5, 6);
        ScientificCalculator obj2 = new ScientificCalculator(5, 6, 7, 3.0);

        System.out.println("Sum = "+ obj1.sum());
        System.out.println("Subtract = "+ obj1.subtract());
        System.out.println("Multiplication = "+ obj1.multiplication());
        System.out.println("Division = "+ obj1.division());

        System.out.println("Sum = "+ obj2.sum());
        System.out.println("Multiplication = "+ obj2.multiplication());
        System.out.println("Sin  = "+ obj2.sin());
        System.out.println("Cos  = "+ obj2.cos());

       /* CSStudent student1=new CSStudent("COMSATS University","Raiwind Road", 5,"Computer Science","120 Hours", 90000,"Aimah Siddique", 92);
        ManagementStudent student2=new ManagementStudent("COMSATS University","Raiwind Road", 5,"Management Department","120 Hours", 90000,"Mikaal Amjad", 143);
        ManagementStudent student3=new ManagementStudent("COMSATS University","Raiwind Road", 5,"MCOM Department","120 Hours", 90000,"Roha Arslan", 116);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);*/
    }
}
