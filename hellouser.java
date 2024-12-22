import java.util.Scanner;

public class hellouser {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("The string is: " + str);
        int num = scn.nextInt();
        System.out.println("The number is: " + num);
        float fnum = scn.nextFloat();
        System.out.println("The floating point decimal is: " + fnum);
    }
}
