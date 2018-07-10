package Extension_of_policy_patterns;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cxy on 2018/7/10.
 */
public class Client3 {
    //加符号
    public final static String ADD_SYMBOL = "+";
    //减符号
    public final static String SUB_SYMBOL = "-";
    public static void main(String[] args) {
        //输入的两个参数是数字
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String symbol = scanner.next();
        int b = scanner.nextInt();
        //上下文
        Context context = null;
        //判断初始化哪一个策略
        if(symbol.equals(ADD_SYMBOL)){
            context = new Context(new Add());
        }else if(symbol.equals(SUB_SYMBOL)){
            context = new Context(new Sub());
        }
        System.out.println("运行结果为： "+a+symbol+b+"="+context.exec(a,b,symbol));
    }
}
