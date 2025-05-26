//6. Java program to implement default and parameterized constructors.

class MyClass {

int number;

String text;

public MyClass() {

number = 0; // Initialize number to 0

text = "Default Text"; // Initialize text to a default string

}

public MyClass(int num, String str) {
  number = num; // Assign the passed value to number

text = str; // Assign the passed value to text

}

public void display() {

System.out.println("Number: " + number);

System.out.println("Text: " + text);

}

}

class program6 {

public static void main(String[] args)

{

 MyClass obj1 = new MyClass();

 System.out.println("Using Default Constructor:");

 obj1.display(); // Display default values

 MyClass obj2 = new MyClass(42, "Parameterized Text");

 System.out.println("\nUsing Parameterized Constructor:");

 obj2.display(); // Display assigned values

}

}
