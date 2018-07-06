package The_definition_of_the_observer_pattern;

/**
 * Created by cxy on 2018/7/6.
 */
public class Client {
    public static void main(String[] args){
        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //定义一个观察者
        Observer obs = new ConcreteObserver();
        //观察者观察被观察者
        subject.addObserver(obs);
        //观察者开始活动了
        subject.doSomething();
    }
}
