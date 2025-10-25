import java.util.Scanner;

public class Union {
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

       int s=n1+n2;
       int cnt=0;
       int union[]=new int[s];
       for(int i=0;i<n1;i++)
       {
        union[cnt++]=a[i];
       }

       for(int i=0;i<n2;i++)
       {
        boolean p=true;
         for(int j=0;j<s;j++)
         {
            if(union[j]==b[i])
            {   p=false;
                break;
            }
         }
         if(p==true)
         {
            union[cnt++]=b[i];
         }

        }

        System.out.println("Union   array");
       for(int i=0;i<cnt;i++)
       {
        System.out.print("\t"+union[i]);
       } 
       System.out.println();
    }
}
