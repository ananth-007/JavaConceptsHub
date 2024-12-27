import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        //if-else statement
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }

        //if-else-if statement
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Largest number is: "+a);
        } else if (b>c) {
            System.out.println("Largest number is: "+b);
        } else {
            System.out.println("Largest number is: "+c);
        }

        //Nested-if-else
        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println("The largest number is "+a);
            }
            else
            {
                System.out.println("The largest number is "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("The largest number is "+b);
            }
            else
            {
                System.out.println("The largest number is "+c);
            }
        }

        int marks = sc.nextInt();
        if(marks>70)
        {
            if(marks>=85)
            {
                System.out.println("Grade: A");
            }
            else
            {
                System.out.println("Grade: B");
            }
        }
        else
        {
            if(marks>50)
            {
                System.out.println("Grade: C");
            }
            else
            {
                System.out.println("Grade: D");
            }
        }

        //Switch statements
        int day = sc.nextInt();

        switch (day)
        {
            case 1: System.out.println("Sunday");
                    break;

            case 2: System.out.println("Monday");
                    break;

            case 3: System.out.println("Tuesday");
                    break;

            case 4: System.out.println("Wednesday");
                    break;

            case 5: System.out.println("Thursday");
                    break;

            case 6: System.out.println("Friday");
                    break;

            case 7: System.out.println("Saturday");
                    break;

            default: System.out.println("Please enter valid number to get the day");
                     break;
        }

        int grad = sc.nextInt();
        switch (grad/10)
        {
            case 10:
            case 9: System.out.println("Grade A");
                    break;
            case 8: System.out.println("Grade B");
                    break;
            case 7: System.out.println("Grade C");
                    break;
            case 6: System.out.println("Grade D");
                    break;
            case 5: System.out.println("Grade E");
                    break;
            default: System.out.println("Grade F");
                     break;

        }

        sc.close();
    }
}
