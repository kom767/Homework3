import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.*;

public class Findwords {
    public static void main(String[] args) {
        String [] words = {"Kamil", "Sah", "Namena", "Ytes", "Kamil", "Ksrea", "Namena", "Wow", "Wow", "Tarna", "Keyro", "Sah"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("____________________________________________________________________");
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
        System.out.println("____________________________________________________________________");
    }
}
