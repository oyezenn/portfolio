import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a1;
        String n1;
        String a2;
        String v1;
        String a3;

        System.out.println("Enter the adjective 1 : ");
        a1 = sc.nextLine();
        System.out.println("Enter a noun : ");
        n1 = sc.nextLine();
        System.out.println("Enter the adjective 2: ");
        a2 = sc.nextLine();
        System.out.println("Enter a verb : ");
        v1 = sc.nextLine();
        System.out.println("Enter an adjective 3");
        a3 = sc.nextLine();

        System.out.println("Today i went to a "+ a1 + " zoo");
        System.out.println("In an exibit i saw a "+ n1 + ".");
        System.out.println(n1 +" was "+ a2 +" and "+ v1 +" ! ");
        System.out.println("i was "+ a3 +" ! ");

        sc.close();
    }
}
