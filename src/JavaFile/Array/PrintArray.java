package JavaFile.Array;

public class PrintArray {

    public static void main() {
        printArray(new int[]{1,2,3,4,5,});
        System.out.println("1");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
