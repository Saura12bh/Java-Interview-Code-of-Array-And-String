// import java.util.*;

// public class FindDuplicate {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array:");
//         int n = sc.nextInt();

//         int[] a = new int[n];
//         System.out.println("Enter " + n + " elements in array:");
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//        HashMap<Integer,Integer> h=new HashMap<>();
//         for(int val:a)
//         {
//             Integer  cnt=h.get(val);
//             if(cnt==null)
//             {
//                 cnt=0;
//             }
//             cnt=cnt+1;
//             h.put(val,cnt);
//         }
//          Set<Map.Entry<Integer,Integer>> ent=h.entrySet();
//          boolean found = false;
//          System.out.println("duplicate elements found.");
//         for(Map.Entry<Integer,Integer> obj:ent)
//         {
//             int v=obj.getValue();
//             if (v>1) {
//                 int k=obj.getKey();
//                 System.out.println(k);
//                 found = true;
//             }
//         } 
//         if (!found) {
//             System.out.println("No duplicate elements found.");
//         }
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesWithoutSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a); // Step 1: sort the array

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            // Print element only if it's not same as next
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
