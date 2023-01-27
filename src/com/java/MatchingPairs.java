package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingPairs {
    public static List<int[]> findMatchingPairs(int[] A) {
        List<int[]> matches = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i : A) {
            if (frequency.containsKey(i)) {
                matches.add(new int[]{i, i});
                frequency.remove(i);
            } else {
                frequency.put(i, 1);
            }
        }

        return matches;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6};
        List<int[]> matches = findMatchingPairs(A);

        for (int[] pair : matches) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}

