import java.util.Scanner;

public class ReverseArr {
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

        // Reverse array
        int st = 0, end = n - 1;
        while (st < end) {
            int temp = a[st];
            a[st] = a[end];
            a[end] = temp;
            st++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed array:");
        for (int i : a) {
            System.out.print(i + " "); // print in one line
        }
    }
}
