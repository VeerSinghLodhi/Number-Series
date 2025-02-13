
package number_programs;

public class EvenOrOdd {
    
    public static String getEvenOrOdd(int num)
    {
        if(num%2==0)
            return "Even";
        else
            return "Odd";
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(num+" is a "+getEvenOrOdd(num)+" Number");
    }
}
