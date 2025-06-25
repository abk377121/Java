
import java.util.Scanner;
public class sumofcubesisinteger {
    


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of k: ");
    int k = sc.nextInt();

    boolean found = false;
    int range = 1;

    while (!found) {
        for (int x = -range; x <= range; x++) {
            for (int y = -range; y <= range; y++) {
                for (int z = -range; z <= range; z++) {
                    if (x != y && y != z && z != x) {
                        if (x * x * x + y * y * y + z * z * z == k) {
                            System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
                            found = true;
                            break;
                        }
                    }
                }
                if (found) break;
            }
            if (found) break;
        }
        if (!found) range++;
    }

    sc.close();
}


}


