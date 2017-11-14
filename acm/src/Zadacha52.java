import java.util.*;
import java.io.*;
import java.text.*;

public class Zadacha52{

    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));
        int n=sc.nextInt();

        int x1=n/100000;
        int x2=(n/10000) % 10;
        int x3=(n/1000)%10;

        int y1=(n/100)%10;
        int y2=(n/10)%10;
        int y3=n%10;


        if((x1+x2+x3)==(y1+y2+y3)) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }

}