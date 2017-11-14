import java.util.*;
import java.io.*;

public class Zadacha43{
    public static void main(String args[]) throws IOException,FileNotFoundException{
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter  out = new PrintWriter(new FileOutputStream("output.txt"));
        int c;
        int a=0,max=0;
        do{
            c=in.read();
            if(c!=-1) {
                if((char)c=='0') { a++; } else { a=0; }
                if(a>max) max=a;
            }
        }while(c!=-1);
        out.print(max);
        in.close();
        out.close();
    }
}