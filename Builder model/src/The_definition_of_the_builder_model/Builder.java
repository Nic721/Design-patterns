package The_definition_of_the_builder_model;

/**
 * Created by cxy on 2018/7/4.
 */
public abstract class Builder {
    //设置产品的不同部分， 以获得不同的产品
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
