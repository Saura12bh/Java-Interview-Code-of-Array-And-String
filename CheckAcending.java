import java.util.Scanner;

public class CheckAcending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must have at least 1 element.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
     boolean b=true;
     for(int i=0;i<n-1;i++)
     {
        if(a[i]>a[i+1])
        {
            b=false;
            break;
        }
     }

     if(b==true)
     {
        System.out.println("acending");
     }
     else{
        System.out.println("not acending");
     }
    }
    
}
