import java.util.*;
import java.io.*;

public class Zadacha4 { //имя класса должно быть Zadacha4
    public static void main(String[] argv) throws IOException{
        new Zadacha4().run();
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