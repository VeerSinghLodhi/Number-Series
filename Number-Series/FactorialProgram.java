
package number_programs;

public class FactorialProgram {
    
    public static long getFactorial(long num)
    {
        long fact=1;
        while(num>0)
        {
            fact*=num;
            num--;
        }
        return fact;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        long num=sc.nextInt();
        long factorial=getFactorial(num);
        System.out.println("Factorial is "+factorial);
    }
}
