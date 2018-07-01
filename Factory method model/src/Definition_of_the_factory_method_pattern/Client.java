package Definition_of_the_factory_method_pattern;

/**
 * Created by cxy on 2018/7/1.
 */
public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
		* 继续业务处理
		*/
    }
}
