package JavaFile.Enumeration.Milk;

class MilkTea {
    enum MilkTeaSize {SMALL, MIDDLE, LARGE}

    MilkTeaSize size;
}

public class Enumeration {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        milkTea.size = MilkTea.MilkTeaSize.LARGE;
    }
}
