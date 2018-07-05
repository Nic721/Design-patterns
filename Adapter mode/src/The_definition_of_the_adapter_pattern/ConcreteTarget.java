package The_definition_of_the_adapter_pattern;

/**
 * Created by cxy on 2018/7/5.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
