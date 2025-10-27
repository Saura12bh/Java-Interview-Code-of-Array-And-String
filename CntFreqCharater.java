import java.util.*;

public class CntFreqCharater {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();

        System.out.println("Orignal String => "+s);

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            Integer cnt=hm.get(ch);
            if(cnt==null)
            {
                cnt=0;
            }
            cnt=cnt+1;
            hm.put(ch,cnt);
        }
         Set<Map.Entry<Character,Integer>> ent=hm.entrySet();
        for(Map.Entry<Character,Integer> obj:ent)
        {
            char ch=obj.getKey();
            int cnt=obj.getValue();
            System.out.println(ch +" => "+cnt);
        }
    }
}
