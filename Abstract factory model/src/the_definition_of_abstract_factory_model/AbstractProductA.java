package the_definition_of_abstract_factory_model;

/**
 * Created by cxy on 2018/7/2.
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod(){

    }
    //每个产品相同方法， 不同实现
    public abstract void doSomething();
}
