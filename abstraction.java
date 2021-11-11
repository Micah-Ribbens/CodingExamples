import java.util.ArrayList;
import java.util.Arrays;

public class abstraction {
    public static class List {
        private ArrayList<String> list = new ArrayList<>();
        // String[] list = new String[2];
        // int numberOfItems = 0;

        public void add(String item) {
            list.add(item);
            // list[numberOfItems++] = item;
        }

        public void print() {
            System.out.println(list);
            // System.out.println(Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        var list = new List();
        list.add("Hello");
        list.add("Bye");
        list.print();
    }
    
}
