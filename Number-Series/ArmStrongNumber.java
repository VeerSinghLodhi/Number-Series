package number_programs;


public class ArmStrongNumber {
    public static void main(String [] args)
    {
        java.util.Scanner s1=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s1.nextInt();
        boolean ans;
        ans=getIsArmStrong(num);
        if(ans)
            System.out.println(num+" is a Arm Strong Number");
        else
            System.out.println(num+" is not a Arm Strong Number");
    }
    public static int getCountDigit(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public static int getPower(int num,int power)
    {
        int result=1;
        while(power>0)
        {
            result*=num;
            power--;
        }
        return result;
    }
    public static boolean getIsArmStrong(int num)
    {
        int temp=num;
        int sum=0;
        int power=getCountDigit(num);
        while(num>0)
        {
            int digit=num%10;
            sum+=getPower(digit,power);
            num/=10;
        }
        return sum==temp;
    }
}
