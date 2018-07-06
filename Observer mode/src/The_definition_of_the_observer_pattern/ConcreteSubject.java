package The_definition_of_the_observer_pattern;

/**
 * Created by cxy on 2018/7/6.
 */
public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething(){
        /*
		* do something
		*/
        super.notifyObservers();
    }
}
