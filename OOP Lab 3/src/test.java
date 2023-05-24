public class test {
    public static void main(String args[]){


        Student obj1=new Student(1,"Ammar",4,"comsats");
        Student obj2=new Student(4,"miki",1,"comsats");
        Student obj3=new Student(9,"zaman",6,"comsats");
        Student obj4=new Student(3,"moiz",8,"comsats");
        Student temp;


        temp=obj1;
        temp.setSemester(2);

temp=obj2;
        temp.setSemester(2);

temp=obj3;
        temp.setSemester(2);

temp=obj4;

        temp.setSemester(2);




        System.out.println(obj2.getSemester());
        System.out.println(obj1.getSemester());
        System.out.println(obj3.getSemester());
        System.out.println(obj4.getSemester());
        System.out.println(obj1.getName());
        System.out.println(obj3.getName());
        System.out.println(obj4.getName());
        System.out.println(obj2.getName());










    }
}
