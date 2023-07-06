import java.io.*;
public class FileReaderExample {
    public static void main(String[] args) {
        try
        {
            Reader rdr=new FileReader("abc1.txt");
            int data = rdr.read();//read byte by byte
            while(data != -1)
            {
                System.out.print((char) data);
                // System.out.print( data); //output in the form of ASCII value
                data = rdr.read();
            }
            rdr.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}
