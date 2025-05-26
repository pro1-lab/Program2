//11. Java program to demonstrate a division by zero exception.

class program11 {

public static void main(String[] args) {

int numerator = 10;

int denominator = 0;

try {

int result = numerator / denominator;

System.out.println("Result: " + result);

} catch (ArithmeticException e) {

System.out.println("Error: " +e.getMessage());

System.out.println("Cannot divide a number by zero.");

}
}
}
