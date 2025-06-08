import java.util.*;

public class getkpc {
    static Character[][] numbertocharmap;
    private static List<String> printwords(int[] numbers, int len, int numindex, String s){
        if (numindex == len){
            return new ArrayList<>(Collections.singletonList(s));
        }

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numbertocharmap[numbers[numindex]].length; i++){
            String scopy = String.copyValueOf(s.toCharArray());
            scopy = scopy.concat(numbertocharmap[numbers[numindex]][i].toString());
            stringList.addAll(printwords(numbers, len, numindex + 1, scopy));
        }
        return stringList;
    } 
    private static void printwords(int[] numbers){
        generateNumberToCharMap();
        List<String> stringList = printwords(numbers, numbers.length, 0, "");
        stringList.stream().forEach(System.out::println);
    }
    private static void generateNumberToCharMap(){
        numbertocharmap = new Character[10][5];
        numbertocharmap[0] = new Character[]{'\0'};
        numbertocharmap[1] = new Character[]{'\0'};
        numbertocharmap[2] = new Character[]{'a', 'b', 'c'};
        numbertocharmap[3] = new Character[]{'d', 'e', 'f'};
        numbertocharmap[4] = new Character[]{'g', 'h', 'i'};
        numbertocharmap[5] = new Character[]{'j', 'k', 'l'};
        numbertocharmap[6] = new Character[]{'m', 'n', 'o'};
        numbertocharmap[7] = new Character[]{'p', 'q', 'r', 's'};
        numbertocharmap[8] = new Character[]{'t', 'u', 'v'};
        numbertocharmap[9] = new Character[]{'w', 'x', 'y', 'z'};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Words formed by the given numbers:");
        printwords(numbers);
    }
}
