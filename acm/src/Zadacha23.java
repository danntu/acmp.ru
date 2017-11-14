import java.util.*;
import java.io.*;
import java.text.*;

public class Zadacha23{

    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) s+=i;
        }
        pw.print(s);
        pw.close();
    }

}