import java.util.Scanner;

public class SubStringFreq {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  string: ");
        String s = sc.nextLine();
        
        System.out.println("Enter Sub string: ");
        String sub = sc.nextLine();
        
        System.out.println("orignal String => "+s);
        System.out.println("subString => "+sub);

        if(s.contains(sub))
        {
            System.out.println("substring is present");

        }else
        {
            System.out.println("substring is not present");
        }

        //how many time occure
          int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move ahead after each match
        }

        System.out.println("Number of occurrences: " + count);
      }    
}
