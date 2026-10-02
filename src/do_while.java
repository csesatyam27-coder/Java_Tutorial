import java.util.Scanner;
class do_while {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt();

            System.out.println("You entered: " + num);

        } while (num != 0);
    }
}

