import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableDemo {
    public static void main(String args []){
        try {
            MyClass object2;
            FileInputStream fis= new FileInputStream("Serial.txt");
            ObjectInputStream ois= new ObjectInputStream(fis); //read
            object2=(MyClass)ois.readObject();
            ois.close();
            System.out.println("object2: "+ object2);
        }
        catch(Exception e){
            System.out.println("Execption during serialization: "+e);
            System.exit(0);
        }
    }
}
