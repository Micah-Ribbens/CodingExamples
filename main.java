import java.util.Arrays;

public class main {
    public static void sayWord(String word) {
        System.out.println(word);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // [1, 2, 3, 4, 5]
        
        // [1, 2, 3, 4, 5]
        // 
        int[] array = new int[9];
        array[0] = 9;
        array[1] = 3;
        // array[2] = 27;
        for (var i = 2; i < 9; i++) {
            // Should add the two previous array numbers
            array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
