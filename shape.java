class rl {
    public double area() {
        return 0;
    }
}

class triangle extends rl {
    private double base;
    private double height;
    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}
class square extends rl {
    private double side;
    public square(double side) {
        this.side = side;
    }
    public double area() {
        return side * side;
    }
}



public class shape {
    public static void main(String[] args) {
        rl[] shape = new rl[2];
        shape[0] = new square(5);
        shape[1] = new triangle(2,5);
        System.out.println("Area of square: " + shape[0].area());
        System.out.println("Area of triangle: " + shape[1].area());
    }    
}
