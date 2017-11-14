import java.util.*;
import java.io.*;
import java.math.*;
public class Zadacha692{
    public static void main(String args[]) throws IOException{
        new Zadacha692().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        short a=sc.nextShort();
        pw = new PrintWriter(new File("output.txt"));

        if (a > 0 && (a & (a - 1)) == 0)
        {
            pw.print("YES");
        }
        else
        {
            pw.print("NO");
        }

        pw.close();
    }
}