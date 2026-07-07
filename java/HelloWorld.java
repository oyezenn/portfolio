import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter yout name: ");
        String name = sc.nextLine();
        System.out.println("hello "+ name);
        System.out.print("Enter your age:c");
        int age = sc.nextInt();
        System.out.println("you are " + age + " years old ");
        
        sc.close();
    }
}