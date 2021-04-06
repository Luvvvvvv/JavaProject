package JavaFile;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);   //5= 0000 0101 左移两位 0001 0100=20
        c <<= 2;
        System.out.println("c <<= 2 = " + c);   //20=0001 0100 右移两位 0000 0101=5
        c >>= 2;
        System.out.println("c >>= 2 = " + c);   //5=0000 0101 右移两位 0000 0001=1
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c &= a;                                 // 0000 0001 按位与操作
        System.out.println("c &= a  = " + c);   // 0000 1010
        c ^= a;                                 // 0000 0000 按位异或操作
        System.out.println("c ^= a   = " + c);  // 0000 1010
        c |= a;                                 // 0000 1010 按位或操作
        System.out.println("c |= a   = " + c);  // 0000 1010
    }
}