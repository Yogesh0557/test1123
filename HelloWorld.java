import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Your name is: "+ name);
    }
}