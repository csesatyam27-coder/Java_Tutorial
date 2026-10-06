import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Satyam");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //insert the value at index 5
        sb.insert(5, 'a');
        System.out.println(sb);
    }
}
