import java.io.*;
import java.util.*;

public class Zadacha2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();



        if(a<=0){
            out.print((1+a)*(Math.abs(a)+2)/2 );
        }
        else
            out.print((1+a)*a/2);

        out.flush();
    }
}