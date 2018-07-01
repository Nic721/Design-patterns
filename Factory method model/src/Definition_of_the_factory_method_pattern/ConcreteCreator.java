package Definition_of_the_factory_method_pattern;

/**
 * Created by cxy on 2018/7/1.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            //异常处理
        }
        return (T) product;
    }
}
