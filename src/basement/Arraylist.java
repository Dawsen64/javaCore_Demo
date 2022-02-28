package basement;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Iterator;

/**
 * @Author: zqiusen@qq.com
 * @Date: 2022/2/14 12:43
 */

public class Arraylist {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("987"));
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(i);
        }
        Integer[] array = new Integer[10];
        array = a.toArray(array);
        for(Integer ele: array){
            System.out.print(ele + " ");
        }
        //iteroter
        System.out.println("==========================");
        Iterator it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
