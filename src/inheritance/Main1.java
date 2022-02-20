package inheritance;

import java.lang.reflect.Method;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/20 19:19
 */
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Class<Student> stdClass = Student.class;
//        // 获取public方法getScore，参数为String:
//        System.out.println(stdClass.getMethod("getScore", String.class));
//        // 获取继承的public方法getName，无参数:
//        System.out.println(stdClass.getMethod("getName"));
//        // 获取private方法getGrade，参数为int:
//        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
//    }
public class Main1 {
    public static void main(String[] args) throws Exception {
        // 获取Integer.parseInt(String)方法，参数为String:
        Method m = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        Integer n = (Integer) m.invoke(null, "12345");
        // 打印调用结果:
        System.out.println(n);
    }
}

class Student extends Person {
    public int getScore(String type) {
        return 99;
    }
    private int getGrade(int year) {
        return 1;
    }
}

class Person {
    public String getName() {
        return "Person";
    }
}
