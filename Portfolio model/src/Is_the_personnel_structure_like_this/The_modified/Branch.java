package Is_the_personnel_structure_like_this.The_modified;

import java.util.ArrayList;

/**
 * Created by cxy on 2018/7/9.
 */
public class Branch implements IBranch {
    //领导也是人， 也有名字
    private String name = "";
    //领导和领导不同， 也是职位区别
    private String position = "";
    //领导也是拿薪水的
    private int salary = 0;
    //领导下边有哪些下级领导和小兵
    ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
    //通过构造函数传递领导的信息
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    //增加一个下属， 可能是小头目， 也可能是个小兵
    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }
    //我有哪些下属
    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }
    //领导也是人， 他也有信息
    @Override
    public String getInfo() {
        String info = "";
        info = "姓名:"+this.name;
        info = info + "\t职位:"+this.position;
        info = info + "\t薪水:"+this.salary;
        return info;
    }
}
