
import java.util.Scanner;

public class DuplicatefindRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();

        System.out.println("Orignal String => "+s);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean p=true;
            for(int j=0;j<i;j++)
            {
                if(ch==s.charAt(j))
                {
                    p=false;
                    break;
                }
            }
            if(ch==' ')
            {
                continue;
            }
            if(p==false)
            {
                continue;
            }
            for(int k=i+1;k<s.length();k++)
            {
                if(ch==s.charAt(k))
                {
                    System.out.println(ch);
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (sb.indexOf(String.valueOf(ch)) == -1) {
        sb.append(ch);
    }
}
System.out.println("After removing duplicates: " + sb);

 String result = "";
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (!result.contains(Character.toString(ch))) {
        result += ch;
    }
}
 System.out.println("After removing duplicates: " + result);

}
}
