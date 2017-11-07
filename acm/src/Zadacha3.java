import java.io.*;
import java.util.*;

public class Zadacha3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int c,d;
        int  a =in.nextInt();
        c=a / 10;
        d=c*(c+1);

        if (c==0)
            out.print(25);
        else
            out.print(d+"25");

        out.flush();
    }
}