import java.util.Scanner;

public class MergeArray {
          public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first  array");
        int n1=sc.nextInt();
        int a[]=new int[n1];
        System.out.println("Enter "+n1+" element in array");
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter size of Second  array");
        int n2=sc.nextInt();
        int b[]=new int[n2];
        System.out.println("Enter "+n2+" element in array");
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("Orignal first array");

       for(int i=0;i<n1;i++)
       {
        System.out.print("\t"+a[i]);
       } 
       System.out.println();

       System.out.println("Orignal Second  array");
       for(int i=0;i<n2;i++)
       {
        System.out.print("\t"+b[i]);
       } 
       System.out.println();

       int merge[]=new int[n1+n2];
       for(int i=0;i<n1;i++)
       {
        merge[i]=a[i];
       }
       for(int i=0;i<n2;i++)
       {
        merge[i+n1]=b[i];
       }

        System.out.println("Merged   array");
       for(int i=0;i<n1+n2;i++)
       {
        System.out.print("\t"+merge[i]);
       } 
       System.out.println();
    }
}
