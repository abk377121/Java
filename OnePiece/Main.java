package OnePiece;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        luffy monkeydzoro = new luffy();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gear number (1-5): ");
        int gearnum = sc.nextInt();
        System.out.println("Enter the attack name: ");
        String attack = sc.next();
        System.out.println("Armament Haki activated? (true/false): ");
        boolean armament = sc.nextBoolean();
        System.out.println("Observation Haki activated? (true/false): ");
        boolean observation = sc.nextBoolean();
        System.out.println("Conqueror's Haki activated? (true/false): ");
        boolean conqueror = sc.nextBoolean();
        monkeydzoro.Gears(gearnum, attack, armament, observation, conqueror);
        monkeydzoro.haki();
        monkeydzoro.launchAttack();
        
    }
}
