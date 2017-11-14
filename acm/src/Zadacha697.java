import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Zadacha697{
    public static void main(String[] args) throws IOException{
        new Zadacha697().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int  c = sc.nextInt();
        int p=2*a*c + 2*b*c;

        pw = new PrintWriter(new File("output.txt"));

        if(p % 16 ==0)
            pw.print(p/16);
        else
            pw.print(p/16+1);

        pw.close();
    }
}