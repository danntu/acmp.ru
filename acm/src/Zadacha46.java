import java.util.*;
import java.io.*;


public class Zadacha46{
    public static void main(String args[]) throws IOException{
        PrintWriter pw;
        Scanner sc;
        pw = new PrintWriter(new File("output.txt"));
        sc  = new Scanner(new File("input.txt"));


        int n=sc.nextInt();
        if((n<=25) && (n>=0))
        {
            switch(n){
                case 0: pw.print("3"); break;
                case 1: pw.print("2.7"); break;
                case 2: pw.print("2.72"); break;
                case 3: pw.print("2.718"); break;
                case 4: pw.print("2.7183"); break;
                case 5: pw.print("2.71828"); break;
                case 6: pw.print("2.718282"); break;
                case 7: pw.print("2.7182818"); break;
                case 8: pw.print("2.71828183"); break;
                case 9: pw.print("2.718281828"); break;
                case 10: pw.print("2.7182818285"); break;
                case 11: pw.print("2.71828182846"); break;
                case 12: pw.print("2.718281828459"); break;
                case 13: pw.print("2.7182818284590"); break;
                case 14: pw.print("2.71828182845905"); break;
                case 15: pw.print("2.718281828459045"); break;
                case 16: pw.print("2.7182818284590452"); break;
                case 17: pw.print("2.71828182845904524"); break;
                case 18: pw.print("2.718281828459045235"); break;
                case 19: pw.print("2.7182818284590452354"); break;
                case 20: pw.print("2.71828182845904523536"); break;
                case 21: pw.print("2.718281828459045235360"); break;
                case 22: pw.print("2.7182818284590452353603"); break;
                case 23: pw.print("2.71828182845904523536029"); break;
                case 24: pw.print("2.718281828459045235360288"); break;
                case 25: pw.print("2.7182818284590452353602875"); break;

            }
        }


        pw.close();
    }

}