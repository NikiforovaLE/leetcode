package org.nikiforova.solutions.easy.array;

import java.util.*;

public class UniqueElements {
    private static final Set<Integer> uniqueNums = new HashSet<>();

    public int sumOfUnique(int[] nums) {
        if (nums.length == 1) return nums[0];
        int sum = 0;
        boolean isUnique = true;
        List<Integer> blackList = new ArrayList<>();
        for (int num : nums) {
            if (!blackList.contains(num)) isUnique = uniqueNums.add(num);
            if (!isUnique) {
                uniqueNums.remove(num);
                blackList.add(num);
            }
        }
        for (int unique : uniqueNums) {
            sum += unique;
        }
        return sum;
    }

//    private static final Map<Integer, Integer> numsAndCount = new HashMap<>();
//    public int sumOfUnique(int[] nums) {
//        Set<Integer> uniqueNums = new HashSet<>();
//        List<Integer> blackList = new ArrayList<>();
//        if (nums.length == 1) return nums[0];
//        int sum = 0;
//        boolean isUnique = true;
//        for (int num : nums) {
//            if (!blackList.contains(num)) isUnique = uniqueNums.add(num);
//            if (!isUnique) {
//                uniqueNums.remove(num);
//                blackList.add(num);
//            }
//        }
//        for (int unique : uniqueNums) {
//            sum += unique;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        UniqueElements uniqueElements = new UniqueElements();
        System.out.println(uniqueElements.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}
