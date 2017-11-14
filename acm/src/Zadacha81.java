import java.util.*;
import java.io.*;


public class Zadacha81{

    public static void main(String args[]) throws IOException {
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int n=sc.nextInt();
        int x;
        int max=0,min=32000;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            if(x>max) max=x;
            if(x<min) min=x;
        }
        pw.print(min+" "+max);
        pw.close();
    }

}