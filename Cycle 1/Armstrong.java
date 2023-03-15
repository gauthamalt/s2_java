import java.lang.Math;
import java.util.*;

public class Armstrong {

    public static void main(String[] arg) {

        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();

        double sum = 0, temp = number;
        while (temp > 0) {

            sum = sum + Math.pow((temp % 10), 3);
            temp = temp / 10;
            temp = Math.floor(temp);

        }
        if (sum == number) {

            System.out.println("Yes");
        }

    }

}
