import java.util.Scanner;

public class apps {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter the shape of the object:");
            String shape = sc.nextLine();
            if (shape.equals("sphere")){
                sphere s = new sphere();
                s.display();
            }
            else if (shape.equals("cube")){
                cube c = new cube();
                c.display();
            }
            else if (shape.equals("prism")){
                prism p = new prism();
                p.display();
            }
            else{
                System.out.println("Invalid shape");
            }
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
