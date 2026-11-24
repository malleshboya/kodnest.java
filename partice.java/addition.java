import java.util.*;
class WelcomeWorker extends Thread {
@Override
public void run() {
System.out.println("number activation started");
for(int i = 1; i <= 10; i++) {
    System.out.println(i);
    {try
         {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Thread.sleep(3000);
}
System.out.println("number activation completed");
}
}
class Addition extends Thread {
@Override
public void run() {
    System.out.println("addition started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println( sum);
    Thread.sleep(3000);
    System.out.println("addition completed");
}
}
class Main {
public static void main(String[] args) {
WelcomeWorker worker = new WelcomeWorker();
worker.start();
Addition addition = new Addition();
addition.start();
}
}