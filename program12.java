//12. Java program to add two integers and two float numbers. When no arguments are

supplied give a default value to calculate the sum. Use method overloading.

class program12 {

public int add(int a, int b) {

return a + b;

}

public float add(float a, float b) {

return a + b;

}

public int add() {

return add(5, 10);

}

public float add(float a) {

return add(a, 5.0f); // Default value for thesecond float number

}

public static void main(String[] args) {

program12 calculator = new program12();

int intSum = calculator.add(3, 7);
  System.out.println("Sum of integers: " +intSum);

float floatSum = calculator.add(3.5f, 2.5f);

System.out.println("Sum of floats: " +floatSum);

int defaultIntSum = calculator.add();

System.out.println("Sum of integers with default values: " + defaultIntSum);

float defaultFloatSum = calculator.add(4.5f);

System.out.println("Sum of floats with one default value: " + defaultFloatSum); //Output:9.5

}

