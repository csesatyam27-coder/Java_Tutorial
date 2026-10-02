import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int result = 0;
        result = n%2 == 0 ? n : n*2;
        System.out.println(result);
    }
}
