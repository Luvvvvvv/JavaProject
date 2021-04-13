package JavaFile.Stream_File_IO;

import java.io.*;

public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {12, 32, 14, 54, 1};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
