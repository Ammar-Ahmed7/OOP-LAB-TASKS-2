import java.io.*;
import java.util.Scanner;

public class SimpleFileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("data.txt");
        FileWriter fw =new FileWriter(f);
        BufferedWriter bw =new BufferedWriter(fw);

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        bw.write(s);
        bw.close();

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        br.close();

    }
}
