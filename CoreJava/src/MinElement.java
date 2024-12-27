public class MinElement {
    public static void main(String[] args)
    {
        int a[] = {22,13,4,5,9};
        int min = a[0];
        for(int i=0;i<a.length;i++)
        {

            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Min is "+min);

    }
}
