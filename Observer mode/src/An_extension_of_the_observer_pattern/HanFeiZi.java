package An_extension_of_the_observer_pattern;

import Who_sent_the_spy_around_han_feizi.IHanFeiZi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cxy on 2018/7/6.
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子： 开始吃饭了...");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }
    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子： 开始娱乐了...");
        //通知所有的观察者
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
