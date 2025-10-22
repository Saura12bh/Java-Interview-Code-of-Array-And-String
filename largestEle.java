import java.util.Scanner;

public class largestEle {
public static void main(String[] args) {
 
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size of array");
     int n=sc.nextInt();
     System.out.println("Enter "+ n+" element in array");
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
        a[i]=sc.nextInt();
     }

     int max=a[0];
     for(int i=0;i<n;i++)
     {
        if(a[i]>max)
        {
            max=a[i];
        }
     }
     System.out.println("Max element from array "+max);
    }
}
