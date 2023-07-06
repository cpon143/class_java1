import java.io.PrintWriter;
import java.util.*;
import java.io.*;

public class PrintWriteDemoFlush {
    public static void main(String[] args) throws IOException{
        PrintWriter pw=new PrintWriter(System.out);//write
        //PrintWriter pw=newPrintWriter(System.out,true);//make 2nd parameter true or false
        //PrintWriter pw=new PrintWriter(new File("abcd.txt")); //true not work here
        Scanner in = new Scanner(System.in); // create scanner to read from console
        for(int i=0; i<5; i++) {
            pw.println(in.next()); // write input to PrintWriter
        }
        pw.flush(); // flush the PrintWriter to ensure all output is written
        //pw.close(); // close the PrintWriter and the file writer if used
        //in.close(); // close the scanner if used

    }
}


