public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 26 / 0;
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}