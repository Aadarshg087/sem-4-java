import java.io.*;

public class ObjectInputStreamExample3 {
    public static void main(String[] args) {
        String s = "welcome to JAVA class";
        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream outstream = new FileOutputStream("D://file2.txt");
            ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);

            // write something in the file
            objoutstream.writeUTF(s);
            objoutstream.flush();

            // create an ObjectInputStream for the file we created before
            ObjectInputStream objinstream = new ObjectInputStream(new FileInputStream("D://file2.txt"));

            // read and print the whole content
            byte[] bt = new byte[22];
            objinstream.readFully(bt);
            String arr = new String(bt);
            System.out.println("" + arr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}