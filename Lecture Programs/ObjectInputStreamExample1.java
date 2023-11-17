import java.io.*;
import java.util.*;

public class ObjectInputStreamExample1 {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] barray = { 'h', 'e', 'l', 'l', 'o', 'o', 'j', 'a', 'v', 'a' };
        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream outstream = new FileOutputStream("C:/Users/aadar/Desktop/file.txt");
            ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);

            // writing objects str and barray to objectoutputstream
            objoutstream.writeObject(str);
            objoutstream.writeObject(barray);

            // create an ObjectInputStream for the file we created before
            ObjectInputStream objinstream = new ObjectInputStream(
                    new FileInputStream("C:/Users/aadar/Desktop/file.txt"));

            // read and print an object and cast it as the string
            //          

            System.out.println("" + (String) objinstream.readObject());
            byte[] read1 = (byte[]) objinstream.readObject();
            String s2 = new String(read1);
            System.out.println("" + s2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}