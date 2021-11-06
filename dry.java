public class dry {
    public static class person {
        String name = "";
        int age = 9;
        int income = 0;

        public void sayHi() {
            boolean is_wealthy = income > 100000;
            if (name == "Jeff" && is_wealthy)
                System.out.println("Hello Jeff Bezos");
            else
                System.out.println("Hi how is your day going?");
        }
    }

    public static void sayHi() {
        
    }

    public static void main(String args[]) {
        var function = sayHi;
        function();
        // var person1 = new person();
        // var person2 = new person();
        // boolean is_wealthy = person1.income > 100000;
        // if (person1.name == "Jeff" && is_wealthy) {
        //     System.out.println("Hello Jeff Bezos");
        // }

        // is_wealthy = person2.income > 100000;
        // if (person2.name == "Jeff" && is_wealthy) {
        //     System.out.println("Hello Jeff Bezos");
        // }
        
    }
}
