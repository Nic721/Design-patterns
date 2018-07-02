package the_definition_of_abstract_factory_model;

/**
 * Created by cxy on 2018/7/2.
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
