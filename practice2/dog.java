package practice2;

public class dog extends animal {
    private String breed;
    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
    
}
//Override method overrides the function from the parent class, which means that now the animal making sound changes to the dog barking. cool? cool.