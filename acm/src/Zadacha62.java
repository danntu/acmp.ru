import java.util.*;
import java.io.*;


public class Zadacha62{

    public static void main(String args[]) throws IOException {
        BufferedWriter pw;
        BufferedReader sc;
        pw = new BufferedWriter(new FileWriter("output.txt"));
        sc  = new BufferedReader(new FileReader("input.txt"));

        int a=sc.read();
        char b=(char)sc.read();
        if((b+(a%2))%2==0)
            pw.write("BLACK");
        else pw.write("WHITE");
        pw.close();
    }

}