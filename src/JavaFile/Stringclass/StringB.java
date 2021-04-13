package JavaFile.Stringclass;

public class StringB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        sb.append("luv");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(3,"java");
        System.out.println(sb);
        sb.delete(3,7);
        System.out.println(sb);
    }
}
