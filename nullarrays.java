import java.util.*;
public class nullarrays {
    public static boolean isnonzero(int r, int[][] darr){
        for(int i=0; i<darr[r].length; i++){
            if(darr[r][i] != 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] darr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Enter element at ("+i+","+j+"): ");
                darr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(darr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the row index to check: ");
        int row = sc.nextInt();
        boolean result = isnonzero(row, darr);
        if(result){
            System.out.println("The row " + row + " contains non-zero elements.");
        } else {
            System.out.println("The row " + row + " contains all zero elements.");
        }
        sc.close(); 
    }
}
