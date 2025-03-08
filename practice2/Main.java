package practice2;

public class Main {
    public static void main(String[] args) {
        animal a = new animal("Gorble", 5);
        cat c = new cat("Whiskers", 2, true);
        dog d = new dog("Rex", 3, "Golden Retriever");
        System.out.println(a.getName() + " is " + a.getAge() + " years old.");
        a.makeSound();
        System.out.println(c.getName() + " is " + c.getAge() + " years old and is " + (c.getIndoors() ? "an indoor" : "an outdoor") + " cat.");
        c.makeSound();
        System.out.println(d.getName() + " is " + d.getAge() + " years old and is a " + d.getBreed() + " dog.");
        d.makeSound();
    }
}
//clearly, we just made a package. we get the whole deal! in here, we got a cat, a dog, and it's super boss an animal. animal is like the master of a cat and dog. then, the main thing is where we open up a package and see what's in it. again, cool? cool.
