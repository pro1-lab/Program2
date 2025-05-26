//5. Java program to check whether the number is odd or even.

import java.util.Scanner;

public class program5 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");

int num = scanner.nextInt();

if (num % 2 == 0) {

System.out.println(num + " is even");

} else {

System.out.println(num + " is odd");

}

scanner.close();

}

