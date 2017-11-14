import java.util.*;
import java.io.*;


public class Zadacha86{

    public static void main(String args[]) throws IOException {
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int n=sc.nextInt();


        pw.print(n*n-(3*n-2));
        pw.close();
    }

}