import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number = ob.nextInt();
            int flag = 0;
            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {

                    flag += 1;

                }
            }
            if (flag == 0) {

                System.out.println(number + " Is Prime");
                System.exit(0);

            }
            System.out.println(number + " Is not Prime");
        }
    }

}
