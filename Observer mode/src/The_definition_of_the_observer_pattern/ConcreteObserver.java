package The_definition_of_the_observer_pattern;

/**
 * Created by cxy on 2018/7/6.
 */
public class ConcreteObserver implements Observer {
    //实现更新方法
    @Override
    public void update() {
        System.out.println("接收到信息， 并进行处理！ ");
    }
}
