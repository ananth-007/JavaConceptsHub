import java.util.*;

public class MultiDimensionalAddition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter values for arr1: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter values for arr2: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }


        System.out.println("Sum of matrix is: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
