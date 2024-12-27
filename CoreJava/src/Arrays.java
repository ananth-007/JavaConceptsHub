public class Arrays {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        char[] arr2 = {'h','e','l','l','o'};
        arr2[0]='f';
        arr2[1]='i';
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        double[] arr3 = {1.9,2.9,3.4,3.5};
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        double sum=0;
        for(int i=0;i<arr3.length;i++)
        {
            sum+=arr3[i];
        }
        System.out.println();
        double avg = sum/arr3.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        System.out.println();

    }
}
