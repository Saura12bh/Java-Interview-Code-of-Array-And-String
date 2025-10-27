
import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine().toLowerCase();
        System.out.println("orignal String => "+s);
        System.out.println("Enter charater you want to replace with space");
        char sp=sc.next().charAt(0);
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                res=res+sp;
            }
            else
            {
                res=res+ch;
            }
        }
        System.out.println("After replace "+sp+" string =>"+res);

    }
    
}
