package basement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/20 22:07
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm::ss SSS");
        String nowTime = sdf.format(date);
        System.out.println(nowTime);
    }
}
