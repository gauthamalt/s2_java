import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {

        int firstTerm = 0, secondTerm = 1;
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number = ob.nextInt();
            for (int i = 0; i < number; i++) {

                System.out.print(firstTerm + ",");

                int sumTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = sumTerm;
            }
        }

    }

}
