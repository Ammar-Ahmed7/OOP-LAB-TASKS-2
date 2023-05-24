import java.util.Scanner;

public class Arrays {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    public Arrays() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element = ");
            arr[i] = sc.nextInt();


        }

    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public int sum() {
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s = s + arr[i];
        }

        return s;
    }



    public int numoddvalue() {
        int odd = 0;
        for (int i = 0; i < 5; i++) {
            if (!((arr[i] % 2) == 0)) {
                odd++;
            }
        }
        return odd;

    }

    public int numevenvalue() {
        int even = 0;
        for (int i = 0; i < 5;i++) {
            if ((this.arr[i] % 2)==0)  {
                even++;
            }
        }
        return even;

    }





}
