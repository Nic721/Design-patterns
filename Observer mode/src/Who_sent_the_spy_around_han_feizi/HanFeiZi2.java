package Who_sent_the_spy_around_han_feizi;

/**
 * Created by cxy on 2018/7/6.
 */
public class HanFeiZi2 implements IHanFeiZi {
    //把李斯声明出来
    private ILiSi lisi = new LiSi1();
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        //通知李斯
        this.lisi.update("韩非子在吃饭");
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.lisi.update("韩非子在娱乐");
    }
}
