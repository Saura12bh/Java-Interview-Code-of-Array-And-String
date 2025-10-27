import java.util.Scanner;

public class PermutationWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("All permutations of the string:");

        // If string length = 3 (e.g., ABC)
        // Then we use 3 nested loops to generate all combinations
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    if (i != j && j != k && i != k) { // All indices should be different
                        System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                    }
                }
            }
        }
    }
}
