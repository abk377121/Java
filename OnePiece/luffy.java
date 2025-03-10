package OnePiece;

import java.util.Scanner;


public class luffy {
    private int gearnum;
    private String attack;
    private boolean armament;
    private boolean observation;
    private boolean conqueror;
    public int opphealth = 500;
    public int health = 100;

    public void Gears(int gearnum, String attack, boolean armament, boolean observation, boolean conqueror){
        this.gearnum = gearnum;
        this.attack = attack;
        this.armament = armament;
        this.observation = observation;
        this.conqueror = conqueror;
    }

    public void launchAttack(){
        if (gearnum == 1){
            System.out.println("Gomu Gomu no "+attack);
            opphealth -= 5;
        } else if (gearnum == 2){
            System.out.println("Gomu Gomu no Jet "+attack);
            opphealth -= 10;
        } else if (gearnum == 3){
            System.out.println("Gomu Gomu no Giganto "+attack);
            opphealth -= 20;
        } else if (gearnum == 4){
            System.out.println("Gear 4th activated! Chose the form (Bounceman, Snakeman, Tankman): ");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            String form = sc.nextLine();
            System.out.println("Gomu Gomu no "+form+" "+attack);
            opphealth -= 30;
        } else if (gearnum == 5){
            System.out.println("GEAR 5 Gomu Gomu no "+attack);
            opphealth -= 50;
        }
    }

    public void haki(){
        if (armament){
            System.out.println("Armament Haki activated!");
        } 
        if (observation){
            System.out.println("You predicted their move!");
        }
        if (conqueror){
            System.out.println("The opponent is intimidated!");
        }
    }

    
}
