package An_extension_of_the_observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cxy on 2018/7/6.
 */
public class LiSi implements Observer {
    //首先李斯是个观察者， 一旦韩非子有活动， 他就知道， 他就要向老板汇报
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("李斯： 观察到韩非子活动， 开始向老板汇报了...");
        this.reportToQinShiHuang(obj.toString());
        System.out.println("李斯： 汇报完毕...\n");
    }
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯： 报告， 秦老板！ 韩非子有活动了--->"+reportContext);
    }
}
