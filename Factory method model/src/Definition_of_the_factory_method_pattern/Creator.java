package Definition_of_the_factory_method_pattern;

/**
 * Created by cxy on 2018/7/1.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
