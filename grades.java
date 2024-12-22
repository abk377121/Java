import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        int marks = scn.nextInt();

        if (marks > 90){
            System.out.println("A+");
        } else if (marks <= 90 && marks > 80){
            System.out.println("A");
        } else if (marks <= 80 && marks > 70){
            System.out.println("B+");
        } else if (marks <= 70 && marks > 60){
            System.out.println("B");
        } else if (marks <= 60 && marks > 50){
            System.out.println("C+");
        } else if (marks <= 50 && marks > 40){
            System.out.println("C");
        } else if (marks <= 40 && marks > 30){
            System.out.println("D+");
        } else if (marks <= 30 && marks > 20){
            System.out.println("D");
        } else if (marks <= 20 && marks > 10){
            System.out.println("F");
        } else {
            System.out.println("F-");
        }
    }
}
