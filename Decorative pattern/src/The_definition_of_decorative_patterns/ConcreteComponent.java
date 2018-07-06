package The_definition_of_decorative_patterns;

/**
 * Created by cxy on 2018/7/6.
 */
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
