package basement;

import java.io.IOException;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/15 12:08
 */

public class Exception {
    private void tryTest(int a){
        try {
            if (a == 1) {
                throw new IOException("ioexception测试");
            }
        }catch (IOException e){
            System.out.println(e.getMessage() + "\n" + e.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Exception ex = new Exception();
        int a = 1;
        ex.tryTest(a);
    }
}
