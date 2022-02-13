package basement;

import java.time.LocalDate;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/13 12:42
 */
public class CalendarTest {


    //打印当前月的日历
    void printMonth()
    {
        //获取今天的日期和当月的第一天
        // 当前日期
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        //当月的第一天
        //减去today-1就是当月的第一天
        date = date.minusDays(today - 1);
        //星期几
        int week = date.getDayOfWeek().getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //先找出第一天的位置
        for(int i = 1; i <= (week - 1)*4; i++)
        {
            System.out.print(" ");
        }
//        System.out.println(date.getDayOfWeek().getValue());
        while(date.getMonthValue() == month)
        {
            System.out.printf("%2d  ", date.getDayOfMonth());
            if(date.getDayOfWeek().getValue() == 7)
                System.out.println();
            date = date.plusDays(1);
        }
    }
    public static void main(String[] args) {
        CalendarTest date_t = new CalendarTest();
        date_t.printMonth();
    }

}
