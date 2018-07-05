package The_definition_of_the_adapter_pattern;

/**
 * Created by cxy on 2018/7/5.
 */
public class Client {
    public static void main(String[] args){
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
