package cn.fay.java;


import org.ansj.splitWord.analysis.ToAnalysis;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

/**
 * Created by fay on 2018/1/4.
 */
public class RobotTest {
    public static void main(String[] args) throws Exception {
        System.out.println(args);
        Byte[] bytes2 = new Byte[0];
        System.out.println(bytes2);
        System.out.println(new byte[0]);
        System.out.println(new short[0]);
        System.out.println(new int[0]);
        System.out.println(new long[0]);
        System.out.println(new float[0]);
        System.out.println(new double[0]);
        System.out.println(new boolean[0]);
    }

    public String test(String name) {
        return name;
    }
}
