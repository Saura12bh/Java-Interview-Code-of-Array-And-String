import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pro=1;
     for(int i=0;i<n;i++)
     {
        pro=pro*a[i];
     }

      System.out.println("product "+pro);
     
    }
    
}
