package OnePiece;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
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
        String opponents[] = {"Kaido", "Big Mom", "Blackbeard", "Akainu", "Kizaru", "Aokiji", "Sengoku", "Katakuri", "Shanks", "Mihawk"};
        int random = (int)(Math.random()*10);
        System.out.println("You are fighting against "+opponents[random]);
        System.out.println("Your health: "+monkeydzoro.health);
        System.out.println("Opponent's health: "+monkeydzoro.opphealth);
        while (monkeydzoro.health > 0 && monkeydzoro.opphealth > 0){
            System.out.println("Choose your action: ");
            System.out.println("1. Launch attack");
            System.out.println("2. Use Haki");
            int choice = sc.nextInt();
            if (choice == 1){
                monkeydzoro.launchAttack();
                System.out.println("Opponent's health: "+monkeydzoro.opphealth);
            } else if (choice == 2){
                
                if (monkeydzoro.armament && monkeydzoro.busonshoku > 0){
                    System.out.println("Armament Haki activated!");
                    monkeydzoro.busonshoku -= 1;
                    System.out.println("Remaining rounds of armament haki: "+monkeydzoro.busonshoku);
                } else {
                    System.out.println("You ran out of armament haki!");
                }
                if (monkeydzoro.observation){
                    System.out.println("You can predict their move!");
                }
                if (monkeydzoro.conqueror && monkeydzoro.haoshoku > 0){
                    System.out.println("Conqueror's Haki activated!");
                    monkeydzoro.haoshoku -= 1;
                    System.out.println("The opponent loses health from your willpower!");
                    monkeydzoro.opphealth -= 30;
                    System.out.println("Remaining rounds of conqueror's haki: "+monkeydzoro.haoshoku);
                    System.out.println("The opponent is intimidated!");
                } else {
                    System.out.println("You ran out of conqueror's haki!");
                    System.out.println("You lose energy and health!");
                    monkeydzoro.health -= 10;
                    System.out.println("Your health: "+monkeydzoro.health);
                }
                monkeydzoro.opphealth -= 5;
                System.out.println("Opponent's health: "+monkeydzoro.opphealth);
            }
            if (monkeydzoro.opphealth <= 0){
                System.out.println("You won!");
                System.out.println("You defeated "+opponents[random]);
                System.out.println("Remaining health: "+monkeydzoro.health);
                System.out.println("Remaining rounds of armament haki: "+monkeydzoro.busonshoku);
                System.out.println("Remaining rounds of conqueror's haki: "+monkeydzoro.haoshoku);
                System.out.println("Remaining dodges: "+monkeydzoro.dodges);
                if (monkeydzoro.haoshoku > 0){
                    score += 2000;
                    
                }
                if (monkeydzoro.busonshoku > 0){
                    score += 1500;
                    
                }
                if (monkeydzoro.dodges > 0){
                    score += 500;
                    
                }
                if (monkeydzoro.health > 0 && monkeydzoro.health <= 50){
                    score += 500;
                    
                } else if (monkeydzoro.health > 50 && monkeydzoro.health <= 100){
                    score += 1000;
                    
                }
                System.out.println("Your score: "+score);
                break;
            } else if (monkeydzoro.health <= 0){
                System.out.println("You lost!");
                break;
            }
            System.out.println("Opponent's turn!");
            int oppchoice = (int)(Math.random()*2);
            if (oppchoice == 0){
                System.out.println("Opponent attacked you!");
                if (monkeydzoro.observation && monkeydzoro.dodges > 0){
                    monkeydzoro.dodges -= 1;
                    System.out.println("Dodged!");
                    System.out.println("Dodges left: "+monkeydzoro.dodges);
                    continue;
                } else if (monkeydzoro.observation && monkeydzoro.dodges == 0){
                    System.out.println("You ran out of dodges!");
                }
                monkeydzoro.health -= 10;
                System.out.println("Your health: "+monkeydzoro.health);
            } else if (oppchoice == 1){
                System.out.println("Opponent used Haki!");
                if (monkeydzoro.observation && monkeydzoro.dodges > 0){
                    monkeydzoro.dodges -= 1;
                    System.out.println("Dodged!");
                    System.out.println("Dodges left: "+monkeydzoro.dodges);
                    continue;
                } else if (monkeydzoro.observation && monkeydzoro.dodges == 0){
                    System.out.println("You ran out of dodges!");
                }
                monkeydzoro.health -= 5;
                System.out.println("Your health: "+monkeydzoro.health);
            }
        }
        
    }
}
