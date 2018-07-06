package Who_sent_the_spy_around_han_feizi;

/**
 * Created by cxy on 2018/7/6.
 */
public class Client3 {
    public static void main(String[] args){
        //三个观察者产生出来
        Observer lisi = new LiSi2();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
        //定义出韩非子
        HanFeiZi3 hanFeiZi = new HanFeiZi3();
        //我们后人根据历史， 描述这个场景， 有三个人在观察韩非子
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
    }
}
