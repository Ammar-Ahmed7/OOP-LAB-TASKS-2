public class Assignment {
    public static void main(String[] args) {


        Dates d1 = new Dates();

        d1.setDate(5);
        d1.setMonths(4);
        d1.setYear(2021);

        Dates d2 = new Dates();

        d2.setDate(15);
        d2.setMonths(9);
        d2.setYear(2018);

        System.out.printf("%n"+d1.getDate()+"/"+ d1.getMonths()+"/"+ d1.getYear()+"%n");
        System.out.printf(d2.getDate()+"/"+ d2.getMonths()+"/"+ d2.getYear()+"%n%n");


        if (d1.getYear()<d2.getYear())
        {
            System.out.println("The earlier date is = " +d1.getDate()+"/"+d1.getMonths()+"/"+d1.getYear());
        }


        else if(d1.getYear() == d2.getYear())
        {
               if(d1.getMonths()<d2.getMonths())
               {
                   System.out.println("The earlier date is = " +d1.getDate()+"/"+d1.getMonths()+"/"+d1.getYear());
               }
               else if(d1.getMonths()> d2.getMonths())
               {
                   System.out.println("The earlier date is = " +d2.getDate()+"/"+d2.getMonths()+"/"+d2.getYear());
               }
               else if(d1.getMonths() == d2.getMonths())
               {
                     if(d1.getDate()< d2.getDate())
                     {
                         System.out.println("The earlier date is = " +d1.getDate()+"/"+d1.getMonths()+"/"+d1.getYear());
                     }
                     else
                     {
                         System.out.println("The earlier date is = " +d2.getDate()+"/"+d2.getMonths()+"/"+d2.getYear());
                     }

               }



        }

        else
        {
            System.out.println("The earlier date is = " + d2.getDate() + "/" + d2.getMonths() + "/" + d2.getYear());
        }













    }
}
