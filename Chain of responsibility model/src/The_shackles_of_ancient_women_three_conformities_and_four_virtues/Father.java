package The_shackles_of_ancient_women_three_conformities_and_four_virtues;

/**
 * Created by cxy on 2018/7/10.
 */
public class Father implements IHandler {
    //未出嫁的女儿来请示父亲
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是： "+women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
