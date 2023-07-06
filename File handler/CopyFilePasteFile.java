import java.io.*;
public class CopyFilePasteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        File file1 = new File("abc1.txt");
        // File file = new File("C:\\Users\\User\\Desktop\\test.txt");
        File file2 = new File("abc2.txt");
        FileInputStream fis = new FileInputStream(file);
        FileInputStream fis1 = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fis1.close();
        fos.close();
    }
}
