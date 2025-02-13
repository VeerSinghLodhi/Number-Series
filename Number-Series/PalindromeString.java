
package number_programs;

public class PalindromeString {
    
    public static String getReverseString(String str)
    {
        String reversedString="";
        int length=str.length();
        while(length!=0)
        {
            reversedString+=str.charAt(length-1);
            length--;
        }
        return reversedString;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        String reversedString=getReverseString(str);
        if(str.equals(reversedString))
        {
            System.out.println(str+" is a Palindrome String because '"+str+" == "+reversedString+"'");
        }
        else
        {
            System.out.println(str+" is not a Palindrome String because '"+str+" != "+reversedString+"'");
        }
    }
    
}
