def remove():
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    for number in numbers:
        if number < 5:
            numbers.remove(number)
    
    print(numbers)
    
def add():
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    for number in numbers:
        if number >= 5:
            numbers.add(number)
    print(numbers[10:])
            
        
remove()
add()

def find_all_words(self, letters):
    current = self.root
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