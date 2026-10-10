import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("How old are you? ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age <= 130) {
                    break;
                }
                System.out.println("Please enter a realistic age.");
            } else {
                System.out.println("Please enter a number.");
                scanner.next();
            }
        }

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        if (age < 18) {
            System.out.println("You are a minor. " + (18 - age) + " years until you are an adult.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        scanner.close();
    }
}