package cn.hrd.algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * <pre>
     * Given an array of integers, find two numbers such that they add up to a specific target number.
     * The function twoSum should return indices of the two numbers such that they add up to the target,
     * where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
     * are not zero-based.
     * You may assume that each input would have exactly one solution.
     *
     * Input: numbers={2, 7, 11, 15}, target=9
     * Output: index1=1, index2=2
     *
     * 题目大意
     * 给定一个整数数组，找出其中两个数满足相加等于你指定的目标数字。
     * 要求：这个函数twoSum必须要返回能够相加等于目标数字的两个数的索引，且index1必须要小于index2。
     * 请注意一点，你返回的结果（包括index1和index2）都不是基于0开始的。你可以假设每一个输入肯定只有一个结果。
     *
     * 解题思路
     * 创建一个辅助类数组，对辅助类进行排序，使用两个指针，开始时分别指向数组的两端，看这两个下标对应的值是否
     * 等于目标值，如果等于就从辅助类中找出记录的下标，构造好返回结果，返回。如果大于就让右边的下标向左移，
     * 进入下一次匹配，如果小于就让左边的下标向右移动，进入下一次匹配，直到所有的数据都处理完
     * </pre>
     *
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};

        // 因为无素可能会重复，用于记录元素出现的下标
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        for (int num : nums) {
            int gap = target - num;
            if (map.containsKey(gap)) {
                // 同样的元素最多只可以有两个
                if (gap == num && map.get(num).size() >= 2) {
                    List<Integer> list = map.get(num);
                    result[0] = Math.min(list.get(0), list.get(1));
                    result[1] = Math.max(list.get(0), list.get(1));
                } else if (gap != num) {
                    result[0] = Math.min(map.get(num).get(0), map.get(gap).get(0));
                    result[1] = Math.max(map.get(num).get(0), map.get(gap).get(0));
                }
            }
        }

        return result;
    }


    /**
     * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
     *
     * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/richest-customer-wealth
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param accounts
     * @return
     */
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 1; j < accounts[i].length; j++) {

                accounts[i][0] += accounts[i][j];
            }
            accounts[0][0] = Math.max(accounts[0][0], accounts[i][0]);
        }
        return accounts[0][0];
    }

    public static void main(String[] args) {
        int[][] ccounts = {{2,8,7},{7,1,3},{1,9,5}};

        Solution solution = new Solution();
        System.out.println(solution.maximumWealth(ccounts));

    }

}
