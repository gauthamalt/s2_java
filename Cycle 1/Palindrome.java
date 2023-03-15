import java.lang.Math;
import java.util.*;

public class Palindrome {

    public static void main(String[] arg) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();

        double sum = 0, temp = number;
        while (temp > 0) {

            sum = (sum * 10) + (temp % 10);
            temp = temp / 10;
            temp = Math.floor(temp);

        }

    }

}
