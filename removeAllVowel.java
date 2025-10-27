
import java.util.Scanner;

public class removeAllVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine().toLowerCase();

        String v="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            }
            else
            {
                v=v+ch;
            }
        }
        System.out.println("String without vowels => "+v);
    }
    
}
