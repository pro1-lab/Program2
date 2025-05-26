//4. Java program to find the maximum of three numbers.

import java.util.Scanner;

class program4 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number: ");

int num1 = scanner.nextInt();
  System.out.print("Enter the second number: ");

int num2 = scanner.nextInt();

System.out.print("Enter the third number: ");

int num3 = scanner.nextInt();

int max;

if (num1 >= num2 && num1 >= num3) {

max = num1; // num1 is greater than or equal to both num2 and num3

} else if (num2 >= num1 && num2 >= num3) {

max = num2; // num2 is greater than or equal to both num1 and num3

} else {

max = num3; // If neither of the above, then num3 is the largest

}

System.out.println("The maximum number is: "+ max);

scanner.close();

}

}
  
