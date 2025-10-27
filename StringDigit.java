
import java.util.Scanner;

public class StringDigit {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine().toLowerCase();

    System.out.println("orignal String => "+s);
    //string contains only digit
    boolean b=true;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(!(ch>='0'&& ch<='9'))
        {
            b=false;
            break;
        }
        // if (!Character.isDigit(ch)) {
        //         isDigitOnly = false;
        //         break;
        //     }
    }
    if(b==true)
    {
        System.out.println("string contains only digit");
    }else{
        System.out.println("string contains not only digit ");
    }

    //string madhun number print krayche kiva store krayche
    String dig="";
    int sum=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch>='0'&& ch<='9')
        {
            dig=dig+ch;
            sum=sum+(ch-'0');
        }
    }
    System.out.println("only digit from the string => "+dig);
        System.out.println("only digit from the string additons => "+sum);
 }   
}
