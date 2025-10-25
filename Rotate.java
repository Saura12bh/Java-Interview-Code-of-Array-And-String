
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" element in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       System.out.println("Orignal array");
       for(int i=0;i<n;i++)
       {
        System.out.print("\t"+a[i]);
       } 
       System.out.println();
       

       int cs=a[0];
       int max=a[0];

       for(int i=1;i<n;i++)
       {
        if(cs+a[i]>a[i])
        {
            cs=cs+a[i];
        }
        else{
            cs=a[i];
        }
        if(cs>max)
        {
            System.out.println(a[i]);
            max=cs;
        }
       }

       System.out.println("Maximum sum =>"+max);
    }
    
}
