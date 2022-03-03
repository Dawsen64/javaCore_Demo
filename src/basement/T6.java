package basement;

import java.util.ArrayList;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/3/1 6:34
 */
public class T6 {
    public static void main(String[] args) {
        String s = "abcdefghijk";
        Solution01 sol = new Solution01();
        System.out.println(sol.convert(s, 3));
    }
}
class Solution01 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;
        ArrayList<StringBuilder> ans = new ArrayList<>();

        int len = numRows * 2 - 2;
        for(int i = 0; i < s.length(); i++){
            if (i % len >= numRows){
                ans.get(len - i % len).append(s.charAt(i));
            }
            else if( i < numRows){
                ans.add(new StringBuilder(s.substring(i, i+1)));
            }
            else{
                ans.get(i % len).append(s.charAt(i));
            }
        }

        for(int i = 1; i < ans.size(); i++){
            ans.get(0).append(ans.get(i));
        }

        return ans.get(0).toString();
    }
}