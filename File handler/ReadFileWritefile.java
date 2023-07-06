import java.io.*;
import java.util.*;
public class ReadFileWritefile {
    public static void main(String []args) throws IOException
    {
        File ob1=new File("abc1.txt");
        Scanner sc1=new Scanner(ob1);
        File ob2=new File("abc.txt");
        // ob2.createNewFile();
        PrintWriter pw1=new PrintWriter(ob2);
        pw1.println("Enter your name");
        while(sc1.hasNext())
        {
            pw1.println(sc1.next());
            // System.out.println(sc1.next());
        }
        pw1.close();
        sc1.close();
    }
}
