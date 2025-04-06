import java.util.Scanner;

public class spiraldisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        if (n == 0 || m == 0) {
            System.out.println("Array dimensions can't be 0.");
            return;
        }
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rmin = 0, rmax = n - 1, cmin = 0, cmax = m - 1;
        int count = 0;
        System.out.println("The elements of the array in spiral order are:");
        while (count < n * m) {
            for (int i = cmin; i <= cmax && count < n * m; i++) {
                System.out.print(arr[rmin][i] + " ");
                count++;
            }
            rmin++;
            for (int i = rmin; i <= rmax && count < n * m; i++) {
                System.out.print(arr[i][cmax] + " ");
                count++;
            }
            cmax--;
            for (int i = cmax; i >= cmin && count < n * m; i--) {
                System.out.print(arr[rmax][i] + " ");
                count++;
            }
            rmax--;
            for (int i = rmax; i >= rmin && count < n * m; i--) {
                System.out.print(arr[i][cmin] + " ");
                count++;
            }
            cmin++;
        }
        sc.close();
        
    }
}
