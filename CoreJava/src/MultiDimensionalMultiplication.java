import java.util.Scanner;

public class MultiDimensionalMultiplication {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter no of columns for Matrix A and rows for Matrix B: ");
        int colsA = sc.nextInt();
        System.out.print("Enter no of columns in Matrix B: ");
        int colsB = sc.nextInt();

        int[][] arr1 = new int[rowsA][colsA];
        int[][] arr2 = new int[colsA][colsB];
        int[][] mul = new int[rowsA][colsB];

        System.out.println("Enter values for arr1: ");
        for(int i=0;i<rowsA;i++)
        {
            for(int j=0;j<colsA;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter values for arr2: ");
        for(int i=0;i<colsA;i++)
        {
            for(int j=0;j<colsB;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<rowsA;i++)
        {
            for(int j=0;j<colsB;j++)
            {
                for(int k=0;k<colsA;k++)
                {
                    mul[i][j] = mul[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }


        System.out.println("Multiplication of matrix is: ");
        for(int i=0;i<rowsA;i++)
        {
            for(int j=0;j<colsB;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
}
