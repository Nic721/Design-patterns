package Is_it_easy_for_liu_bei_jiangdong_to_marry_his_wife;

/**
 * Created by cxy on 2018/7/10.
 */
public class Context {
    //构造函数， 你要使用哪个妙计
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    //使用计谋了， 看我出招了
    public void operate() {
        this.strategy.operate();
    }
}
