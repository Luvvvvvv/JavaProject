package JavaFile.Encapsulation;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        et.setAge(20);
        et.setName("luv");
        et.setIdNum("1");
        System.out.println("name:" + et.getName() + "and age:" + et.getAge() + " and idnum:" + et.getIdNum());
    }
}
