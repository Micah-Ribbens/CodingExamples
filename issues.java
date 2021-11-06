import java.util.ArrayList;

public class issues {
    public static ArrayList<Integer> addAll(ArrayList<Integer> arrayList, Integer[] additions) {
        for (var addition : additions) {
            arrayList.add(addition);
        }
        return arrayList;
    }

    public static void remove() {
        var numbers = addAll(new ArrayList<Integer>(), new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        for (var number : numbers) {
            if (number < 5) {
                numbers.remove(number);
            }
        }
        System.out.println(numbers);
    }
    public static void add() {
        ArrayList<Integer> numbers = new ArrayList<>();
        addAll(numbers, new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        for (var number : numbers) {
            if (number >= 5) {
                numbers.add(number);
            }
        }
    }
 
    public static void main(String[] args) {
    //   These are mind games sadly :( (Ill show it in python, but first show Java code)
      remove();
      add();
    }
}

    def find_all_words(self, letters):
        current = self.root
        # I used two lists that the indexes correlate;
        # I could've used a list of dictionaries, but it was too complex
        combinations = []
        all_words = []
        current_combination = ""
        index = 0
        letters_available = letters
        letters_left = []
        while True:
            current = self.find_child(current_combination)
            possible_letters = self.get_children(current)
            for letter in possible_letters:
                if letters_available.__contains__(letter):
                    letters_left.append(self.remove_letter(letters_available, letter))
                    combinations.append(current_combination + letter)

            if index >= len(combinations):
                return all_words
                
            current_combination = combinations[index]
            letters_available = letters_left[index]
            if self.has_word(current_combination) and len(current_combination) >= 2:
                all_words.append(current_combination)
            index += 1
// }