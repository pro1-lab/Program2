//8. Java program to implement Single Inheritance.

class Animal {

public void eat() {

System.out.println("Animal is eating");

}

}

class Dog extends Animal {

 public void bark() {

 System.out.println("Dog is barking");

 }

 }

 class program8 {

 public static void main(String[] args) {

 Dog myDog = new Dog();

 myDog.eat();

 myDog.bark();

 }

 }

