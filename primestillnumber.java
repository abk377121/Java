import java.util.Scanner;

public class primestillnumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; i++){
            int count = 0;
            for (int div = 2; div * div <= i; div++){
                if (i % div == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(i);
            }
        }
    }
}
