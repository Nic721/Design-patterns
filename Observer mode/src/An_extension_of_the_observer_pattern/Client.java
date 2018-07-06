package An_extension_of_the_observer_pattern;

/**
 * Created by cxy on 2018/7/6.
 */
public class Client {
    public static void main(String[] args){
        //定义出韩非子和李斯
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        LiuSi liuSi = new LiuSi();
        WangSi wangSi = new WangSi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
