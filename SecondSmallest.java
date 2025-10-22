import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
// Why we use them in array problems?
// When you want to find the smallest element, you can start with Integer.MAX_VALUE.
// When you want to find the largest element, you can start with Integer.MIN_VALUE.
// This way, any number in your array will replace these initial values correctly.
        int sm = Integer.MAX_VALUE;
        int secSm = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < sm) {
                secSm = sm;
                sm = a[i];
            } else if (a[i] < secSm && a[i] > sm) {
                secSm = a[i];
            }
        }

        System.out.println("Smallest element: " + sm);

        if (secSm == Integer.MAX_VALUE) {
            System.out.println("No second smallest element exists.");
        } else {
            System.out.println("Second smallest element: " + secSm);
        }
    }
}
