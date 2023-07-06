import java.io.File;
import java.io.IOException;

class FileAllMethods
{
    public static void main(String...ag)throws IOException{
        File f=new File("abc.txt");//for parent : E:\\md\\abc.txt
        f.createNewFile();
        System.out.println("========================================================");
        System.out.println("      various method work with file:\n\n");
        System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("lastModified: "+new java.util.Date(f.lastModified()));
        System.out.println("Absolute path: "+f.getAbsolutePath());
        //System.out.println("Cononical path: "+f.getCanonicalPath());
        System.out.println("Parent: "+f.getParent());
        System.out.println("Exits :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writable: "+f.canWrite());
            System.out.println("Is writable: "+f.canRead());
            System.out.println("Is a directory: "+f.isDirectory());
            System.out.println("Is a file: "+f.isFile());
            System.out.println("File size in bytes: "+f.length());
        }
    }
}