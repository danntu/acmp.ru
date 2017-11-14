import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Zadacha61{
    public static void main(String[] argv) throws IOException{
        new Zadacha61().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));

        int a1=sc.nextInt();
        int b1=sc.nextInt();

        int a2=sc.nextInt();
        int b2=sc.nextInt();

        int a3=sc.nextInt();
        int b3=sc.nextInt();

        int a4=sc.nextInt();
        int b4=sc.nextInt();

        if((a1+a2+a3+a4)>(b1+b2+b3+b4)) pw.print(1);
        if((a1+a2+a3+a4)<(b1+b2+b3+b4)) pw.print(2);
        if((a1+a2+a3+a4)==(b1+b2+b3+b4)) pw.print("DRAW");
        pw.close();
    }

}