package The_definition_of_the_builder_model;

/**
 * Created by cxy on 2018/7/4.
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    //构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        /*
		* 设置不同的零件， 产生不同的产品
		*/
        return builder.buildProduct();
    }
}
