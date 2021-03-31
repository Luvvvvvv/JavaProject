package JavaFile.Enumeration.Color;

public enum Color {
    RED, BLUE, PURPLE;

    private void Colour() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}
