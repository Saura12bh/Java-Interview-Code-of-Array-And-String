
import java.util.Arrays;
import java.util.Scanner;

public class BasicStringOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strig");
        String s1=sc.nextLine();
        String s=s1.toLowerCase();

        //Display String
        System.out.println("orignal String => "+s);
    
        //operations on string
        //1-lenght of string using length() function
        int n=s.length();
        System.out.println("lenght of String =>"+n);
        //without using lenght function
        int cnt=0;
        for(char ch:s.toCharArray())
        {
            cnt++;
        }
        System.out.println("lenght of String without using function "+cnt);

        //count to how many space are in strin
        int space=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                space++;
            }
        }
        System.out.println("number of space =>"+space);

        //string rev
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse string =>"+rev);

        //palindrome
        if(s.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
        else{
             System.out.println("String is not Palindrome");
        }

        System.out.println("Enter second String for the checching anagram or not");
        String s3=sc.nextLine();
        String str=s3.toLowerCase();
         if(s.length()!=str.length())
        {
            System.out.println("String are not Anagrams");
        }
        char a1[]=s.toCharArray();
        char a2[]=str.toCharArray();
         Arrays.sort(a1); // Sort first array
        Arrays.sort(a2); // Sort second array
       
        if(Arrays.equals(a1, a2))
        {
            System.out.println("String are Anagram");
        }
        else
        {
            System.out.println("String are not Anagram");
        }
    }
}
