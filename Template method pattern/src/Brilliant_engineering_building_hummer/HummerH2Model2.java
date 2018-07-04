package Brilliant_engineering_building_hummer;

/**
 * Created by cxy on 2018/7/4.
 */
public class HummerH2Model2 extends HummerModel2 {
    //汽车发动
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    //停车
    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    //H2型号的悍马车鸣笛
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    //引擎轰鸣声
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

}
