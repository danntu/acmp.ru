import java.util.*;
import java.io.*;

public class Zadacha14{
    public static void main(String[] argv) throws IOException{
        new Zadacha14().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=b;
        int y;
        while ((c!=0) && (d!=0)){
            if(c>d) c=c % d;
            else d=d % c;
        }

        y=a*b/(c+d);
        pw.print(y);
        pw.close();

    }
}