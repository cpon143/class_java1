// https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html#write(char[])
import java.io.*;
public class FileWriterExample {
    public static void main(String [] args)
    {
        try
        {
            Writer w=new FileWriter("abc1.txt");
            String content ="I love my country";
            w.write(content);
            w.write(67);
            char[] ch=content.toCharArray();
            w.write(ch[4]);
            w.write(ch,3,5);
            w.close();
            System.out.println("done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
