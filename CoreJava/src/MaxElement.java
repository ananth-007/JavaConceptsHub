public class MaxElement {
    public static void main(String[] args)
    {
        int[] a = {9,7,1,2,10};
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max is "+max);
    }
}
