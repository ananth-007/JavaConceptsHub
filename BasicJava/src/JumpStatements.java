public class JumpStatements {
    public static void main(String[] args)
    {
        //Break Statement
        System.out.println("----Break Statement-----");
        for(int i=0;i<=10;i++)
        {
            if(i>=4)
                break;
            System.out.println(i);
        }
        System.out.println();
        //Continue Statement
        System.out.println("----Continue Statement-----");
        for(int j=0;j<=5;j++)
        {
            if(j==2)
            {
                continue;
            }
            System.out.println(j);
        }
        System.out.println();
        //Return Statement
        System.out.println("----Return Statement-----");
        int result = add(4,5);
        System.out.println("Sum is: "+result);

    }
    public static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

}
