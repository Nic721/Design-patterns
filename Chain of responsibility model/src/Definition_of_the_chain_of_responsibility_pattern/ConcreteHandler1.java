package Definition_of_the_chain_of_responsibility_pattern;

/**
 * Created by cxy on 2018/7/10.
 */
public class ConcreteHandler1 extends Handler {
    //定义自己的处理逻辑
    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
    //设置自己的处理级别
    protected Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }
}
