public class Main {

    public static void main(String[] args){


        Date n1=new Date(12,3,2020);
        Address ad1=new Address(12,9,"Bharia","Lahore");
        bankAcc acc=new bankAcc("Ammar","Ahmed",103.3,1654,"ammar@gmailcom",n1,ad1);

        System.out.println(acc);

           acc.deposit(10000.12);
        System.out.println(acc.getopeningBalance());
    }
}
