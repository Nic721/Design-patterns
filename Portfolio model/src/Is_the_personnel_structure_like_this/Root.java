package Is_the_personnel_structure_like_this;

import java.util.ArrayList;

/**
 * Created by hcxy on 18/7/8.
 */
public class Root implements IRoot {
    //保存根节点下的树枝节点和树叶节点， Subordinate的意思是下级
    private ArrayList subordinateList = new ArrayList();
    //根节点的名称
    private String name = "";
    //根节点的职位
    private String position = "";
    //根节点的薪水
    private int salary = 0;
    //通过构造函数传递进来总经理的信息
    public Root(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    //得到自己的信息
    @Override
    public String getInfo() {
        String info = "";
        info = "名称:"+this.name;
        info = info + "\t职位:"+this.position;
        info = info + "\t薪水:"+this.salary;
        return info;
    }

    //增加树枝节点
    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }
    //增加叶子节点， 比如秘书， 直接隶属于总经理
    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }
    //得到下级的信息
    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
