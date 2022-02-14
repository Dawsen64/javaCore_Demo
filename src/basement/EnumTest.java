package basement;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/14 19:18
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: S, M, L, EL");
        String input = in.next().toUpperCase();
        Size size  = Enum.valueOf(Size.class, input);
        System.out.println(size);
        for (Size ele: Size.values())
        {
            System.out.println(ele);
        }
        Season spring = Season.spring;
        System.out.println(spring);
    }
}
enum Size
{
    S("SMALL"), M("MEDIUM"), L("LARGE"), EL("EXTRA_LARGE");
    private String size;
    private Size(String s)
    {
        size = s;
    }


}
enum Season{spring, summer, autumn, winter}
