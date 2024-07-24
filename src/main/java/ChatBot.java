import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetingUser();
        String name = askUserName(scanner);
        int age = guessUserAgeCorrectly(scanner);
        int countTo = countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStoryAboutUser(name, age, countTo);
        outputDayPhrase(scanner);

        scanner.close();
    }

    // Level 1 requirements
    public static void greetingUser() {
        System.out.println("Hello! I am a friendly chat bot.");
    }

    public static String askUserName(Scanner scanner) {
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.print("Please repeat your name: ");
        String repeatedName = scanner.nextLine();
        System.out.println("Nice to meet you, " + repeatedName + "!");
        return repeatedName;
    }

    // Level 2 requirement for guessing age correctly
    public static int guessUserAgeCorrectly(Scanner scanner) {
        System.out.println("Let's guess your age accurately.");
        System.out.println("I will ask you for the remainders when your age is divided by 3, 5, and 7.");
        System.out.println("For example, if your age is 23:");
        System.out.println("23 divided by 3 is 7 with a remainder of 2.");
        System.out.println("23 divided by 5 is 4 with a remainder of 3.");
        System.out.println("23 divided by 7 is 3 with a remainder of 2.");

        System.out.print("Enter the remainder when your age is divided by 3: ");
        int rem3 = scanner.nextInt();
        System.out.print("Enter the remainder when your age is divided by 5: ");
        int rem5 = scanner.nextInt();
        System.out.print("Enter the remainder when your age is divided by 7: ");
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
        return age;
    }

    public static int countToNumber(Scanner scanner) {
        System.out.print("Enter a number and I will count to it: ");
        int countTo = scanner.nextInt();

        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }
        return countTo;
    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        boolean correct = false;

        while (!correct) {
            System.out.println("Which language is known as the mother of all programming languages?");
            System.out.println("A. Python");
            System.out.println("B. C");
            System.out.println("C. Java");
            System.out.println("D. Assembly");

            String answer = scanner.next();
            if (answer.equalsIgnoreCase("B")) {
                System.out.println("Correct! C is known as the mother of all programming languages.");
                correct = true;
            } else {
                System.out.println("Wrong answer. Try again.");
            }
        }
    }

    // Level 2 requirements
    public static void tellStoryAboutUser(String name, int age, int countTo) {
        System.out.println("Once upon a time, there was a person named " + name + " who was very curious and loved learning new things.");
        System.out.println(name + " was " + age + " years old and always enjoyed a good challenge.");
        System.out.println(name + " asked the chat bot to count to " + countTo + " and was thrilled when it did so successfully.");
        System.out.println(name + " also answered a tricky programming question correctly, proving their knowledge.");
    }

    // Level 3 requirements
    public static void outputDayPhrase(Scanner scanner) {
        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("I find Mondays to be a bit buggy.");
                break;
            case 2:
                System.out.println("Tuesdays are for tuning up.");
                break;
            case 3:
                System.out.println("I like to wind down on Wednesdays.");
                break;
            case 4:
                System.out.println("Thursdays are terrific!");
                break;
            case 5:
                System.out.println("Fridays are fabulous!");
                break;
            case 6:
                System.out.println("I think Saturdays are superb!");
                break;
            case 7:
                System.out.println("Sundays are serene.");
                break;
            default:
                System.out.println("That's not a valid day.");
                break;
        }
    }
}
