package An_extension_of_the_template_method_pattern;

/**
 * Created by cxy on 2018/7/4.
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    //默认没有喇叭的

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
