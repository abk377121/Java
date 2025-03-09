package practice3;

interface shep {
    double getArea();    
}

class rectangle implements shep {
    private double width;
    private double height;

    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    
}

class circle implements shep{
    private double radius;

    public circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class AreaCalculator{
    public double sumAreas(shep[] shapes){
        double totalArea = 0;
        for(shep shape : shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

public class shape {
    public static void main(String[] args){
        shep[] shapes = new shep[2];
        shapes[0] = new rectangle(2, 4);
        shapes[1] = new circle(3);

        AreaCalculator ac = new AreaCalculator();
        double totalArea = ac.sumAreas(shapes);
        System.out.println(totalArea);
    }
}
