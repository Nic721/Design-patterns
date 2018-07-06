package Who_sent_the_spy_around_han_feizi;

/**
 * Created by cxy on 2018/7/6.
 */
public interface Observable {
    //增加一个观察者
    public void addObserver(Observer observer);
    //删除一个观察者
    public void deleteObserver(Observer observer);
    //既然要观察， 我发生改变了他也应该有所动作， 通知观察者
    public void notifyObservers(String context);
}
