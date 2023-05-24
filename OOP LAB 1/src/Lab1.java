public class Lab1 {

    public static void main(String[] args){

        System.out.println("My name is Ammar Ahmed");
         int a=50;
         int b=40;
         int c;
         c=a+b;
        System.out.println("Sum = " + c);

        Demo person=new Demo();
        person.setName("Ammar");

        A obj=new A();

        obj.setNum1(30);
        obj.setNum2(50);

        System.out.println(obj.getNum1());
        System.out.println(obj.getNum2());

        int ans=obj.getNum1() + obj.getNum2();
        System.out.println("Sum = " + ans);














    }





}
