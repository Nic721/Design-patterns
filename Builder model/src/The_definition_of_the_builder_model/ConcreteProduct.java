package The_definition_of_the_builder_model;

/**
 * Created by cxy on 2018/7/4.
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    //设置产品零件
    @Override
    public void setPart() {
        /*
		* 产品类内的逻辑处理
		*/
    }

    //组建一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
}
