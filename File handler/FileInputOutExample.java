import java.io.*;
public class FileInputOutExample {
    public static void main(String[] args){
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin = new FileInputStream("abc1.txt"); //byte by byte read
            fout = new FileOutputStream("abc.txt"); //byte by byte write
            int i;
            while((i=fin.read())!=-1){
                fout.write(i);
                // fout.flush();
                // fout.close();
            }
            fin.close();
            fout.close();
            System.out.println("done");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
