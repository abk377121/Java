class jetset{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}

public class getset {
    public static void main(String[] args) {
        jetset s = new jetset();
        s.setName("Donquixote Doflamingo");
        System.out.println(s.getName());
    }
}

