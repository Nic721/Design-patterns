package An_extension_of_the_observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cxy on 2018/7/6.
 */
public class LiuSi implements Observer {
    //刘斯， 观察到韩非子活动后， 自己也得做一些事
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("刘斯： 观察到韩非子活动， 开始动作了...");
        this.happy(obj.toString());
        System.out.println("刘斯： 乐死了\n");
    }
    //一看韩非子有变化， 他就快乐
    private void happy(String context) {
        System.out.println("刘斯： 因为" + context + ",--所以我快乐呀！ ");
    }
}
