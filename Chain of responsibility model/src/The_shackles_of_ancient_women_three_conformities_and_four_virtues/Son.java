package The_shackles_of_ancient_women_three_conformities_and_four_virtues;

/**
 * Created by cxy on 2018/7/10.
 */
public class Son implements IHandler {
    //母亲向儿子请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是： "+women.getRequest());
        System.out.println("儿子的答复是： 同意");
    }
}
