import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        //Simple Triangle
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Right-aligned Triangle
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if((i+j)>=n)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Triangle
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Right-aligned inverted Triangle
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Pyramid
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if((i+j)>=n)
                {
                    System.out.print(" *");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Inverted pyramid
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print(" *");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
