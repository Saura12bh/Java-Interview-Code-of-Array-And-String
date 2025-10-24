import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class countFreq {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> h=new HashMap<>();
        for(int val:a)
        {
            Integer  cnt=h.get(val);
            if(cnt==null)
            {
                cnt=0;
            }
            cnt=cnt+1;
            h.put(val,cnt);
        }
         Set<Map.Entry<Integer,Integer>> ent=h.entrySet();
        for(Map.Entry<Integer,Integer> obj:ent)
        {
            int k=obj.getKey();
            int v=obj.getValue();
            System.out.println(k+"  => "+v);
        }
    }
}
