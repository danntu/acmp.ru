import java.util.*;
import java.io.*;


public class Zadacha59{

    public static void main(String args[]) throws IOException {
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        long n=sc.nextInt();
        int k=sc.nextInt();
        int s=0,p=1;
        while(n>0){
            s+=n % k;
            p*=n % k;
            n/=k;
        }
        pw.print(p-s);
        pw.close();
    }

}