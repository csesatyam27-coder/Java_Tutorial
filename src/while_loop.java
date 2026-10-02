import java.util.Scanner;

class while_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (num != 0) {
            System.out.println("You entered: " + num);

            System.out.print("Enter another number (0 to stop): ");
            num = input.nextInt();
        }

        System.out.println("Loop stopped.");
    }
}