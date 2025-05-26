//3. Java program to implement string operations string length, string concatenate,

//substring.

class program3

{public static void main(String[] args)

{

 String str1 = "Hello";

 String str2 = "World";

 int lengthOfStr1 = str1.length();

 System.out.println("Length of '" + str1 + "': " +lengthOfStr1);

 String concatenatedString = str1.concat(" ").concat(str2);

 System.out.println("Concatenated String: " +concatenatedString);

 String substring =concatenatedString.substring(0, 5); // Extracting "Hello"

 System.out.println("Substring: " +substring);

}

}
