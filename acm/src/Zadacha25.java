import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Zadacha25{
    public static void main(String[] argv) throws IOException{
        new Zadacha25().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)  pw.print(">");
        if(a<b)  pw.print("<");
        if(a==b) pw.print("=");
        pw.close();
    }

}