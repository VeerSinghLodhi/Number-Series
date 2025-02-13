
package number_programs;

public class SpecialNumber {
    
    public static int getFactorial(int number)
    {
        int fact=1;
        while(number!=0)
        {
            fact*=number;
            number--;
        }
        return fact;
    }
    public static int isSpecialNumber(int number )
    {
        int result=0;
        while(number!=0)
        {
            int digit=number%10;
            result+=getFactorial(digit);
            number/=10;
        }
        return result;
    }
    public static void main(String []args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        int result=isSpecialNumber(number);
        if(result==number)
        {
            System.out.println(number+" is a Special number ");
        }
        else
        {
            System.out.println(number+" is not a Special number ");
        }
    }
}
