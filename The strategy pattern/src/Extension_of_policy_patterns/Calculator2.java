package Extension_of_policy_patterns;

/**
 * Created by cxy on 2018/7/10.
 */
public class Calculator2 {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减符号
    private final static String SUB_SYMBOL = "-";
    public int exec(int a,int b,String symbol){
        return symbol.equals(ADD_SYMBOL)?a+b:a-b;
    }
}
