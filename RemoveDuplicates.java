// import java.util.HashSet;
// import java.util.Scanner;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array:");
//         int n = sc.nextInt();

//         int[] a = new int[n];
//         System.out.println("Enter " + n + " elements in array:");
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         HashSet<Integer> set = new HashSet<>();

//         // Add elements to HashSet (duplicates will be ignored)
//         for (int val : a) {
//             set.add(val);
//         }

//         System.out.println("Array after removing duplicates:");
//         for (int val : set) {
//             System.out.print(val + " ");
//         }

//     }    
// }
