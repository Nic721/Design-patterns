package The_definition_of_decorative_patterns;

/**
 * Created by cxy on 2018/7/6.
 */
public abstract class Decorator extends Component {
    private Component component = null;
    //通过构造函数传递被修饰者
    public Decorator(Component component){
        this.component = component;
    }
    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
