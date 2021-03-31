package JavaFile.Inherit;

public class InheritAnimal {
    private String name;
    private int id;

    public InheritAnimal(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public static void main(String[] args) {
        System.out.println("tiger");
        tiger one = new tiger("luv", 1);
        one.introduction();
        one.eat();
        cat three = new cat("hon", 3);
        three.introduction();
        three.eat();
    }

    public void eat() {
        System.out.println("eating");
    }

    public void introduction() {
        System.out.println("intro" + "my id is" + id + " and my name is" + name);
    }
}

class tiger extends InheritAnimal {
    public tiger(String myName, int myId) {
        super(myName, myId);
    }
}

class cat extends InheritAnimal {
    public cat(String myName, int myId) {
        super(myName, myId);
    }
}