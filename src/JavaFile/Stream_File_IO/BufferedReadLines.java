package JavaFile.Stream_File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("input lines of text");
        System.out.println("input 'end' to exit");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

