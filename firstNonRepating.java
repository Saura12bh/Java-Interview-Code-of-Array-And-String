import java.util.Scanner;

public class firstNonRepating {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  string: ");
        String s = sc.nextLine().toLowerCase();
        System.out.println("orignal String => "+s);

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean b=true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j &&ch==s.charAt(j))
                {
                    b=false;
                    break;
                }
            }
            if(b==true)
            {
                System.out.println("first non repating charater => "+ch);
                break;
            }
        }
 }    
}
