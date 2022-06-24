public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        
        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
        System.out.println("Hello, I am " + firstName + " " + lastName + ", and I am " + age + " years old\n");

        // Print out whether age is even
        int isEven = age % 2;
        System.out.println(isEven == 0);

        // Print out whether firstName equals lastName
        System.out.println(firstName == lastName);

        // Print out whether age is greater than 0
        System.out.println(age >= 0);

    }
}
