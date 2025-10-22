import java.util.Scanner;

public class SecondLargest {
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

     int lar=a[0];
     int secLar=a[0];
     for(int i=0;i<n;i++)
     {
      if(a[i]>lar)
      {
        secLar=lar;
        lar=a[i];
      } 
      else if(a[i]>secLar && a[i]<lar)
      {
        secLar=a[i];
      }
     }
     System.out.println("Largest element from array "+lar);
    System.out.println("Second Largest element from array "+secLar);
    }
}
