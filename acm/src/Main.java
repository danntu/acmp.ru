import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int v = in.nextInt();
        int t = in.nextInt();
        int s =v*t;
        if (v<0) s=1+109-(Math.abs(v)*t) %109;
        else s=1+(v*t%109);
        out.println(s);

        out.flush();
    }
}