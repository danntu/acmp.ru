import java.util.*;
import java.io.*;


public class Zadacha66{

    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        BufferedReader sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new BufferedReader(new FileReader("input.txt"));
        char n;

        n=(char)sc.read();


        char mas[]={'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        if (n=='m') {
            pw.print(mas[0]);
        }
        else {
            for (int i=0;i<25;i++)
                if(mas[i]==n) { pw.print(mas[i+1]); }

        }

        pw.close();
    }

}