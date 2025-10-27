
import java.util.Scanner;

public class CountVowelsConsWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.nextLine();
        String s=s1.toLowerCase();
        int c=0,v=0,sp=0,d=0 ,space=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                d++;
            }
            else if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(ch==' ')
            {
                space++;
            }
            else{
                sp++;
            }
        }
        s.trim();
        if(s.isEmpty())
        {
            System.out.println("Word =0");
        }

        int word=1; //karan start cha space remove kela ahe mhnje 1 word tri start la asel ani jr nsel
                    //tr word=0 vrti apn check kel ch ahe

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&& i+1<s.length() && s.charAt(i+1)!=' ')
            {
                word++;
            }
        }
        System.out.println("Vowel =>"+v);
        System.out.println("Consount =>"+c);
        System.out.println("spcial charater =>"+sp);
        System.out.println("digit =>"+d);
        System.out.println("space =>"+space);
        System.out.println("word =>"+word);
    }
    
}
