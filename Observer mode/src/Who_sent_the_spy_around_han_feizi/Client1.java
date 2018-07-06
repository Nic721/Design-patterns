package Who_sent_the_spy_around_han_feizi;

/**
 * Created by cxy on 2018/7/6.
 */
public class Client1 {
    public static void main(String[] args) throws InterruptedException{
        //定义出韩非子和李斯
        LiSi1 liSi = new LiSi1();
        HanFeiZi1 hanFeiZi = new HanFeiZi1();
        //观察早餐
        Watch watchBreakfast = new Watch(hanFeiZi,liSi,"fun");
        watchBreakfast.start();
        //然后我们看看韩非子在干什么
        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
        //韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
