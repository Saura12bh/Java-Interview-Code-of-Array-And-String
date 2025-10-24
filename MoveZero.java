
import java.util.Scanner;

public class MoveZero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[cnt]=a[i];
                cnt++;
            }
        }
        // System.out.println("After removing zero");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]);
        // }
        for(int i=cnt ;i<n;i++)
        {
            a[cnt]=0;
            cnt++;
        }
        System.out.println("After moving zero at end");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
