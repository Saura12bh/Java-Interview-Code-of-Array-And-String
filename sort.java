import java.util.Scanner;

public class sort {
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

     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(a[i]<a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
     }
     System.out.println("sorted array");
     for(int i:a)
     {
        System.out.println(i);
     }
     int min=a[0];
     int max=a[n-1];
     int secMin=Integer.MAX_VALUE;
     int secMax=Integer.MIN_VALUE;

     for(int i=0;i<n;i++)
     {
        if(a[i]>min)
        {
            secMin=a[i];
            break;
        }
     }

     for(int i=0;i<n;i++)
     {
        if(a[i]<max)
        {
            secMax=a[i];
        }
     }
     System.out.println("Max"+max);
     System.out.println("min"+min);
     System.out.println("sec min"+secMin);
          System.out.println("sec Max"+secMax);

 }   
}
