package The_definition_of_decorative_patterns;

/**
 * Created by cxy on 2018/7/6.
 */
public class ConcreteDecorator2 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    private void method2(){
        System.out.println("method2修饰");
    }
    //重写父类的Operation方法
    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
