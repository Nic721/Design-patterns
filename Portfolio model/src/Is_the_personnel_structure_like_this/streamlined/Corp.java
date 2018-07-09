package Is_the_personnel_structure_like_this.streamlined;

/**
 * Created by cxy on 2018/7/9.
 */
public abstract class Corp {
    //公司每个人都有名称
    private String name = "";
    //公司每个人都职位
    private String position = "";
    //公司每个人都有薪水
    private int salary = 0;
    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    //获得员工信息
    public String getInf(){
        String info = "";
        info = "姓名:"+this.name;
        info = info + "\t职位:"+this.position;
        info = info + "\t薪水:"+this.salary;
        return info;
    }
}
