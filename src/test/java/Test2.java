import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/14 下午7:01.
 */
public class Test2 {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        int n = 1073741824;
        System.out.println("0:" + Integer.toBinaryString(n));//
        n |= n >>> 1;// least 11
        System.out.println("1:" + Integer.toBinaryString(n));//
        n |= n >>> 2;// least 1111
        System.out.println("2:" + Integer.toBinaryString(n));//
        n |= n >>> 4;//least
        System.out.println("4:" + Integer.toBinaryString(n));//
        n |= n >>> 8;//":" +
        System.out.println("8:" + Integer.toBinaryString(n));//
        n |= n >>> 16;//":" +
        System.out.println("F:" + Integer.toBinaryString(n));//
    }

    @Test
    public void testtt() {
        System.out.println(TimeUnit.SECONDS.toNanos(-1));
    }

    @Test
    public void ttest() throws IOException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleWithFixedDelay(() -> System.out.println("A"), 3, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("B");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 3, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("C");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 3, 1, TimeUnit.SECONDS);
        System.in.read();
    }
}
