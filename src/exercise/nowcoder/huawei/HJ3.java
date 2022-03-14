package exercise.nowcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 描述
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * <p>
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 * <p>
 * 示例1
 * 输入：
 * 3
 * 2
 * 2
 * 1
 * 输出：
 * 1
 * 2
 * 说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到1000之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 2
 * 1
 * 所以样例的输出为：
 * 1
 * 2
 */
public class HJ3 {
    public static void main(String[] args) throws Exception {
        solution1();
    }

    public static void solution1() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (bufferedReader.readLine() != null) {
            int totalNumCount = Integer.valueOf(bufferedReader.readLine());
            Set<Integer> integerSet = new TreeSet<Integer>();
            int i = 0;
            while (i < totalNumCount) {
                Integer intValue = Integer.valueOf(bufferedReader.readLine());
                integerSet.add(intValue);
                i++;
            }
            Iterator iterator = integerSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    public static void solution2() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            boolean[] stu = new boolean[1001];
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                stu[Integer.parseInt(bf.readLine())] = true;
            }
            for (int i = 0; i < 1001; i++) {
                if (stu[i]) {
                    sb.append(i).append("\n");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }

    public static void solution3(){
        Scanner sc = new Scanner(System.in);
        //获取个数
        int num = sc.nextInt();
        //创建TreeSet进行去重排序
        TreeSet set = new TreeSet();
        //输入
        for(int i =0 ; i < num ;i++){
            set.add(sc.nextInt());
        }

        //输出
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
