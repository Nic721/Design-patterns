package the_definition_of_abstract_factory_model;

/**
 * Created by cxy on 2018/7/2.
 */
public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    //只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
