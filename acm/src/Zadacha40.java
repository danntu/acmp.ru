import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Zadacha40{
    public static void main(String[] argv) throws IOException{
        new Zadacha40().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int n=sc.nextInt();
        int a=2;
        //BigInteger good = BigInteger.valueOf(n);
        BigInteger good1=BigInteger.valueOf(2);
        BigInteger bi;

        bi=good1.pow(n);

        pw.print(bi);
        pw.close();
    }

}