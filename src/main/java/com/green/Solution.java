package com.green;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 5};

        Solution sol = new Solution();
        System.out.println(sol.solution(arr));
    }

    public int solution(int[] arr) {
        if(arr.length == 1) { return arr[0]; }
        Map<Integer, Integer> map = new HashMap();
        for(int val : arr) {
            map.put(val, map.containsKey(val) ? map.get(val) + 1 : 1);
        }
        List<Integer> keySet = new ArrayList(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int cnt = map.get(keySet.get(0));
        int cnt2 = map.get(keySet.get(1));
        return cnt != cnt2 ? keySet.get(0) : -1;
    }
}
