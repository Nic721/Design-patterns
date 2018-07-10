package Extension_of_policy_patterns;

import java.util.Arrays;

/**
 * Created by cxy on 2018/7/10.
 */
public class Client4 {
    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为： "+ Arrays.toString(args));
        System.out.println("运行结果为： "+a+symbol+b+"="+Calculator.ADD.exec(a,b));
    }
}
