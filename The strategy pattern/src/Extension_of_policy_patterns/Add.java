package Extension_of_policy_patterns;

/**
 * Created by cxy on 2018/7/10.
 */
public class Add implements Calculator3 {
    //加法运算
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
