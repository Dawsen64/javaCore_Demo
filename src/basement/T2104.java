package basement;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/3/4 20:42
 */
public class T2104 {
    public static void main(String[] args) {
        Solution01 solution = new T2104().new Solution01();
        int[] nums = {1,2,3};
        System.out.println(solution.convertToBase7(-7));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public long subArrayRanges(int[] nums) {
//            long sum = 0;
//            for(int i = 0; i < nums.length; i++){
//                for(int j = i; j < nums.length; j++){
//                    int[] subArr = Arrays.copyOfRange(nums, i,j+1);
//                    int max = Arrays.stream(subArr).max().getAsInt();
//                    int min = Arrays.stream(subArr).min().getAsInt();
//                    sum += max - min;
//                }
//            }
//            return sum;
//        }
//    }
//leetcode submit region end(Prohibit modification and deletion)
    class Solution {
        public long subArrayRanges(int[] nums) {
            long sum = 0;

            for(int i = 0; i < nums.length; i++){
                int maxValue = Integer.MIN_VALUE;
                int minValue = Integer.MAX_VALUE;
                for(int j = i; j < nums.length; j++){
                    maxValue = max(maxValue, nums[j]);
                    minValue = min(minValue, nums[j]);
                    sum += maxValue - minValue;
                }
            }
            return sum;
        }
    }
    class Solution01 {
        public String convertToBase7(int num) {
            StringBuilder s = new StringBuilder();
            int isF = 0;
            if(num < 0)
            {
                num = -num;
                isF = 1;
            }
            while(num != 0){
                s.append(num%7);
                num = num/7;
            }
            if (isF == 1)
                s.append("-");
            return s.reverse().toString();
        }
    }
}
