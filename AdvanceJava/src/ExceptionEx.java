public class ExceptionEx {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        int a=6;
        int b=0;
        {
            try {
                System.out.println(a / b);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        {
            try{
                for (int i = 0; i <= arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
