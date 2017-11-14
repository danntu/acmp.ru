import java.util.*;
import java.io.*;
import java.text.*;

public class Zadacha35{

    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int k=sc.nextInt();
        int m,n;
        for (int i=0;i<k;i++){
            n=sc.nextInt();
            m=sc.nextInt();
            pw.print(19*m+((n+239)*(n+366)/2)+"\n");
        }

        pw.close();
    }

}