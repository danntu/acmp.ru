import java.util.*;
import java.io.*;

public class Zadacha8
{
    public static void main(String[] argv) throws IOException{
        new Zadacha8().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a*b)==c)
            pw.print("YES");
        else pw.print("NO");
        pw.close();

    }
}