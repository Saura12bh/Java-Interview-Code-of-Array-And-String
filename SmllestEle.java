import java.util.Scanner;

public class SmllestEle {
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

     int min=a[0];
     for(int i=0;i<n;i++)
     {
        if(a[i]<min)
        {
            min=a[i];
        }
     }
     System.out.println("Min element from array "+min);
    }
}
