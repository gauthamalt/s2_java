import java.util.*;
public class Fact {
    public static void main(String[] arg) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();

        int sum = 1;

        for(int i = number; i>0;i--){

            sum = sum*i;

        }
        System.out.println(sum);

        
    }
}
