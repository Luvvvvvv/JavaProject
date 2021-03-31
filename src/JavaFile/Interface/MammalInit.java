package JavaFile.Interface;

public class MammalInit implements Animal{

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }

    public static void main(String[] args){
        MammalInit mammal=new MammalInit();
        mammal.eat();
        mammal.sleep();
    }
}
