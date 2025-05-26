//16. Java program to create a thread using Runnable Interface.

class program16 implements Runnable {
  public void run() {

System.out.println("Inside: " +Thread.currentThread().getName());

}

public static void main(String[] args) {

System.out.println("Inside: " +Thread.currentThread().getName());

Runnable runnable = new program16();

System.out.println("Creating Thread...");

//Runnable instance to it

Thread thread = new Thread(runnable);

System.out.println("Starting Thread...");

thread.start();

}

}
  
