import java.util.Scanner;

class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Your numbers are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}