//15. Java program to check whether a number is palindrome or not.

import java.util.Scanner;

class program15{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number: ");

int originalNum = scanner.nextInt();

int num = originalNum;

int reversedNum = 0;

while (num != 0) {

int remainder = num % 10;

reversedNum = reversedNum * 10 + remainder;

num /= 10;

}

if (originalNum == reversedNum) {

System.out.println(originalNum + " is a palindrome.");

} else {

System.out.println(originalNum + " is not a palindrome.");

}

scanner.close();

}

}
  
