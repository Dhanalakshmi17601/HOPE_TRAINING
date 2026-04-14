import java.util.*;

public class SortCharacters {
    public static List<Character> sortChar(String s)
    {
        Map<Character,Integer> freq=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        //2. Map stored in list
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(freq.entrySet());

        //3. Short
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>()
        {
            @Override
            public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b)
            {
                if(!a.getValue().equals(b.getValue()))
                {
                    return b.getValue()-a.getValue();
                }
                return a.getKey()-b.getKey();
            }

        });

        // Collections.sort(list,(a,b)->{
            
        //         if(!a.getValue().equals(b.getValue()))
        //         {
        //             return b.getValue()-a.getValue();
        //         }
        //         return a.getKey()-b.getKey();

        // });

        List<Character> res=new ArrayList<>();
        for(Map.Entry<Character,Integer> i:list)
        {
            res.add(i.getKey());
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        String str="tree";
        System.out.println(sortChar(str));

    }
    
}
