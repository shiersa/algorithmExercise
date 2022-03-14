package exercise.nowcoder.huawei;

import utils.PrintStr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 描述
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 *
 * 数据范围： 1 ≤ n ≤ 1000
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
 *
 * 示例1
 * 输入：
 * ABCabc
 * A
 * 输出：
 * 2
 */
public class HJ2 {
    public static void main(String[] args) throws Exception{
        Long startTime = System.currentTimeMillis();
        solution2();
        Long endTime = System.currentTimeMillis();
        PrintStr.printEndLine();
        System.out.println((endTime - startTime) / 1000 + " ms" );

    }

    public static void solution1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toLowerCase().toCharArray();
        char[] chars2 = br.readLine().toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] == chars2[0]){
                count ++;
            }
        }
        System.out.println(count);
    }

    public static void solution2() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toLowerCase().toCharArray();
        char c = br.readLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] == c){
                count ++;
            }
        }
        System.out.println(count);
    }


}
