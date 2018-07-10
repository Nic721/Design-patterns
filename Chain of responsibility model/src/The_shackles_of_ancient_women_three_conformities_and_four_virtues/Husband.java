package The_shackles_of_ancient_women_three_conformities_and_four_virtues;

/**
 * Created by cxy on 2018/7/10.
 */
public class Husband implements IHandler {
    //妻子向丈夫请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是： "+women.getRequest());
        System.out.println("丈夫的答复是： 同意");
    }
}
