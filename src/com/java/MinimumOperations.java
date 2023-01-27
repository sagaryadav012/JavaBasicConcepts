package com.java;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperations {
    public static int findMinimumOperations(List<Integer> A) {
        int operations = 0;

        for (int i = 0; i < A.size(); i++) {
        	
            if (A.get(i) != A.get(i + 1)) {
                int j = i +1;
                 
    
	                while (A.get(j) != A.get(i)) {
	                    j++;
	                }
                
                while (j > i + 1) {
                    int temp = A.get(j);
                    A.set(j, A.get(j - 1));
                    A.set(j - 1, temp);
                    j--;
                    operations++;
                }
                
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(1);
        A.add(3);
        A.add(3);
        int operations = findMinimumOperations(A);
        System.out.println("Minimum number of operations: " + operations);
    }
}

