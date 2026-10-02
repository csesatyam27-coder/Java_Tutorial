import java.util.Scanner;
class User {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your height:");
        double height = input.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

    }
}
