package cn.fay.java;

import java.util.Arrays;

/**
 * Created by fay on 2017/12/27.
 * -XX:+TraceClassLoading
 */
public class Test {
    private static int size = 0;

    public static void main(String[] args) {
        test(4);
        System.out.println("size:" + size);
    }

    private static void test(int size) {
        long start = System.currentTimeMillis();
        int[][] arr = new int[size][size];
        recursive(arr, 0, 0);
        System.out.println(size + "皇后用时:" + (System.currentTimeMillis() - start) + " ms");
    }

    private static void recursive(int[][] arr, int startH, int now) {
        if (now == arr.length) {
            System.out.println(toString(arr));
            System.out.println("-----------------");
            size++;
            return;
        }
        for (int h = startH; h < arr.length; h++) {
            for (int w = 0; w < arr[0].length; w++) {
                if (doTry(arr, h, w)) { // success one point
                    int[][] copy = copy(arr);
                    recursive(copy, h + 1, now + 1);
                    arr[h][w] = 0; // reset
                }
            }
        }
    }

    private static boolean doTry(int[][] arr, int h, int w) {
        for (int i = 0; i < arr.length; i++) {
            if (i != h) {
                int vet = Math.abs(i - h);
                if (w >= vet) {
                    if (arr[i][w - vet] == 1) {
                        return false;
                    }
                }
                if (w + vet < arr.length) {
                    if (arr[i][w + vet] == 1) {
                        return false;
                    }
                }
            }
            if (arr[h][i] == 1) {
                return false;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[j][w] == 1) {
                return false;
            }
        }
        arr[h][w] = 1;
        return true;
    }

    private static String toString(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    private static int[][] copy(int[][] origin) {
        int[][] copy = new int[0][0];
        if (origin != null && origin.length > 0) {
            copy = new int[origin.length][origin[0].length];
            for (int i = 0; i < origin.length; i++) {
                copy[i] = Arrays.copyOf(origin[i], origin[i].length);
            }
        }
        return copy;
    }

}
