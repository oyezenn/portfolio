import java.util.Scanner;
public class Substring {
  

    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)
        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = sc.nextLine();
        
        if (email.contains("@")){
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println(domain);
        System.out.println(username);
        }
        else{
            System.out.println("Email must contain '@' character ");
        }
        sc.close();
    }

}
