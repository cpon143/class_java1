import java.io.*;
import java.util.*;
public class ReadFileWriteConsole {
    public static void main(String []args) throws FileNotFoundException
    {
       
            File ob1=new File("abc1.txt");
            Scanner sc1=new Scanner(ob1);
            PrintWriter pw=new PrintWriter(System.out);
            pw.println("Enter your name");
            while(sc1.hasNext())
            {
                pw.println(sc1.next());
                // System.out.println(sc1.next());
            }
            pw.close();
            sc1.close();
        }
        
    }

