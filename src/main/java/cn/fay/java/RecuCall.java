package cn.fay.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/14 下午6:12.
 */
public class RecuCall {
    private static int count = 0;

    public static void main(String[] args) {
        recursive("", Arrays.asList("1", "2", "3", "4", "5", "6", "8", "9"));
        System.out.println("count:" + count);
    }

    private static void recursive(String str, List<String> remain) {
        if (remain == null || remain.size() == 0) {
            System.out.println(str);
            count++;
            return;
        }
        for (String s : remain) {
            str += s; // set
            List<String> temp = new ArrayList<>(remain);
            temp.remove(s);
            recursive(str, temp);
            str = str.substring(0, str.length() - s.length()); // reset
        }

    }

}
