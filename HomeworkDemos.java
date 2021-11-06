import java.util.Scanner;
public class HomeworkDemos {
    public static void main(String[] args) {
        // IsThisAmazing("yes"); 
        // IsThisAmazing("no");
        // CountFast();
        Scanner scanner = new Scanner(System.in);
        String promptMessage = "Enter a number between 1 and 3 for an exciting result";
        System.out.println(promptMessage);
        String number = scanner.nextLine();
        switch (number) {
            case "1": 
                IsThisAmazing("yes"); 
                break;
            case "2":
                IsThisAmazing("no");
                break;
            case "3": 
                CountFast();
                break;


        }
    }

    public static boolean IsThisAmazing(String answer) {
        boolean isTrue = answer == "yes";
        String response = isTrue ? "That is amazing" : "Sorry, that is not amazing";
        System.out.println(response);
        return isTrue;
    }

    public static void CountFast() {
        for (var tens = 0; tens < 10; tens++) {
            for (var ones = 0; ones <= 9; ones++)
                System.out.println(tens * 10 + ones + 1);
        }
    }
}
