//2. Java program to implement the usage of static,local and global variables.

class program2 {

static int staticVariable = 10;

int instanceVariable = 20;

public void displayVariables() {

int localVariable = 30;

System.out.println("Static Variable: " +staticVariable);

System.out.println("Instance Variable: " +instanceVariable);

System.out.println("Local Variable: " +localVariable);

}

public static void main(String[] args) {

program2 example = new program2();

example.displayVariables();

System.out.println("Accessing Static Variable from main: " + program2.staticVariable);

}

}
