import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();

        System.out.println("orignal String => "+s);

        String word[]=s.split(" ");
// split(" ") breaks the sentence into words.
// → "Java is fun" → ["Java", "is", "fun"]
// The for loop prints from last word to first word.
// Adds a space after each word when printing.
        System.out.println("string after word reverse");
        for(int i=word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }
        System.out.println();
        //pratek word revser kraych

        System.out.println("String after each word recerse");
        for(int i=0;i<word.length;i++)
        {
            String s1=word[i];
            String s2="";
            for(int j=s1.length()-1;j>=0;j--)
            {
                s2=s2+s1.charAt(j);
            }
            System.out.print(s2+" ");
        }
    }
    
}
