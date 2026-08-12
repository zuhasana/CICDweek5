public class Factorial {
    public static int calculate(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
            return fact;
    }
            public static void main(String[] args)
            {
            Factorial f=new Factorial();
            int n=5;
            int result=f.calculate(n);
            System.out.println("factorial program");
            System.out.println("Factorial of "+n+"="+result);
            }
    
}