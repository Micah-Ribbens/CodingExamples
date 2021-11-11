public class dry {
    public static class person {
        String name = "";
        int income = 0;

        public person(String personName, int personIncome) {
            name = personName;
            income = personIncome;
        }

        public void sayHi(String nameWanted, int incomeWanted) {
            boolean is_wealthy = income >= incomeWanted;
            if (name == nameWanted && is_wealthy)
                System.out.println("Hello " + name);
        }
    }
    public static void main(String args[]) {
        var person1 = new person("Jeff", 100);
        var person2 = new person("Bill", 90);
        
        // Bad code
        boolean is_wealthy = person1.income > 100;
        if (person1.name == "Jeff" && is_wealthy) {
            System.out.println("Hello Jeff");
        }

        is_wealthy = person2.income > 90;
        if (person2.name == "Bill" && is_wealthy) {
            System.out.println("Hello Bill");
        }

        // Good code
        person1.sayHi("Jeff", 100);
        person2.sayHi("Bill", 90);
        
    }
}
