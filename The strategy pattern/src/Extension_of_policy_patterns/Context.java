package Extension_of_policy_patterns;

/**
 * Created by cxy on 2018/7/10.
 */
public class Context {
    private Calculator3 cal = null;
    public Context(Calculator3 _cal){
        this.cal = _cal;
    }
    public int exec(int a, int b, String symbol){
        return this.cal.exec(a,b);
    }
}
