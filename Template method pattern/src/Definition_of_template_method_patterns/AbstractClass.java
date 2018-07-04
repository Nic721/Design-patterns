package Definition_of_template_method_patterns;

/**
 * Created by cxy on 2018/7/4.
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    //基本方法
    protected abstract void doAnything();
    //模板方法
    public void templateMethod(){
        /*
		* 调用基本方法， 完成相关的逻辑
		*/
        this.doAnything();
        this.doSomething();
    }
}
