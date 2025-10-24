// import java.util.Scanner;

//ya madhe asa prb ahe ki apn fkt serial vice ch number deu shakto
// public class MissingNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Array size N enter करा: ");
//         int n = sc.nextInt(); // N = total numbers expected (including missing one)
//         int[] arr = new int[n - 1]; // 1 number missing, so size = N-1

//         System.out.println("Array elements enter करा:");
//         for (int i = 0; i < n - 1; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int totalSum = n * (n + 1) / 2; // 1 to N sum
//         int arrSum = 0;
//         for (int num : arr) {
//             arrSum += num;
//         }

//         int missing = totalSum - arrSum;
//         System.out.println("Missing number = " + missing);
//     }
// }
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total numbers N enter करा: ");
        int n = sc.nextInt();
        System.out.print("Array size enter करा (some numbers missing): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Array elements enter करा:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 1 ते N पर्यंत boolean array तयार करा
        boolean[] present = new boolean[n + 1]; // index 0 वापरणार नाही
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }

        System.out.println("Missing numbers:");
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
