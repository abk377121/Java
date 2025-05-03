import java.util.*;

public class reverselist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list:");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        ArrayList<Integer> reversedList = reverse(al);
        System.out.println("Reversed list: " + reversedList);
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> al) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = al.size() - 1; i >= 0; i--) {
            reversedList.add(al.get(i));
        }
        return reversedList;
    }
}
