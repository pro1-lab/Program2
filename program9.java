//9.Java program to implement Multiple Inheritance using Interface.

interface Walkable{

 void walk();

}

interface Swimmable{

 void swim();

}

class Duck implements Walkable, Swimmable {

public void walk() {

System.out.println("Duck is walking.");

}

public void swim() {

System.out.println("Duck is swimming.");

}

}

// Main class to test the implementation

public class program9 {

public static void main(String[] args) {

// Create an object of Duck class

Duck myDuck = new Duck();

// Call the methods from both interfaces

myDuck.walk(); // Output: Duck is walking.

myDuck.swim(); // Output: Duck is swimming.
}
}
