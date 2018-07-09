package Is_the_personnel_structure_like_this.streamlined;

import java.util.ArrayList;

/**
 * Created by cxy on 2018/7/9.
 */
public class Client {
    //遍历整棵树,只要给我根节点， 我就能遍历出所有的节点
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for(Corp s:subordinateList){
            if(s instanceof Leaf){ //是员工就直接获得信息
                info = info + s.getInf() +"\n";
            }else{ //是个小头目
                info = info +s.getInf() +"\n"+getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
