import java.io.*;
import java.util.*;

public class Zadacha21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        out.println(max-min);

        out.flush();
    }
}