class Employee{
    int empno;
    String name;
    double salary;

    Employee(){
        empno = 1;
        name = "Luffy";
        salary = 400000;
    }
    
    void display(){
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

}

public class classes{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}