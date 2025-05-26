//14. Java program to catch negative array size Exception. This exception is caused when the

array is initialized to negative values.

class program14 {

public static void main(String[] args) {

try {

int size = -5;

int[] array = new int[size]; // This line will throw NegativeArraySizeException

} catch (NegativeArraySizeException e) {

System.out.println("Error: Attempted to create an array with a negative size.");

e.printStackTrace(); // Print the stack trace for debugging

}

System.out.println("Continuing execution...");

}

}
