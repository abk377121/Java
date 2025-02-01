import java.util.Scanner;

class animal {
    String domain, kingdom, phylum, classs, order, family, genus, species;
    void eat() {
        System.out.println("eating...");
    }
}

class lion extends animal {
    void roar() {
        System.out.println("roaring...");
    }
    
    
}

class babylion extends lion {
    
    void weep() {
        System.out.println("weeping...");
    }
    void display(){
        System.out.println("This is a Baby Lion");
        System.out.println("Domain: "+domain);
        System.out.println("Kingdom: "+kingdom);
        System.out.println("Phylum: "+phylum);
        System.out.println("Class: "+classs);
        System.out.println("Order: "+order);
        System.out.println("Family: "+family);
        System.out.println("Genus: "+genus);
        System.out.println("Species: "+species);
    }
    
}

public class animals {
    public static void main(String[] args) {
        babylion l1 = new babylion();
        l1.domain = "Eukaryota";
        l1.kingdom = "Animalia";
        l1.phylum = "Chordata";
        l1.classs = "Mammalia";
        l1.order = "Carnivora";
        l1.family = "Felidae";
        l1.genus = "Panthera";
        l1.species = "P. leo";
        l1.display();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Should this baby lion eat?: ");
        String eat = sc.nextLine();
        if(eat.equals("yes")){
            l1.eat();
        } else {
            l1.weep();
        }
        l1.roar();
    }    
}
