package The_definition_of_decorative_patterns;

/**
 * Created by cxy on 2018/7/6.
 */
public class Client {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //修饰后运行
        component.operate();
    }
}
