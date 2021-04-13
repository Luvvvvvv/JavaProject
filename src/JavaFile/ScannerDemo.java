package JavaFile;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next接收方式:");
        if (scan.hasNext()) {
            String str = scan.next();
            System.out.println(str);
        }
        scan.close();
    }
}
