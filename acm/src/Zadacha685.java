import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Zadacah685{
    public static void main(String[] args) throws IOException{
        new Zadacah685().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        byte a[] = new byte[3];
        byte b[] = new byte[3];
        int s=0;

        for(byte i=0;i<3;i++)
            a[i]=sc.nextByte();

        for(byte i=0;i<3;i++)
            b[i]=sc.nextByte();

        Arrays.sort(a);
        Arrays.sort(b);

        pw = new PrintWriter(new File("output.txt"));
        for(byte i=0;i<3;i++)
        {
            s=s+a[i]*b[i];
        }

        pw.print(s);
        pw.close();
    }
}