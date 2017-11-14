import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Zadacha92{
    public static void main(String[] argv) throws IOException{
        new Zadacha92().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a;
        int n=sc.nextInt();
        a=n/6;
        pw.print(a+" "+4*a+" "+a);
        pw.close();
    }

}