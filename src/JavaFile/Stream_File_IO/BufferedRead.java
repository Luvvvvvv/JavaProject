package JavaFile.Stream_File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input,press 'q' to exit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
