import java.util.Scanner;
public class rational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x is: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y is: ");
        int y = sc.nextInt();
        boolean result = x < y;
        System.out.println(result);
    }
}
