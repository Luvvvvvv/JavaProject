package JavaFile.Enumeration.Color;


public class EnumColor {
    public static void main(String[] args) {    //迭代枚举元素
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }
    }

}
