import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ObjectInputStreamExample2 {
public static void main(String[] args) throws IOException {

short[] buf = {1 , 2 , 6 , 6 , 7 , 3};

try {
// create file output stream
FileOutputStream fileoutstream = new FileOutputStream("E:\\file1.doc");

// create data output stream
DataOutputStream dataoutstream = new DataOutputStream(fileoutstream);

// for each byte in the buffer
for (short b:buf) {
// write character to the dos
dataoutstream.writeShort(b);
}

// force bytes to the underlying stream
dataoutstream.flush();

// create file input stream
InputStream inpstream = new FileInputStream("file1.doc");

// create new data input stream
DataInputStream datainpstream = new DataInputStream(inpstream);

// read till end of the stream
while(datainpstream.available()>0) {

// read character
short c = datainpstream.readShort();

// print
System.out.print(" "+c);
}
} catch(Exception e) {
e.printStackTrace();
}
}
}