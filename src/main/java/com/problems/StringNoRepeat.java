package com.problems;

import java.util.HashSet;

public class StringNoRepeat {
    public static void main(String[] args) {
        String s = "abbaaababa";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static  int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> hashSet = new HashSet<>();
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        while(b_pointer < s.length())
        {
            if(!hashSet.contains(s.charAt(b_pointer)))
            {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }

}
