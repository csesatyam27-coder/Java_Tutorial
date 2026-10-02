import java.util.Scanner;
class arthmatic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

    }
}
