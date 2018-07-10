package Definition_of_policy_patterns;

/**
 * Created by cxy on 2018/7/10.
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
