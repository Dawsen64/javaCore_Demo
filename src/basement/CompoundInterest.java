package basement;

/**
 * @Author:  zqiusen@qq.com
 * @Date: 2022/2/12 21:27
 */
//test合并
public class CompoundInterest {
    //利率rat
    double[] rat = {0.1, 0.11, 0.12, 0.13, 0.14, 0.15};
    //value table
    final short irow = 10;
    final short icolumn = 6;
    double[][] table = new double[irow][icolumn];
    //构造方法，初始化第一行
    CompoundInterest(){
        for (int i =0; i < icolumn; i++)
        {
            table[0][i] = 10000;
        }
    }
    //根据数据建表
    void creatTable()
    {
        for (int i = 1; i < irow; i++)
        {
            for (int j = 0; j < icolumn; j++)
            {
                table[i][j] = table[i-1][j]*(1+rat[j]);
            }
        }
    }
    void printTable()
    {
        for (double[] erow: table)
        {
            for (double ele: erow)
            {
                System.out.printf("%.2f  ", ele);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        CompoundInterest demo = new CompoundInterest();
        demo.creatTable();
        demo.printTable();
    }
    //02/13测试提取拉取的功能
    //增加
}
