import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  string: ");
        String s = sc.nextLine();

        System.out.println("orignal String => "+s);

        //by using inbuilt function
        System.out.println("Upper Case =>"+s.toUpperCase());
        System.out.println("Lower Case =>"+s.toLowerCase());

        //without using function

        String up="";
        String lw="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z')
            {
              up=up+ (char)(ch-32);
            }
            else
            {
            up=up+ch;
            }
        }
        System.out.println("without using function Upper case =>"+up);

        for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          if(ch>='A' && ch<='Z')
          {
            lw=lw+(char)(ch+32);
          }
          else{
          lw=lw+ch;
          }
        }
        System.out.println("without using function lower case =>"+lw);
    }
}
