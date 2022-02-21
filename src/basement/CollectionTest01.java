package basement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/21 10:37
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection arr = new ArrayList();
        arr.add(12);
        arr.add("dsjf");
        arr.add("45");
        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        arr.remove(12);
        System.out.println(arr.size());
        arr.clear();
        System.out.println(arr.size());
    }

}
