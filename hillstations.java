class hillyplace{
    void location(){
        System.out.println("Location: ");
    }
    void famousfor(){
        System.out.println("Famous for: ");
    }
}

class Manali extends hillyplace{
    void location(){
        System.out.println("Manali is in Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("Manali is famous for its scenic beauty");
    }
}

class Mussoorie extends hillyplace{
    void location(){
        System.out.println("Mussoorie is in Uttarakhand");
    }
    void famousfor(){
        System.out.println("Mussoorie is famous for its hills");
    }
}

class Gulmarg extends hillyplace{
    void location(){
        System.out.println("Gulmarg is in Jammu and Kashmir");
    }
    void famousfor(){
        System.out.println("Gulmarg is famous for its snow");
    }
}

public class hillstations {
    public static void main(String[] args) {
        hillyplace a = new hillyplace();
        hillyplace b = new Manali();
        hillyplace c = new Mussoorie();
        hillyplace d = new Gulmarg();

        a.location();
        a.famousfor();
        b.location();
        b.famousfor();
        c.location();
        c.famousfor();
        d.location();
        d.famousfor();
    }
}
