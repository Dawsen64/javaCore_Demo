package basement;

import java.lang.reflect.Field;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/20 18:07
 */
public class Main1 {
    public static void main(String[] args) throws Exception, NoSuchFieldException {
        Class<Student> stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
        //获取所有字段,不包括父类
        for (Field s: stdClass.getDeclaredFields()){
            System.out.print(s + " ");
        }
        System.out.println();
        //获取所有字段,包括父类，不包括private
        for (Field s: stdClass.getFields()){
            System.out.println(s);
        }
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
