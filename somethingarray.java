public class somethingarray {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] arr = new int[n][m];

        arr[0] = new int[]{1, 2, 3, 4, 5};
        arr[1] = new int[]{6, 7, 8, 9, 10};
        arr[2] = new int[]{11, 12, 13, 14, 15};
        arr[3] = new int[]{16, 17, 18, 19, 20};
        arr[4] = new int[]{21, 22, 23, 24, 25};

        int sno = 2;
        int rno = 2;

        ringrotate(arr, sno, rno);

        display(arr);


    }

    public static void ringrotate(int[][] arr, int sno, int rno){
        int[] la = fill1Dfrom2D(arr, sno);
        rotate1D(la, rno);
        fill2Dfrom1D(arr, la, sno);
    }

    public static int[] fill1Dfrom2D(int[][] arr, int sno){
        int rmin = sno - 1;
        int rmax = arr.length - sno;
        int cmin = sno - 1;
        int cmax = arr[0].length - sno;

        int size = 2 * (rmax - rmin + cmax - cmin);
        int[] la = new int[size];
        int idx = 0;

        for (int row = rmin; row <= rmax; row++){
            la[idx] = arr[row][cmin];
            idx++;
        }
        cmin++;

        for (int col = cmin; col <= cmax; col++){
            la[idx] = arr[rmax][col];
            idx++;
        }
        rmax--;

        for (int row = rmax; row >= rmin; row--){
            la[idx] = arr[row][cmax];
            idx++;
        }
        cmax--;

        for (int col = cmax; col >= cmin; col--){
            la[idx] = arr[rmin][col];
            idx++;
        }
        rmin++;
        

        return la;
    }
    public static void rotate1D(int[] la, int rno){
        int n = la.length;
        rno = rno % n;
        if (rno < 0){
            rno += n;
        }
        reverse(la, 0, n - 1);
        reverse(la, 0, rno - 1);
        reverse(la, rno, n - 1);
    }
    public static void reverse(int[] la, int li, int ri){
        while (li < ri){
            int temp = la[li];
            la[li] = la[ri];
            la[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void fill2Dfrom1D(int[][] arr, int[] la, int sno){
        int rmin = sno - 1;
        int rmax = arr.length - sno;
        int cmin = sno - 1;
        int cmax = arr[0].length - sno;

        int idx = 0;

        for (int row = rmin; row <= rmax; row++){
            arr[row][cmin] = la[idx];
            idx++;
        }
        cmin++;

        for (int col = cmin; col <= cmax; col++){
            arr[rmax][col] = la[idx];
            idx++;
        }
        rmax--;

        for (int row = rmax; row >= rmin; row--){
            arr[row][cmax] = la[idx];
            idx++;
        }
        cmax--;

        for (int col = cmax; col >= cmin; col--){
            arr[rmin][col] = la[idx];
            idx++;
        }
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
