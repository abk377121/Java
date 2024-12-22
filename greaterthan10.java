import java.util.Scanner;

public class greaterthan10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num > 10){
            System.out.println(num+" is greater than 10.");
        } else if (num == 10) {
            System.out.println(num+" is equal to 10.");
        } else {
            System.out.println(num+" is less than 10.");
        }

    }
}
