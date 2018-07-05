package The_definition_of_the_adapter_pattern;

/**
 * Created by cxy on 2018/7/5.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
