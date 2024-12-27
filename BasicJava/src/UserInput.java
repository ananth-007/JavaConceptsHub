import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The input of int is  "+a);

        long b = sc.nextLong();
        System.out.println("The input of long is  "+b);

        double c = sc.nextDouble();
        System.out.println("The input of double is  "+c);

        byte d = sc.nextByte();
        System.out.println("The input of byte is  "+d);

        sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        System.out.println("The input of char is  "+ch);

        String e = sc.nextLine();
        System.out.println("The input of String is  "+e);

        System.out.println("Enter your first name:");
        String fname = sc.nextLine();
        System.out.println("My first name is: "+fname);

        System.out.println("Enter your last name:");
        String lname = sc.nextLine();
        System.out.println("My last name is: "+lname);

        System.out.println("Enter your college name:");
        String clg = sc.nextLine();
        System.out.println("My college name is: "+clg);

        System.out.println("Enter your branch name:");
        String branch = sc.nextLine();
        System.out.println("My branch name is: "+branch);

        System.out.println("Enter your mobile number:");
        long mobile = sc.nextLong();
        System.out.println("My mobile number is: "+mobile);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("My age is: "+age);

        System.out.println("Enter your USN:");
        String usn = sc.nextLine();
        System.out.println("My USN is: "+usn);

        sc.close();
    }
}
