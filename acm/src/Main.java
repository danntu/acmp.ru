import java.util.*;
import java.io.*;

public class Main{ //имя класса должно быть Main
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a=sc.nextInt();

        pw.print(a+"9"+(9-a));
        pw.close();
    }
}