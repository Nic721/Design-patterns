package An_extension_of_the_template_method_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by cxy on 2018/7/4.
 */
public class Client {
    public static void main(String[] args){
        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响？ 0-不需要 1-需要");
        String type = null;
        try {
            type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HummerH1Model h1 = new HummerH1Model();
        if(type.equals("0")){
            h1.setAlarmFlag(false);
        }
        h1.run();
        System.out.println("\n-------H2型号悍马--------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
