import java.util.Scanner;

public class PairSum {
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

       System.out.println("Enter sum you want to check with array element");
       int sum=sc.nextInt();
       boolean b=true;
       for(int i=0;i<n;i++) 
       {
         for(int j=0;j<n;j++){
          if(sum==a[i]+a[j])
          {
            System.out.println(a[i]+"\t"+ a[j]);
            b=false;
            break;
          }
        }
        if(b==false)
        {
            break;
        }
       }
       if(b==true)
       {
        System.out.println("pair not found");
       }
    }
}
