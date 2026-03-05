import java.util.Scanner;

public class InputMaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");   // string input
        String name = input.nextLine();
        System.out.print("Enter your age: ");   // integer input
        int age = input.nextInt();
        System.out.print("How many liters of water/coffee did you drink? ");  // double input
        double liquid = input.nextDouble();
        System.out.println("User: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hydration Level: " + liquid + "L");

        input.close();
    }
}
