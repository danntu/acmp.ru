import java.util.*;
import java.io.*;
import java.text.*;

public class Zadacha22{

    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int n=sc.nextInt();
        int s=0;

        while(n>0){
            s+=n%2;
            n/=2;
        }
        pw.print(s);
        pw.close();
    }

}