package com.filipeferreira.coding_interview_challenges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareSortedArray {

    //Mearusinrg performance
    static long tempoInicial = System.currentTimeMillis();

    //Square the sorted array
    //Order n
    //Resulting array sorted

    //main method

    static int[] nums = {-4, -1, 0, 3, 10};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareSortedArray(nums))); // [0, 1, 9, 16, 100]
        System.out.println("o metodo 1 executou em " + (System.currentTimeMillis() - tempoInicial) / 1000.0 + " segundos");
        System.out.println(Arrays.toString(squareSortedArray2(nums))); // [0, 1, 9, 16, 100]
        System.out.println("o metodo 2 executou em " + (System.currentTimeMillis() - tempoInicial) / 1000.0 + " segundos");
    }

    //Square the sorted array Java method
    public static int[] squareSortedArray(int[] nums) {
        return Arrays.stream(nums).map(n -> n * n).sorted().toArray();
    }

    //Square the sorted array not Java method
    public static int[] squareSortedArray2(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

}
